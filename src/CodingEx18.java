public class CodingEx18 {
    public static void main(String[] args) {
        getEvenDigitSum(243);
    }
    public static int getEvenDigitSum(int number){
        if (number < 0)return -1;
        int current = number%10;
        int sum = 0;
        while(number > 0){
            number/=10;
            if(current%2 ==0){
                sum+= current;
            }
            current = number%10;
        }
        return sum;
    }

}
