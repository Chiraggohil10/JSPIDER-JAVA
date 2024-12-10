public class p55 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 14 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        int ave=sum/arr.length;
        System.out.println("average : "+ave);
    }
}
