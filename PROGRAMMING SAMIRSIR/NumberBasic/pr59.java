package NumberBasic;
import java.util.Scanner;
public class pr59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary Number :");
        int bin=sc.nextInt();
        sc.close();
        if (isCorrect(bin)) {
            binToDec(bin);
        }
        else{
            System.out.println("Invalid");
        }
    }
    static boolean isCorrect(int bin){
        while (bin>0) {
            int rem=bin%10;
            if (!(rem==0||rem==1)) {
                return false; 
            }
            bin=bin/10;
        }
        return true;
    }
    static void binToDec(int bin){
        int dec=0,p=0,n=2,rem,power;
        while (bin>0) {
            rem=bin%10;
            power=(int) Math.pow(n,p);
            dec=dec+rem*power;
            bin=bin/10;
            p++;            
        }
        System.out.println("Binary To Decimal :"+dec);
    }
}



// import java.util.Scanner;
// public class pr59 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Binary Number :");
//         int bin=sc.nextInt();
//         binToDec(bin);
//         sc.close();
//     }
//     static void binToDec(int bin){
//         int dec=0,p=1,rem;
//         while (bin>0) {
//             rem=bin%10;
//            dec=dec+rem*p;
//             bin=bin/10;
//             p=p*2;     
//         }
//         System.out.println("Binary To Decimal :"+dec);
//     }
// }




// import java.util.Scanner;
// public class pr59 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Binary Number :");
//         int bin=sc.nextInt();
//         binToDec(bin);
//         sc.close();
//     }
//     static void binToDec(int bin){
//         int dec=0,p=0,n=2,rem,pow;
//         while (bin>0) {
//             rem=bin%10;
//             pow=power(n,p);
//             dec=dec+rem*pow;
//             bin=bin/10;
//             p++;            
//         }
//         System.out.println("Binary To Decimal :"+dec);
//     }

//     static int power(int n,int p){
//         int power=1;
//         for(int i=1;i<=p;i++){
//             power=power*n;
//         }
//         return power;
//     }
// }