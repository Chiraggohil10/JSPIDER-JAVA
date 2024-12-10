package NumberBasic;

//1234
import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : "); //765
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}


//      765 > 0
// while (n > 0) {
//          5  = 765%10
//     int rem = n%10;
//      count++; -> 1
//      n = n / 10;
//     76 = 765/10
//  }

//       76 > 0
// while (n > 0) {
//          6  = 76%10
//     int rem = n%10;
//      count++; -> 1+1
//      n = n / 10;
//      7 = 76/10
//  }

//        7 > 0
// while (n > 0) {
//          7  = 7%10
//     int rem = n%10;
//      count++; -> 1+1+1
//      n = n / 10;
//      0 = 7/10
//  }


//        0 > 0
// while (n > 0) {
//         condition false
//  }