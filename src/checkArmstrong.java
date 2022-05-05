import java.util.Scanner;

public class checkArmstrong {
    public static boolean isArmstrong(int n) {
        int num = n;
        int sum=0;
        int length = 0;
        while (num>0) {
            num=num/10;
            length++;
        }
        int remainder=0;
        int j=0;
        int ans=0;
        num=n;
        while(j<num){
            remainder= num%10;
            int k=0;
            int multiply=1;
            while(k<length){
                multiply*=remainder;
                k++;
            }
            ans+=multiply;
            num=num/10;
        }
    if(ans==n){
        return true;
    }else{
        return false;
    }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        System.out.println(isArmstrong(n));
    }
}
