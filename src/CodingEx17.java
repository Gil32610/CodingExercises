public class CodingEx17 {
    public static void main(String[] args) {

    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0 ) return -1;
        int start = number%10;
        int end = 0;
        while(number > 0){
            end = number%10;
            number/=10;
        }

        return start + end;
    }
}
