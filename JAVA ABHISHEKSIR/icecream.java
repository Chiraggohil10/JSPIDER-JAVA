public class icecream {
    public static void main(String[] args) {
        int fc=1;
        int price = 0;
        String flavour = null;
        boolean toping = true;
        boolean dryfruits = true;
        if (fc==1) {
            flavour="vanila";
            price = 100;
        }
        if (fc==2) {
            flavour="kiwi";
            price = 125;
        }
        if (fc==3) {
            flavour="dragon";
            price = 140;
        }
        if (toping==true) {
            price = price+15;
        }
        if (dryfruits==true) {
            price = price+25;
        }
float gst = price*0.18f;
float total = price+gst;
System.out.println("total price of icecream : "+total);


    }
}
