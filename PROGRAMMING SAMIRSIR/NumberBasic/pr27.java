package NumberBasic;

//wap to reverse the given number
import java.util.Scanner;

public class pr27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int rem, rev = 0;
        while (n > 0) {
            rem = n % 10;                           // rem=n%10;
            rev = rev * 10 + rem;                   // System.out.print(rem);
            n = n / 10;                             // n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}

//     1234>0
// while (n>0) {
//  4 = 1234%10
// rem=n%10;
//                   4
// System.out.print(rem);
// 123=1234/10
//   n=n/10;
// }



//      1234>0 
// while (n > 0) {
//       4 = 1234%10
//     rem = n % 10;  
//       4 =  0  * 10 + 4                    
//     rev = rev * 10 + rem;  
//    123=1234/10                 
//     n = n / 10;                             
// }

//       123>0 
// while (n > 0) {
//       3 = 123%10
//     rem = n % 10;  
//      43 =  4  * 10 + 3                    
//     rev = rev * 10 + rem;  
//     12=123/10                 
//     n = n / 10;                             
// }

