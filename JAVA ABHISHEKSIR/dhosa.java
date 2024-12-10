public class dhosa {
 public static void main(String[] args) {
    int member = 6;
    int dhosap = 135;
    

    int total = dhosap*member;
    float gst = total*(18/100.0f);
    float grandtotal = total+gst;

    System.out.println("total price :"+total);
    System.out.println("total gst :"+gst);
    System.out.println("grandtotal :"+grandtotal);
 }   
}
