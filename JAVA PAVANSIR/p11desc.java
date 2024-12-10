public class p11desc {
    static void dispasce(int a){
        System.out.println(a);
        if (a>0) {
            a--;
            dispasce(a);
        }
    }
    public static void main(String[] args) {
        dispasce(5);
    }
}
