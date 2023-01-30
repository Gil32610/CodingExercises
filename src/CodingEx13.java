public class CodingEx13 {
    public static void main(String[] args) {
printNumberInWord(2);
    }
    public static void printNumberInWord(int number){
        String inWord;
                switch (number){
            case 0:
               inWord =  "ZERO";
               break;
            case 1:
               inWord =  "ONE";
               break;
            case 2:
                inWord =  "TWO";
                break;
            case 3:
                inWord =  "THREE";
                break;
            case 4:
                inWord =  "FOUR";
                break;
            case 5:
                inWord = "FIVE";
                break;
            case 6:
                inWord = "SIX";
                break;
            case 7:
                inWord = "SEVEN";
                break;
            case 8:
                inWord = "EIGHT";
                break;
            case 9:
                inWord =  "NINE";
                break;
            default:
                inWord =  "OTHER";
                break;
        }
        System.out.println(inWord);
    }

}
