package NumberBasic;
import java.util.Scanner;

public class pr28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int rem,sum=0;
        while (n>0) {
            rem=n%10;
            if (rem%2==0) {
                sum=sum+rem;
            }
            n=n/10;
        }
        if (sum%2==0) {
            System.out.println("sum is even:"+sum); 
        }
        else{
            System.out.println("sum is odd");
        }
        
        sc.close();
    }
}
