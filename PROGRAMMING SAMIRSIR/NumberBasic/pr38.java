package NumberBasic;
import java.util.Scanner;
public class pr38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=sc.nextInt();
        countNumber(n);
        sc.close();
    }

    public static void countNumber(int n){
        int count=0;
        while (n>0) {
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
