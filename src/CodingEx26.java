public class CodingEx26 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){
        //remember what makes a prime number is the fact that it is only divisible either by
        //itself and 1
        //
        if(number <2)return -1;// can't have prime factor
        int prime = 0;
        for(int i = 2; i <= number; i++){
            if(number %i == 0){// if evenly divisible, factor the number
                number/= i;
                i--;//decrementing counter i to check if the result is still divisible
            }
        }
        return number;
    }
}
