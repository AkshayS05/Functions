import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n){
        int num=0;
        int sum=1;
        System.out.print(num+ " ");
        for (int i = 2; i <n ; i++) {
            System.out.print(sum +" ");
           int temp=sum;
           sum=num+sum;
           num= temp;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        fibonacci(n);
    }
}
