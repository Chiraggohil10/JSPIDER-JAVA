public class p57 {
    public static void main(String[] args) {
        double[] fheight = {5.7,5.8,5.6,5.9,5.0,6.7};
        double sum = 0.0;
        for (int i = 0; i < fheight.length; i++) {

            sum = sum + fheight[i];

        }
        double h=sum/fheight.length;
        System.out.println("average : "+h);
    }
}
