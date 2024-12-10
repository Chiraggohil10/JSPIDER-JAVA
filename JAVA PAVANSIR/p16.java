import java.util.Scanner;
public class p16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer : ");
        int a=sc.nextInt();
        System.out.println("enter double : ");
        double d=sc.nextDouble();
        System.out.println("enter Boolean : ");
        boolean b=sc.nextBoolean();
        System.out.println("integer : "+a);
        System.out.println("double : "+d);
        System.out.println("boolean  :"+b);
        sc.close();
    }
}
