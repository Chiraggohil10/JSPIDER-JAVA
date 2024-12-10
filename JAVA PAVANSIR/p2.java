public class p2 {
    static void test(double arg){
        System.out.println("value:"+arg);
    }
    static void push(String c){
        System.out.println("my value:"+c);
    }
    static void play(char d){
        System.out.println("my val: "+d);
    }
    public static void main(String[] args) {
        System.out.println("program start");
        test(3.45);
        push("my name is chirag");
        play('J');
        System.out.println("program end");
    }
}

