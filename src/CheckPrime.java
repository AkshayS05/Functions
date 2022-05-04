import java.util.Scanner;

public class CheckPrime {
    public static void checkPrime(int n){
       for(int i=2; i<n/2; i++){
           if(n%i==0){
               System.out.println("Number is not Prime");
               return;
           }else{
               System.out.println("Number is Prime");
               return;
           }
       }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        checkPrime(n);
    }
}
