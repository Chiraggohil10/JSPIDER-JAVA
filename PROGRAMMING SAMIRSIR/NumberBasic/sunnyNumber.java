package NumberBasic;
    // n=8    n=n+1 == root number 
import java.util.Scanner;
public class sunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        n=n+1;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            if (i*i==n) {
               flag=true;
            }
            if (i*i>n) {
                break;
            }
        }
        if (flag==true) {
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not Sunny Number");
        }
        sc.close();
    }
}

