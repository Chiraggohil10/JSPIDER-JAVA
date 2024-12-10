import java.util.Scanner;

public class armStrong {
    static int count(int n) {
        int rem, count = 0;
        while (n > 0) {
            rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    static int arm(int rem, int pow) {
        int power = 1;
        for (int i = 1; i <= pow; i++) {
            power = power * rem;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int pow = count(n);
        int rem = 0, sum = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + arm(rem, pow);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp+" :Is Armstrong");
        } else {
            System.out.println(temp+" :Is Not Armstrong");
        }
    }
}
