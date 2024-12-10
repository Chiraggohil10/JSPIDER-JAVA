package NumberBasic;
import java.util.Scanner;
public class pr53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        int temp=n;
        if (isHappyNumber(n)) {
            System.out.println(temp+": Is Happy Number");
        }
        else{
            System.out.println(temp+": Is Not Happy Number");
        }
        sc.close();
    }
    static boolean isHappyNumber(int n){
        while (n>9) {
        int rem,sq,sum=0;
        while (n>0) {
            rem=n%10;
            sq=rem*rem;
            sum=sum+sq;
            n=n/10;
        }
        n=sum;
    }
        if (n==1||n==7) {
            return true;
        }
        else{
            return false;
        }
    }
}







// import java.util.Scanner;
// public class pr53 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number :");
//         int n=sc.nextInt();
//         int temp=n;
//         int res=isHappyNumber(n);
//         if (res==1||res==7) {
//             System.out.println(temp+": Is Happy Number");
//         }
//         else{
//             System.out.println(temp+": Is Not Happy Number");
//         }
//         sc.close();
//     }
//     static int isHappyNumber(int n){
//         int rem,sq,sum=0;
//         while (n>0||sum>9) {
//             if (n==0) {
//                 n=sum;
//                 sum=0;
//             }
//             rem=n%10;
//             sq=rem*rem;
//             sum=sum+sq;
//             n=n/10;
//         }
//         return sum;
//     }
// }
