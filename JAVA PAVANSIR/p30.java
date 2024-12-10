// 5 5 5 5 5 
// 4 4 4 4 4 
// 3 3 3 3 3 
// 2 2 2 2 2 
// 1 1 1 1 1 
public class p30 {
    public static void main(String[] args) {
    int n=5;
    int val=5;
        for(int i= 0;i<n;i++)
        {
            for(int j=5;j>0;j--)
            {
                System.out.print(val+" ");
            }
            System.out.println();
            val--;
        }
    }
}
