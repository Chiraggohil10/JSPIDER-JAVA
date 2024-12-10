//       * 
//     *   * 
//   *       * 
// *           * 
//   *       * 
//     *   * 
//       * 
package Pattern;

public class Pr40 {
    public static void main(String[] args) {
        int n=7,space=n/2,star=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                if (j==1 || j==star) {
                    System.out.print("* ");
                }
                else{
                    
                    System.out.print("  ");
                }
            }
            if (i<=n/2) {
               space--;
               star=star+2; 
            }
            else{
                space++;
                star=star-2;
            }
            System.out.println();
        }
    }
}
