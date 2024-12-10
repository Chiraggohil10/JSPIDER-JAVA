
// user input in array print the array element
import java.util.Arrays;
import java.util.Scanner;

public class Ar5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // array size input
      System.out.print("Enter Array Size :");
      int size = sc.nextInt();

      int arr[] = new int[size]; // array values input
      for (int i = 0; i <= arr.length - 1; i++) {
         System.out.print("Enter "+i+" Index Element :");
         arr[i] = sc.nextInt();
      }

      System.out.print("Array Value is : "+Arrays.toString(arr)); // array print
      
      sc.close();

   }
}
