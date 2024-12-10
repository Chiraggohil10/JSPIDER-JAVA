package NumberBasic;

//wap to count how many even digit present
import java.util.Scanner;

public class pr25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int rem, count = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem%2==0) {
                count++;
            }
            n = n / 10;
            
        }
        System.out.println("Even Number Count"+count);

        sc.close();
    }
}

//     1234 > 0 
// while (n > 0) {
//        4=1234%10
//     rem = n % 10;
//           4%2==0 true
//     if (rem%2==0) {
//         count++; //1
//     }
//   123 = 1234/10
//     n = n / 10;



//      123 > 0 
// while (n > 0) {
//        3=123%10
//     rem = n % 10;
//           3%2==0 false
//     if (rem%2==0) {
//         count++; 
//     }
//    12 = 123/10
//     n = n / 10;



//       12 > 0 
// while (n > 0) {
//        2= 12%10
//     rem = n % 10;
//           2%2==0 true
//     if (rem%2==0) {
//         count++; //1,1
//     }
//     1 = 12/10
//     n = n / 10;


//        1 > 0 
// while (n > 0) {
//       1 =  1%10
//     rem = n % 10;
//           1%2==0 false
//     if (rem%2==0) {
//         count++; //1,1
//     }
//     0 =  1 /10
//     n = n / 10;