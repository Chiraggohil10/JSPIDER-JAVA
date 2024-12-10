// 1 2 3 4 5
//       4 
//     3 
//   2 
// 1 2 3 4 5
package Pattern;

public class Extra {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1||(i+j)==n+1||i==n) {
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
