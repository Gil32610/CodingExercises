public class CodingEx6 {
    public static void main(String[] args) {
        double num1 = 3.175;
        double num2 = 3.176;

        System.out.println(areEqualByThreeDecimalPlaces(num1, num2));
    }
    public static boolean areEqualByThreeDecimalPlaces(double number, double number1){
        if(number == 0.0 && number1 == 0){
            return true;
        }
        int first = (int)((number*1000));
        int second = (int)((number1*1000));
        int result = first - second;
        if(result != 0){
            return false;
        }
        return true;
    }
}
