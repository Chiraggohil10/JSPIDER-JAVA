public class p12 {
    static void disp(int n){
        System.out.println(n);
        if (n<90) {
            n=n+9;
            disp(n);
        }
    }
    public static void main(String[] args) {
        disp(9);
    }
}
