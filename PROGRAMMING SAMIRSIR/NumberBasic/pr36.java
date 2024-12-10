package NumberBasic;
import java.util.Scanner;
public class pr36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        strong(n);
        sc.close();
    }
    static void strong(int n){
        int temp=n,sum=0,rem;
        while (n>0) {
            rem=n%10;
            int fact=fact(rem);
            sum=sum+fact;
            n=n/10;
        }
        if (sum==temp) {
            System.out.println(temp+" :strong number");
        }
        else{
            System.out.println(temp+" :not strong");
        }
    }


    static int fact(int rem){
        int fact=1;
        for(int i=1;i<=rem;i++){
            fact=fact*i;
        }
        return fact;
        
    }
}
