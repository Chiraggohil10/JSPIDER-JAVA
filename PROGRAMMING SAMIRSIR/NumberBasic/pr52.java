package NumberBasic;
import java.util.Scanner;
public class pr52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        int temp=n;
        if (isMagicNumber(n)) {
            System.out.println(temp+": Is a Magic Number");
        }
        else{
            System.out.println(temp+": Not a Magic Number");
        }
        sc.close();
    }

    static boolean isMagicNumber(int n){
        while (n>9) {
            int rem,sum=0; 
        while (n>0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        n=sum;
    }
    if (n==1) {
        return true;    
    }
    else{
        return false;
    }
    }
}

// import java.util.Scanner;
// public class pr52 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Number :");
//         int n=sc.nextInt();
//         int temp=n;
//         int res=isMagicNumber(n);
//         if (res==1) {
//             System.out.println(temp+": Is a Magic Number");
//         }
//         else{
//             System.out.println(temp+": Not a Magic Number");
//         }
//         sc.close();
//     }

//     static int isMagicNumber(int n){
//         int rem,sum=0;
//         while (n>0||sum>9) {
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
