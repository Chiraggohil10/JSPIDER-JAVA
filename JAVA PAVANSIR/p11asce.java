public class p11asce {
    static void dispasce(int a){
        System.out.println(a);
        if (a<5) {
            a++;
            dispasce(a);
        }
    }
    public static void main(String[] args) {
        dispasce(1);
    }
}
