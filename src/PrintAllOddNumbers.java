import java.util.Scanner;

public class PrintAllOddNumbers {
    public static void printOdds(int num) {
        for(int i=1; i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        printOdds(num);
    }


}
