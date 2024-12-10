package NumberBasic;
import java.util.Scanner;
public class pr57 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The A Values :"); //10
    int a=sc.nextInt();
    System.out.print("Enter The B Values :"); //20
    int b=sc.nextInt();
    int temp;
    temp=a;  //temp=10
    a=b;     //a=20
    b=temp;  //b=10
    System.out.println("A value :"+a);
    System.out.println("B value :"+b);
    sc.close();
}    
}