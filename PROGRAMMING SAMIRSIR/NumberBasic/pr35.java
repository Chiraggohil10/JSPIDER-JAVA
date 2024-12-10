package NumberBasic;
import java.util.Scanner;
class pr35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

}



// import java.util.Scanner;
// public class pr35 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number :");
//         int n=sc.nextInt();
//         prime(n);
//         sc.close();
//     }

//     static void prime(int n){
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if (n%i==0) {
//                 count++;
//             }
//         }
//         if (count==2) {
//             System.out.println(n+": Is Prime Number");
//         }
//         else{
//             System.out.println(n+": Is Not Prime Number");
//         }
//     }
// }


