public class CodingEx24 {
    public static void main(String[] args) {
        int number = getDigitCount(1234567898);
        System.out.println(number);
        System.out.println(reverse(5));
    }
    public static void numberToWords(int number){
    if(number<0){
        System.out.println("Invalid Value");
    }else{
        int reverse = reverse(number);
        int digits = getDigitCount(number);
        int difference = digits - getDigitCount(reverse);
        do{
            switch(reverse%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverse/=10;
        }while(reverse !=0);
        if(difference!= 0){
            for(int i = 0; i< difference; i++){
                System.out.println("Zero");
            }
        }

    }
    }
    public static int reverse (int original){
        int reverse = original%10;
        while(original > 9|| original< -9){
            original/=10;
            reverse*=10;
            reverse+= original%10;
        }
    return reverse;
    }
    public static int getDigitCount(int integer){
        if(integer <0) return -1;
        int count = 1;
        while(integer > 9){
            count++;
            integer/= 10;
        }
        return count;
    }
}
