// a a a a a 
// b b b b b 
// c c c c c 
// d d d d d 
// e e e e e
public class p29 {
    public static void main(String[] args) {
        int n=5;
        char val='a';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(val+" ");
            }
            System.out.println();
            val++;
        }
    }
}