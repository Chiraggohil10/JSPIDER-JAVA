package NumberBasic;
import java.util.Scanner;
public class pr45 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter The Number :");  
      int n=sc.nextInt();
      boolean res=isEvenOdd(n);
      if (res==true) {
        System.out.println("Even Number");
      }
      else{
        System.out.println("Odd Number");
      }
      sc.close();
    }
    public static boolean isEvenOdd(int n){
        if (n%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
}
