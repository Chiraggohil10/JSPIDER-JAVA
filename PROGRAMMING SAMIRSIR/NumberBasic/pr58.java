package NumberBasic;
import java.util.Scanner;
public class pr58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The A Values :");
        int a=sc.nextInt();
        System.out.print("Enter The B Values :");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A value :"+a);
        System.out.println("B value :"+b);
        sc.close();
    }
}
