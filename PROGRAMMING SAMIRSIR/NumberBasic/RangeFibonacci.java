package NumberBasic;
//input 10 //output = 0 1 1 2 3 5 8
import java.util.Scanner;
public class RangeFibonacci {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number :");
    int endingPoint=sc.nextInt();
    int f1=0,f2=1,f3=0;
    while(f1<=endingPoint){
        System.out.print(f1+" ");
        f3=f1+f2;
        f1=f2;
        f2=f3;
    }
    sc.close();
}
}