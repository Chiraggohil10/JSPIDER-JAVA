public class deposit {
    public static void main(String[] args){
        int balance = 75000;
        int amount = 125000;
        boolean pancard = true;
        if (amount<100000||pancard==true) {
            balance=balance+amount;
            System.out.println("DEPOSIT SUCCESFUL");
            System.out.println("UPDATED BALANCE IS :"+balance);
        }
        else{
            System.out.println("PLEASE,LINK A PANCARD");
            System.out.println("BALANCE IS :"+balance);
        }
    }
}
