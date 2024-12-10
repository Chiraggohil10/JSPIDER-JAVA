package NumberBasic;
import java.util.Scanner;

public class pr37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        countFactor(n);
        sc.close();
    }

    public static void countFactor(int n){
        int count=0;
        for(int i=1;i<=n/2;i++){
            if (n%i==0) {
                count++;
            }
        }
        count++;
        System.out.println("Count The Factor :"+count);
    }
}
