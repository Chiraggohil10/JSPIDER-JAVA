package NumberBasic;
//input 100 and 1000 // output = 144 233 377 610 987 
import java.util.Scanner;

public class StartToEndFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Starting Position :");
        int starting = sc.nextInt();
        System.out.print("Enter The Ending Position :");
        int ending = sc.nextInt();
        int f1 = 0, f2 = 1, f3 = 0;
        while (f1 <= ending) {
            if (f1 >= starting) {
                System.out.print(f1+" ");
            }
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        sc.close();
    }
}
