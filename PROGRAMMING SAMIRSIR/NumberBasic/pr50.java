package NumberBasic;
//wap to print nearest prime number
import java.util.Scanner;
public class pr50 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter The Nth Values :");
            int n=sc.nextInt();
            int pre=n-1;
            int next=n+1;
            while (true) {
                boolean res1=isPrime(n);
                if (res1==true) {
                    System.out.println(n);
                    break;
                }
                boolean res2=isPrime(pre);
                if (res2==true) {
                    System.out.println(pre);
                    break;
                }
                boolean res3=isPrime(next);
                if (res3==true) {
                    System.out.println(next);
                    break;
                }
                pre--;
                next++;
            }
            
        sc.close();
    }

    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
