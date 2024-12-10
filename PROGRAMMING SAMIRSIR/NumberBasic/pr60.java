package NumberBasic;
//fibonacci
//0 1 1 2 3 5 8 13 21
import java.util.Scanner;
public class pr60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        int f1=0,f2=1,f3=0;
        for(int i=1;i<=n;i++){
            System.out.print(f1+" ");
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        sc.close();
    }
}
