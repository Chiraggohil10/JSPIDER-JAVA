package NumberBasic;
import java.util.Scanner;
public class duck {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        int rem = 0;
        boolean flag = false;
        while (n > 0) {
            rem = n % 10;
            if (rem == 0) {
                flag = true;
                break;
            }
            n = n / 10;
        }
        System.out.println(flag == true ? "Duck Number" : "Not Duck Number");
        sc.close();
    }
}
