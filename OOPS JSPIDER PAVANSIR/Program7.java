class delta{
    static int a=10;
    int b=20;
    static void test(){
        System.out.println("Executing test...");
    }
    void disp(){
        System.out.println("Executing disp...");
    }
}


public class Program7 {
    public static void main(String[] args) {
        delta d=new delta();
        System.out.println(delta.a);
        System.out.println(d.b);
        delta.test();
        d.disp();
    }
}
