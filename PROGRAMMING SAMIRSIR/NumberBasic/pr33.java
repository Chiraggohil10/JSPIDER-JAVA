package NumberBasic;
import java.util.Scanner;

public class pr33 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int rem, count = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem%2!=0) {
                count++;
            }
            n = n / 10;
            
        }
        System.out.println("Odd Number Count: "+count);

        sc.close();
    }
}

