import java.util.Scanner;

public class GreatestOfTwo {
public static void printGreatest(int a, int b) {
    if(a>b){
        System.out.println(a + "is the greater one");

    }else if(a==b){
        System.out.println("Both are equal");
    }else{
        System.out.println(b + "is the greater one");
    }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        printGreatest(a,b);
    }


}
