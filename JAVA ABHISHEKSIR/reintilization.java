public class reintilization {
    public static void main(String[] args) {
        int p1 = 499;
        int p2 = 399;
        int p3 = 1499;
        int p4 = 299;

        float total = p1+p2+p3+p4;
        System.out.println("before discount price: "+total);
        float discount = (total*25)/100.0f;
        System.out.println("discount of product : "+discount);
        total=total-discount;
        System.out.println("after discount price: "+total);
    }
}
