package NumberBasic;
import java.util.Scanner;
public class pr56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Decimal Number :"); 
        int decimal=sc.nextInt();
        decimalToHexa(decimal);
        sc.close();
     }
 
     static void decimalToHexa(int decimal){
         int rem;
         String Hexa="";
         while (decimal>0) {
             rem=decimal%16;
             if (rem>9) {
                rem=rem+55;
                Hexa= (char) rem + Hexa;
             }
             else{
                Hexa=rem+Hexa;
             }
             decimal=decimal/16;
         }
         System.out.println("Converstion Of Decimal To Hexa :"+Hexa);
     }
}
