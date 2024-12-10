public class weekend {
    public static void main (String[] args){
        int day=1;
        if (day<1 || day>7) {
            System.out.println("invlid input");
        }
        if (day==1||day==7) {
            System.out.println("weekend");
        }
        if (day==2||day==3||day==4||day==5||day==6) {
            System.out.println("weekday");
        }
    }
}
