public class CodingEx27 {
    public static void main(String[] args) {
        printSquare(5);
    }
    public static void printSquare(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {

            //number = numRow = numColumn
            for (int i = 0; i < number; i++) {//rows
                for (int j = 0; j < number; j++) {//columns
                    if (i == 0 || i == number - 1) {
                        System.out.print("*");
                    } else {
                        if (j == 0 || j == number - 1) {
                            System.out.print("*");
                        } else if (j == i) {
                            System.out.print("*");
                        } else if (j == ((number - 1) - (i))) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
