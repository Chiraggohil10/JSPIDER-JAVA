public class p56 {
    public static void main(String[] args) {
        int[] sales = {7500,7200,7300,7250,8000,7300};
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {

            sum = sum + sales[i];

        }
        int ave=sum/sales.length;
        System.out.println("average : "+ave);
    }
}
