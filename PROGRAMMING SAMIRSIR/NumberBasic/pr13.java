package NumberBasic;
public class pr13 {
    public static void main(String[] args) {
        double balance=10000.00;
        double amount=80000.00;
        System.out.println("Before Withdraw Balance :"+balance);
        if (amount<=balance) {
            System.out.println("Withdraw Succsesful");
            balance=balance-amount;
            System.out.println("After Withdraw Balance :"+balance);
        }
        else{
            System.out.println("Insufficent Balance");
        }

    }
}
