//wap a program to print pair elements whose  sum is equal to given number 
//Enter The Number :9
//                  2 7
//                  3 6
//                  6 3
//                  7 2

import java.util.Scanner;

public class Ar20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        int arr[] = { 2, 3, 4, 6, 7, 2, 3 };

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        sc.close();
    }
}
