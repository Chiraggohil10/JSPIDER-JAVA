package NumberBasic;

import java.util.Scanner;

// 1234 -> 12+34 -> 46
// 123456 -> 123+456 -> 579
public class Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        int count = countDigit(n);
        int base = 10, sum = 0, first, last, pow;
        if (count % 2 == 0) {
            count = count / 2;
            pow = power(base, count);
            first = n / pow;
            last = n % pow;
            sum = first + last;
        }
        else{
            System.out.print("This is Odd Number ");
        }
        System.out.println(sum);
        sc.close();
    }

    static int power(int base, int count) {
        int pow = 1;
        for (int i = 1; i <= count; i++) {
            pow = pow * base;
        }
        return pow;
    }

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}


// sum of each digit until geting single digit
    // public class Extra {
    //     public static void main(String[] args) {
    //         Scanner sc=new Scanner(System.in);
    //         System.out.print("Enter The Value : ");
    //         int n=sc.nextInt();
    //         n=n%9;
    //         System.out.println("Single Digit Sum : "+n);
    //         sc.close();
    //     }
    // }
