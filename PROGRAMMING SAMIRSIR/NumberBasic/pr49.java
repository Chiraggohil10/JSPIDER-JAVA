package NumberBasic;
import java.util.Scanner;
public class pr49 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter The Nth Values :");
            int n=sc.nextInt();
            int count=0,i=2;
            while (true) {
                boolean res=isPrime(i);
                if (res==true) {
                    count++;
                }
                if (count==n) {
                    System.out.println(i);
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

// public class pr49 {
//         public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The Nth Values :");
//         int num=sc.nextInt();
//         int count=0;
//         for (int i = 2 ; ; i++) {
//             if (isPrime(i)) {
//                     count++;
//                 }
//                 if (count==num) {
//                     System.out.print(i+" ");
//                     break;
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

