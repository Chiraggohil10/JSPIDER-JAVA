//merge array 
// i/p = First Array Is : [11, 22, 33, 55, 88]
// i/p = Second Array Is : [65, 64, 65, 55, 55]
// o/p = Mergred Array Is :[11, 22, 33, 55, 88, 65, 64, 65, 55, 55]
import java.util.Arrays;
import java.util.Scanner;

public class Ar14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter First Array Size :");
        int size1 = sc.nextInt();
        int first[] = new int[size1];
        for (int i = 0; i <= first.length - 1; i++) {
            System.out.print("Enter First Array " + i + " Index Element :");
            first[i] = sc.nextInt();
        }
        System.out.println("First Array Is : "+Arrays.toString(first));
        System.out.println("=====================================");



        System.out.print("Enter Second Array Size :");
        int size2 = sc.nextInt();
        int second[] = new int[size2];
        for (int i = 0; i <= second.length - 1; i++) {
            System.out.print("Enter Second Array " + i + " Index Element :");
            second[i] = sc.nextInt();
        }
        System.out.println("Second Array Is : "+Arrays.toString(second));
        System.out.println("=====================================");


        int sizeM = size1 + size2;
        int merge[] = new int[sizeM];

        for (int i = 0; i <= first.length - 1; i++) {
            merge[i] = first[i];
        }

        for (int j = 0; j <= second.length - 1; j++) {
            merge[(first.length + j)] = second[j];
        }
        System.out.println("Mergred Array Is :" + Arrays.toString(merge));
        sc.close();
    }
}
