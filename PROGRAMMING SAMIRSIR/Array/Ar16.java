//duplicate elements found
import java.util.Arrays;
import java.util.Scanner;

public class Ar16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Enter Array " + i + " Index Element :");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Value :"+Arrays.toString(arr));

		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i+1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println("Duplicate Elements Are Found "+ arr[i] +" at index "+i);
				}
			}
		}
		System.out.println("Number Of DuPlicate Elments :"+count);
		sc.close();
    }
}
