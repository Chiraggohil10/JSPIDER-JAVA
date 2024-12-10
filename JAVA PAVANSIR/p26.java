//1 2 3 2 1
public class p26 {
    public static void main(String[] args) {
        int val=1,n=5;
        for (int i = 0; i < n; i++) {
            System.out.print(val+" ");
            if (i<n/2) {
                val++;
            }
            else
            {
                val--;
            }

        }
        
    }
}
