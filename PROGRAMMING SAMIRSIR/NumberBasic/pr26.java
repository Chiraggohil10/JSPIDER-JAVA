package NumberBasic;
//sum of odd digit
import java.util.Scanner;
public class pr26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int rem,sum=0;
        while (n>0) {
            rem=n%10;
            if (rem%2!=0) {
                sum=sum+rem;
            }
            n=n/10;
        }
        System.out.println(sum);
        
        sc.close();
    }
}
//      345>0
// while (n>0) {
//       5=345%10
//     rem=n%10;
//           5%2!=0 true
//     if (rem%2!=0) {
//         5  = 0 + 5
//         sum=sum+rem;
//     }
//    34=345/10
//     n=n/10;
// }