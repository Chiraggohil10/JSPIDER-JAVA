package NumberBasic;
import java.util.Scanner;
public class pr54 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter The Decimal Number :"); 
       int decimal=sc.nextInt();
       decimalToBinary(decimal);
       sc.close();
    }

    static void decimalToBinary(int decimal){
        int rem;
        String binary="";
        while (decimal>0) {
            rem=decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println("Converstion Of Decimal To Binary :"+binary);
    }
}
