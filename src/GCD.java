import java.util.Scanner;

public class GCD {
    public static void findGCD(int a, int b) {
        int i=2;
        int highestFactor=0;
        while(i<=a &&i<=b){
            if(a%i==0 && b%i==0){
                highestFactor=i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println("GCD is :"+ highestFactor);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();

        findGCD(a,b);
    }


}
