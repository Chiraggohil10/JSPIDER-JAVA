package NumberBasic;
import java.util.Scanner;
public class pr14 {
    public static void main(String[] args){
        int orgpin=1910;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Pin: ");
        int entpin=sc.nextInt();
        double balance=30000.00;
        if (entpin==orgpin) {
            System.out.print("Enter Withdrawn Amount: ");
            double amount=sc.nextInt();
            if (amount<=balance) {
                balance-=amount;
                System.out.println("Withdraw Succesfull");
                System.out.println("Remaining Balance :"+balance);
            }
            else{
                System.out.println("Insufficient Fund");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }
        sc.close();
    }
}
