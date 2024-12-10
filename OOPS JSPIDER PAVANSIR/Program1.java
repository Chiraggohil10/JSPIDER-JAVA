
class demo{
    static int a=10;
    static void test(){
        System.out.println("executing test().....");
    }
}
public class Program1 {
    public static void main(String[] args) {
        System.out.println(demo.a);
        demo.test();
    }
}
