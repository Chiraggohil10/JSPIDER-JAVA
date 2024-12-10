package NumberBasic;

//=========================================================================================================
//STRONG OR NOT STRONG USING METHOD
//=========================================================================================================

// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         isStrong(n);
//         sc.close();
//     }

//     static void isStrong(int n) {
//         int rem, sum = 0, temp = n;
//         while (n > 0) {
//             rem=n%10;
//             int fact=factorial(rem);
//             sum=sum+fact;
//             n=n/10;
//         }
//         if (sum==temp) {
//             System.out.println("Strong");
//         }
//         else{
//             System.out.println("not Strong");
//         }
//     }

//     static int factorial(int rem){
//         int fact=1;
//         for(int i=1;i<=rem;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
// }


//=========================================================================================================
//PERFECT OR NOT PERFECT USING METHOD
//=========================================================================================================

// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         isPerfect(n);
//         sc.close();
//     }

//     static void isPerfect(int n){
//         int sum=0,temp=n;
//         for(int i=1;i<n;i++){
//             if (n%i==0) {
//                 sum=sum+i;
//             }
//         }
//         if (sum==temp) {
//             System.out.println("perfect");
//         }
//         else{
//             System.out.println("not perfect");
//         }
//     }
// }




//=========================================================================================================
//SUM OF EACH DIGIT AND SUM IS PRIME OR NOT USING METHOD
//=========================================================================================================


// import java.util.Scanner;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         boolean res=isPrime(n);
//         if (res==true) {
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//         sc.close();
//     }

//     static boolean isPrime(int n){
//         int rem,sum=0;
//         while (n>0) {
//             rem=n%10;
//             sum=sum+rem;
//             n=n/10;
//         }
//         for(int i=2;i<=sum/2;i++){
//             if (sum<=1) {
//                 return false;
//             }
//             if (sum%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }

// }    




//=========================================================================================================
//INPUT NUMBER AND EVEN NUMBER SUM 1238 = 2+8 = 10
//=========================================================================================================




// import java.util.Scanner;
// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         int rem,sum=0;
//         while (n>0) {
//             rem=n%10;
//             if (rem%2==0) {
//                 sum=sum+rem;
//             }
//             n=n/10;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }




//=========================================================================================================
//STRONG NUMBER USING METHOD
//=========================================================================================================


import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        isArmStrong(n);
        sc.close();
    }

    public static void isArmStrong(int n) {
        int cd = count(n);
        int rem, sum = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + power(rem, cd);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("ArmStrong Number");
        } else {
            System.out.println("Not ArmStrong Number");
        }
    }

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int power(int rem, int cd) {
        int power = 1;
        for (int i = 1; i <= cd; i++) {
            power = power * rem;
        }
        return power;
    }
}