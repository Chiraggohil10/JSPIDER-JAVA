package NumberBasic;
public class pr10 {
    public static void main(String[] args) {
        int a=10,b=200,c=30,d=40;
        int big=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
        System.out.println("big number :"+big);
    }
}
