// add element on particular index
// Enter The  Index :2
// Enter The Element To Add :4
// [2, 4, 5, 6, 7, 8, 8, 9]
// 2  4  4  5  6  7  8  8  9 
import java.util.Scanner;
import java.util.Arrays;

public class Ar21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The  Index :");
        int id = sc.nextInt();
        System.out.print("Enter The Element To Add :");
        int element = sc.nextInt();
        int arr[] = { 2, 4, 5, 6, 7, 8, 8, 9 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == id) {
                System.out.print(element+ " ");
            }
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
