package NumberBasic;
//12345
import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        int rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            // finds the last digit of the given number
            rem = n % 10;
            // adds last digit to the variable sum
            sum = sum + rem;
            // removes the last digit from the number
            n = n / 10;
        }
        // prints the result
        System.out.println("Sum of Digits: " + sum);
        sc.close();
    }
}

//      765 > 0
// while (n > 0) {
//          5  = 765%10
//     int rem = n%10;
//          5  = 0 + 5
//      sum=sum+rem;
//      n = n / 10;
//     76 = 765/10
//  }

//       76 > 0
// while (n > 0) {
//          6  = 76%10
//     int rem = n%10;
//      11 = 5 + 6
//      sum=sum+rem;
//      n = n / 10;
//      7 = 76/10
//  }

//        7 > 0
// while (n > 0) {
//          7  = 7%10
//     int rem = n%10;
//      18 = 11 + 7
//      sum=sum+rem;
//      n = n / 10;
//      0 = 7/10
//  }


//        0 > 0
// while (n > 0) {
//         condition false
//  }