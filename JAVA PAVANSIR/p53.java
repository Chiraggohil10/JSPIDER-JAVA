public class p53 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 14, 15 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("sum is : " + sum);
    }
}
