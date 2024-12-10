package NumberBasic;
//wap to check the user entered spy number or not
//spy = means sum of each digit and proudct of each digit will be same
import java.util.Scanner;
public class pr24 {
    public static void main(String[] args) {
        int sum = 0, prod = 1, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n = n / 10;
        }
        if (sum == prod) {
            System.out.println("spy number");
        } else {
            System.out.println("not a spy number");
        }
        
        sc.close();
    }
}
