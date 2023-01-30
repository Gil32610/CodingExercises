public class CodingEx9 {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius){
        //for a circle
        if(radius< 0){
            return -1d;
        }
        return Math.PI*(radius*radius);

    }
    public static double area (double x, double y){
        // for a rectangle
        if(x < 0){
            return -1d;
        }
        else if(y<0){
            return -1d;
        }
        return x*y;


    }
}
