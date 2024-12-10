package NumberBasic;
import java.util.Scanner;
public class pr55 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter The Decimal Number :"); 
       int decimal=sc.nextInt();
       decimalToOctal(decimal);
       sc.close();
    }

    static void decimalToOctal(int decimal){
        int rem;
        String Octal="";
        while (decimal>0) {
            rem=decimal%8;
            Octal=rem+Octal;
            decimal=decimal/8;
        }
        System.out.println("Converstion Of Decimal To Octal :"+Octal);
    }
}