import java.util.Scanner;

public class AverageOfThreeNumbers {
public static void getAverage(int a, int b, int c) {
    System.out.println((a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        getAverage(a,b,c);
    }


}
