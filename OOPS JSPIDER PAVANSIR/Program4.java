class Demo {
    int n = 45;
    void test() {
        System.out.println("Executing test");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.n);
        d1.test();
    }
}
