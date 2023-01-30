public class CodingEx8 {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen(int num){
        return num <= 19 && num >= 13;
    }
}
