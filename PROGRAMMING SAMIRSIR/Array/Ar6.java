//sum of each digit and replace the array element
import java.util.Arrays;
import java.util.Scanner;

public class Ar6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // array size input
        System.out.print("Enter Array Size :");
        int size = sc.nextInt();

        int arr[] = new int[size]; // array values input
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter "+i+" Index Element :");
            arr[i] = sc.nextInt();
            arr[i]=sumOfEachDigit(arr[i]); // method calling
        }

        System.out.print("Replaced Array: "+Arrays.toString(arr)); // print the array
        
        sc.close();
    }

    static int sumOfEachDigit(int n) {
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}
