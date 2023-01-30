public class CodingEx22 {
    public static void main(String[] args) {

    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second<10) return -1;
        int value = first > second ?  first : second;
        int maxFactor = 0;
        for(int i =1; i<= value; i++){
            if(first%i == 0 && second%i ==0) {
                maxFactor = i;
            }
        }
        return maxFactor;
    }
}
