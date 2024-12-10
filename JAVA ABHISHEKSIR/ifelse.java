public class ifelse {
    public static void main (String[] args){
        int balance = 75000;
        int amount = 125000;
        
        System.out.println("BALANCE BEFORE WITHDRAW : "+balance);
        System.out.println("WITHDRAWAN AMOUNT : "+amount);
        
        if (balance >= amount) {
           balance=balance-amount;
            System.out.println("TRANSACTION SUCCSEFULL");
            
        }
        else{
            System.out.println("INSUFFICIENT FUNDS");
        }
        
        System.out.println("BALANCE AFTER WITHDRAW : "+balance);
        
        
        
        
    }
}
