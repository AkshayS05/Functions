import java.util.Scanner;

public class CircumferenceOfACircle {
    public static void getCircumference(int radius) {
        System.out.println("the circumference of this circle is :"+ Math.round( 2 * 3.14 * radius));
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int radius= s.nextInt();
        getCircumference(radius);
    }


}
