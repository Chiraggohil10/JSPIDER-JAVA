public class nestedifperc {
    public static void main(String[] args) {
        int p = 60, m = 77, c = 58, o = 63;

        if (p < 35 || m < 35 || c < 35 || o < 35) {

            if (p < 35) {
                System.out.println("fail in Phy");
            }
            if (m < 35) {
                System.out.println("fail in Math");
            }
            if (c < 35) {
                System.out.println("fail in Chem");
            }

            if (o < 35) {
                System.out.println("fail in Opt");
            }
        } 
        else {
            float total = p + m + c + o;
            float per = total/4.0f;
            System.out.println(per);
        }
    }
}
