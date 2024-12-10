// *   * * *
// *   *
// * * * * *
//     *   *
// * * *   *
package Pattern;

public class Pr39 {
    public static void main(String[] args) {
        int n = 5;
        int x = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==x||j==x||j==1 && i<=x||j==n && i>=x||i==1 && j>=x||i==n && j<=x){
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
