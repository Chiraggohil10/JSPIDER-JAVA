import java.util.Scanner;
public class p15 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value 1 : ");
    double num1=sc.nextDouble();
    System.out.println("enter value 2 : ");
    double num2=sc.nextDouble();
    double sum=num1+num2;
    System.out.println("sum : "+sum);
    sc.close();
   } 
}
