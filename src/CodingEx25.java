public class CodingEx25 {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //remember that you can subtract using while too
        //division is sequence of successive subtractions
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }
}
