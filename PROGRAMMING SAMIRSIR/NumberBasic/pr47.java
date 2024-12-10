package NumberBasic;
import java.util.Scanner;

public class pr47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        isDisarium(n);
        sc.close();
    }

    public static void isDisarium(int n) {
        int cd = count(n);
        int rem, sum = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + power(rem, cd);
            n = n / 10;
            cd--;
        }
        if (temp == sum) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }
    }

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int power(int rem, int cd) {
        int power = 1;
        for (int i = 1; i <= cd; i++) {
            power = power * rem;
        }
        return power;
    }
}
