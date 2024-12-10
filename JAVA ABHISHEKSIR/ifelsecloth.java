public class ifelsecloth {
    public static void main(String[] args){
        int p1=99;
        int p2=799;
        int p3=399;
        int p4=299;
        int total = p1+p2+p3+p4;

                                            // program 1: self
                                            // System.out.println("before discount : "+total);
                                            // if (total>=2000) {
                                            // float distotal = total*0.20f;
                                            // System.out.println("20% discount is : "+distotal);
                                            // float grandtotal = total-distotal;
                                            // System.out.println("grand total is : "+grandtotal);
                                            // }
                                            // else
                                            // {
                                            // float dtotal = total*0.10f;
                                            // System.out.println("10% discount is : "+dtotal);
                                            // float gtotal = total - dtotal;
                                            // System.out.println("grand total is : "+gtotal);
                                            // }

        // program 2: if/else
        float dis = 0;
        if(total>=2000)
        {
            dis=total*0.20f;
        }
        else
        {
            dis=total*0.10f;
        }
        float grandtotal = total-dis;
        System.out.println("before discount price : "+total);
        System.out.println("total discount : "+dis);
        System.out.println("after discount price : "+grandtotal);

                                            // program 3: if
                                            // float dis = 0;
                                            // dis=total*0.10f;
                                            // if(total>=2000)
                                            // {
                                            //     dis=total*0.20f;
                                            // }
                                            // float grandtotal = total-dis;
                                            // System.out.println("before discount price : "+total);
                                            // System.out.println("total discount : "+dis);
                                            // System.out.println("after discount price : "+grandtotal);
    }
}
