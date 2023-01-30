public class CodingEx20 {
    public static void main(String[] args) {

    }
   public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(!(isValid(number1) && isValid(number2) && isValid(number3)))return false;
        return number1%10 == number2%10 || number2%10 == number3%10 || number1%10  == number3%10;
   }

   public static boolean isValid(int number){
        return number >=10 && number <= 1000;
   }
}
