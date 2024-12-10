public class p10 {
    public static void main(String[] args) {
        int a=10,b=20,c=50,d=40;
        int big=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
        System.out.println(big);
    }
}
