
public class BankWithdraw {
    public static void main(String[] args) {
        int balance = 75000;
        int amount = 70000;
        int bankCode = 2;
        boolean panCard = true;
        int minBalance = 0;
        int maintain=0;
        System.out.println("Balance before withdrawal: " + balance);
        System.out.println("Amount to withdraw: " + amount);
        if (amount <= balance) {
            if (amount < 50000 || panCard == true) {
                balance = balance - amount;
                System.out.println("Amount withdrawn successfully!!!");

                if (bankCode == 1||bankCode == 2) {
                    minBalance = 10000;
                    if (balance < minBalance) {
                        maintain=minBalance-balance;
                        System.out.println("Low balanace in your bank account!!!");
                        System.out.println("Balance after withdrawal: " + balance);
                        System.out.println("Please deposit " + (maintain) + " to your bank account immediately for maintain " + (minBalance) + " minimum balance");
                    }
                }
                if (bankCode == 3) {
                    System.out.println("Balance after withdrawal: " + balance);
                }

                if (bankCode == 4) {
                    minBalance = 2000;
                    if (balance < minBalance) {
                        maintain=minBalance-balance;
                        System.out.println("Low balanace in your bank account!!!");
                        System.out.println("Balance after withdrawal: " + balance);
                        System.out.println("Please deposit " + (maintain) + " to your bank account immediately for maintain " + (minBalance) + " minimum balance");
                     }
                }
            } 
            else {
                System.out.println("Please link PAN-CARD to your Bank Account!!!");
            }
        } 
        else {
            System.out.println("Insufficient Balance!!!");
        }

    }
}