package NumberBasic;
import java.util.Scanner;

public class pr51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        sumOfDigit(n);
        sc.close();
    }

    static void sumOfDigit(int n){
        while (n>9) {
            int sum=0,rem;
            while (n>0) {
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}



// import java.util.Scanner;
// public class pr51 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number :");
//         int n=sc.nextInt();
//         int res=sumOfDigit(n);
//         System.out.println(res);
//         sc.close();
//     }

//     static int sumOfDigit(int n){
//         int rem,sum=0;
//         while (n>0 || sum>9) {
//             if (n==0) {
//                 n=sum;
//                 sum=0;
//             }
//             rem=n%10;
//             sum=sum+rem;
//             n=n/10;
//         }
//         return sum;
//     }
// }



// Tracing
// =======
//     int rem,sum=0;
//         2578>0 || 0>9
//     while (n>0 || sum>9) {
//          2578==0 false
//         if (n==0) {
//             n=sum;
//             sum=0;
//         }
//         rem=n%10;
//         sum=sum+rem;
//         n=n/10;
//     }
//     return sum; sum=22


//     int rem,sum=0;
//            0>0 || 22>9
//     while (n>0 || sum>9) {
//             0==0 true
//         if (n==0) {
//             n=sum;
//             sum=0;
//         }
//         rem=n%10;
//         sum=sum+rem;
//         n=n/10;
//     }
//     return sum; sum=4


// import java.util.Scanner;
// public class pr51 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number :");
//         int n=sc.nextInt();
//         while(n>9){
//           n=sumOfDigit(n);
//         }
//         System.out.println(n);
//         sc.close();
//     }

//     static int sumOfDigit(int n){
//         int rem,sum=0;
//         while (n>0) {
//             rem=n%10;
//             sum=sum+rem;
//             n=n/10;
//         }
//         return sum;
//     }
// }