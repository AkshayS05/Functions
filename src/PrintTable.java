import java.util.Scanner;

public class PrintTable {
    private static void printTable(int a) {
        for(int i=1; i<=10; i++){
            System.out.println(a+"X"+ i+"="+ a *i );

        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        printTable(a);
    }


}
