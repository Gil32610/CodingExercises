import java.util.Scanner;

public class CodingEx28 {
    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int loopCount = 0;
        int sum = 0;
        long YY = 0;
        int number = 0;
        boolean check = true;
        while (scanner.hasNextInt()){
            sum+=scanner.nextInt();
            loopCount++;
        }
        if(loopCount>0){
            System.out.println("SUM = " + sum + "AVG = " + Math.round((double) sum/loopCount));
        }else{
            System.out.println("SUM = "+sum + " AVG = " + YY);
        }
    }
}
