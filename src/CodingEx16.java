public class CodingEx16 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        int op = number;
        int reverse = 0;
        int lastDigit = 0;
        while(number >9){
            lastDigit = number%10;
            reverse += lastDigit;
            reverse *= 10;
            number/= 10;
        }
        reverse+= number;
        return reverse == op;
    }
}
