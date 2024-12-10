package NumberBasic;
import java.util.Scanner;
public class pr41 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        factor(n);
        sc.close();
    }
    public static void factor(int n){
        for(int i=1;i<=n/2;i++){
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
}
