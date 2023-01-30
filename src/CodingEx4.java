public class CodingEx4 {
    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && hourOfDay >= 0 && hourOfDay <= 23){
            if(hourOfDay > 22 || hourOfDay < 8){
                return true;
            }
            return false;
        }

            return false;
    }
}
