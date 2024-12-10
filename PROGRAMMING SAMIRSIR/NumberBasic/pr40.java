package NumberBasic;
import java.util.Scanner;
public class pr40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        productOfDigit(n);
        sc.close();
    }
    public static void productOfDigit(int n){
      int rem,prodct=1;
        while (n>0) {
            rem=n%10;
            prodct=prodct*rem;
            n=n/10;
        }
        System.out.println("Product Of Digit :"+prodct);
    }
}
