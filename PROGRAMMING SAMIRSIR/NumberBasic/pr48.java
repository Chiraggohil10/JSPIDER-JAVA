package NumberBasic;
import java.util.Scanner;
public class pr48 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The N Values :");
        int n=sc.nextInt();
        int count=0,i=2;
        while (true) {
            boolean res=isPrime(i);
            if (res==true) {
                System.out.print(i+" ");
                count++;
            }
            if (count==n) {
                break;
            }
            i++;
        }
        sc.close();
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}



// import java.util.Scanner;
// public class pr48 {
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The N Values :");
//         int num=sc.nextInt();
//         int count=0;
//         for (int i = 2; count<num; i++) {
//                 if (isPrime(i)) {
//                     System.out.print(i+" ");
//                     count++;
//                 }
//         }
//         sc.close();
//     }

//     public static boolean isPrime(int n){
//         for(int i=2;i<=n/2;i++){
//             if (n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

