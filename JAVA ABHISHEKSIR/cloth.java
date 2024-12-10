public class cloth {
public static void main(String[] args) {

    int t1=599; int t2=799; int t3=349; int p1=2499;
    float price1=t1+t2+t3;
    float price2=p1;
    float dis1=price1*(20/100.0f);
    float dis2=price2*(30/100.0f);
    float total1=price1-dis1;
    float total2=price2-dis2;
    float x=t1+t2+t3+p1;
    float grandtotal=total1+total2;
    System.out.println("actual price :"+x);
   System.out.println("discounted price :"+grandtotal);
    } }