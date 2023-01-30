public class CodingEx2 {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42));
        printConversion(1.5);
    }
    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1L;
        }
        long conversion = (long)Math.round(kilometersPerHour/1.609);
        return conversion;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour< 0){
            System.out.println("Invalid Value");
        }else{
            long milesPH = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPH + "mi/h");
        }
    }
}
