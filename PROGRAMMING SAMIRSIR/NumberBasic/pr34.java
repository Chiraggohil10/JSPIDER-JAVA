package NumberBasic;
import java.util.Scanner;

public class pr34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N value :");
        int n=sc.nextInt();
        System.out.print("Enter P value :");
        int p=sc.nextInt();
        int power=1;
        for(int i=1;i<=p;i++){
            power=power*n;
        }
        System.out.print("Power of N :"+power);
        sc.close();
    }
}
