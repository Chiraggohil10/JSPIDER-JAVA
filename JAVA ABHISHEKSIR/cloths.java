public class cloths {
    public static void main(String[] args) {
        int t1=599; int t2=799; int t3=349; int p1=2499;
        int totalt = t1+t2+t3;
        float discount=((totalt*20.0f)/100.0f);
        float tap = totalt-discount;
        float dis = ((p1*30.0f)/100.0f);
        float pap = p1 - dis;
        float actualprice = tap+pap;
        System.out.println(actualprice);
    }
}
