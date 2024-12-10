package NumberBasic;
import java.util.Scanner;

public class pr30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter The Number : ");
        int n = sc.nextInt();
        int sq,rem,sum=0;
        sq = n*n;
        while(sq>0){
            rem=sq%10;
            sum = sum+rem;
            sq = sq/10;
        }
        if (sum==n) {
            System.out.println(n+" :Is Neon Number");
        }
        else{
            System.out.println(n+" :Is Not Neon Number");
        }
        sc.close();
    }
}
