package NumberBasic;
import java.util.Scanner;

public class pr29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter The Number : ");
        int n = sc.nextInt();
        int rem, rev = 0,temp=n;
        while (n > 0) {
            rem = n % 10;                           
            rev = rev * 10 + rem;                   
            n = n / 10;                            
        }
       if (rev==temp) {
        System.out.println("palindrom");
       }
       else{
        System.out.println("not palindrom");
       }
        sc.close();
    }
}
      
