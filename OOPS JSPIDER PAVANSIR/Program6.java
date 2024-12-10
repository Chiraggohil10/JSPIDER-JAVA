class Example{
    int n=45;
    boolean status=false;
    void send(){
        System.out.println("Executing send...");
    }
    void execute(){
        System.out.println("Executing execute...");
    }

}
public class Program6 {
    public static void main(String[] args) {
        Example e=new Example();
        System.out.println(e.n);
        System.out.println(e.status);
        e.send();
        e.execute();
    }
}
