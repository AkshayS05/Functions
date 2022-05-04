import java.util.Scanner;

public class CheckEven {
    public static void checkEven(int a) {

            if(a%2==0){
                System.out.println("Number is Even");
            }else{
                System.out.println("Number is not Even");
            }

    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        checkEven(a);
    }


}
