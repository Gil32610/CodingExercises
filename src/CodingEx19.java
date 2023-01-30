public class CodingEx19 {
    public static void main(String[] args) {
    hasSharedDigit(41, 45);
    }
    public static boolean hasSharedDigit(int number1 , int number2){
        if((number1<10) || (number1> 99) ||(number2 < 10) || (number2 >99)) return false;
        int head = number2;
        while(number1 > 0){
            int n1 = number1%10;
        while(head >0){
            int n2 = head%10;
            if(n1 == n2){
                return true;
            }
            head/=10;
        }
        number1/=10;
        head = number2;
        }
        return false;
    }
}
