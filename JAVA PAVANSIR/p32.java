// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E
public class p32 {
    public static void main(String[] args) {
        int n=5;
    char val='A';
        for(int i= 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
            val='A';
        }
    }
}