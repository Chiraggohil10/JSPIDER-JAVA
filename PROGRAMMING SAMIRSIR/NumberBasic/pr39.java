package NumberBasic;
import java.util.Scanner;
public class pr39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        sumOfDigit(n);
        sc.close();

    }
    public static void sumOfDigit(int n){
        int sum=0,rem;
        while (n>0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum Of Digit :"+sum);
    }
}
