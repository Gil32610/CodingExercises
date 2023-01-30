public class CodingEx5 {
    public static void main(String[] args) {

    }
    public static boolean isLeapYear(int year){
        if(year<1 || year > 9999){
            return false;
        }
        int fourRem = year%4;
        int hunRem = year%100;
        if(fourRem !=0){
            return false;
        }else if(hunRem!=0){
            return true;
        }else{
            if(year%400 != 0){
                return false;
            }
            return true;
        }
    }
}
