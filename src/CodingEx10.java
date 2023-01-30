public class CodingEx10 {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            //1 year = 365 days, 1 day = 24 hours
            long hours = (minutes /60);
            long days = hours/24;
            long years = days/365;
            long remainingDays = days%365;
            System.out.println(minutes + " min = " + years +" y and " + remainingDays + " d");
        }

    }
}
