class Sample{
    char ch='C';
    double d=4.5;
    void play(){
        System.out.println("Executing play");
    }
    void run(){
        System.out.println("Executing run");
    }

}

public class Program5 {
    public static void main(String[] args) {
        Sample s=new Sample();
        System.out.println(s.ch);
        System.out.println(s.d);
        s.play();
        s.run();
    }
}
