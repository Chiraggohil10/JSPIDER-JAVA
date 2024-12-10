package NumberBasic;
//nth fibonacci
//0 1 1 2 3 5 8 13 21
// input 5 // o/p = 3
import java.util.Scanner;
public class NthFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        int f1=0,f2=1,f3=0;
        for(int i=2;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.print(f1+" ");
        sc.close();
    }
}

