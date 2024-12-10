package NumberBasic;
import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        int rem, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            // finds the last digit of the given number
            rem = n % 10;
            // adds last digit to the variable mul
            mul = mul * rem;
            // removes the last digit from the number
            n = n / 10;
        }
        // prints the result
        System.out.println("product of Digits: " + mul);
        sc.close();
    }
}


//      765 > 0
// while (n > 0) {
//          5  = 765%10
//     int rem = n%10;
//       5 = 1 * 5
//      mul=mul*rem;
//      n = n / 10;
//     76 = 765/10
//  }

//       76 > 0
// while (n > 0) {
//          6  = 76%10
//     int rem = n%10;
//      30 = 5 * 6
//      mul=mul*rem;
//      n = n / 10;
//      7 = 76/10
//  }

//        7 > 0
// while (n > 0) {
//          7  = 7%10
//     int rem = n%10;
//      210=30 * 7
//      mul=mul*rem;
//      n = n / 10;
//      0 = 7/10
//  }


//        0 > 0
// while (n > 0) {
//         condition false
//  }