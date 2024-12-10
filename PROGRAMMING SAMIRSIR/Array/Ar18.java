// removing the dublicated elements 

import java.util.Arrays;

public class Ar18 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 2, 3 };
        System.out.println("Original Array Value Is : " + Arrays.toString(arr));
        boolean b[] = new boolean[arr.length];
        for (int i = 0; i <= b.length - 1; i++) {
            if (b[i] == false) {
                int count = 1;
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        b[j] = true;
                    }
                }
                if (count == 1)
                    System.out.println(arr[i]);

            }
        }
    }
}
