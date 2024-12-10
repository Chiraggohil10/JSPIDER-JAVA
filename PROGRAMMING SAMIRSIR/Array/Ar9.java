//count how many strong number
import java.util.Arrays;
import java.util.Scanner;
public class Ar9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // array size input
        System.out.print("Enter Array Size :");
        int size = sc.nextInt();
        
        int arr[] = new int[size]; // array values input
        int count=0;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter "+i+" Index Element :");
            arr[i] = sc.nextInt();
            if (countStrong(arr[i])) {
                count++;
            }
        }

        System.out.println("The Array Is: "+Arrays.toString(arr)); // print the array
        
        System.out.println("Count of strong numbers: "+count);
        sc.close();
    }

    static boolean countStrong(int n){
        int sum=0,rem,temp=n;
        while (n>0) {
            rem=n%10;
            int fact=fact(rem);
            sum=sum+fact;
            n=n/10;
        }
        return sum==temp;
    }


    static int fact(int rem){
        int fact=1;
        for(int i=1;i<=rem;i++){
            fact=fact*i;
        }
        return fact;
        
    }
}
