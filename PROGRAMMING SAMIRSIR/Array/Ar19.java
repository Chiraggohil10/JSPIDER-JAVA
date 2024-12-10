// sum of elements giving output as length of array 
// string length 10
// 6 4 = 10 
// 7 3 = 10
public class Ar19 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 2, 3, 7, 6, 5 };
        boolean b[] = new boolean[arr.length];
        for (int i = 0; i <= b.length - 1; i++) {
            if (b[i] == false) {
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[i] == arr[j]) {
                        b[j] = true;
                    }
                    if (arr[i] + arr[j] == arr.length)
                        System.out.println(arr[i] + " " + arr[j]);
                }

            }
        }
    }
}
