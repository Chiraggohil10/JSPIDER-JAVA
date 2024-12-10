public class p59 {
    public static void main(String[] args) {
        double[] values = {5.8,5.7,5.6,6.0,5.9};
        double small = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < small) {
                small=values[i];
            }
        }
        System.out.println("smallest values : " +small);
    }
}


