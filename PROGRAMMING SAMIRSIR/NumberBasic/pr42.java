package NumberBasic;
import java.util.Scanner;
public class pr42 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number :");
    int n=sc.nextInt();
    factorial(n);
    sc.close();
    }
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial :"+fact);
    }
}
