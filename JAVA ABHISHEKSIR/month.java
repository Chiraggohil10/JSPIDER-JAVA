public class month {
    public static void main(String[] args){
        int m=2;
        if (m<1 || m>12) {
            System.out.println("INVALID INPUT");
        }
        if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
            System.out.println("31 DAYS");
        }
        if (m==2) {
            System.out.println("28/29 DAYS");
        }
        if (m==4||m==6||m==9||m==11) {
            System.out.println("30 DAYS");
        }
    }
}
