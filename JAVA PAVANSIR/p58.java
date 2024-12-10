public class p58 {
    public static void main(String[] args) {
        int[] arr = { 58, 11, 56, 13, 14, 15 };
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large=arr[i];
            }
        }
        System.out.println("largest values : " +large);
    }
}
