// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
public class p31 {
    public static void main(String[] args) {
        int n=5;
    int val=1;
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
            val=1;
        }
    }
}
