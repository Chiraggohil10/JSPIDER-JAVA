// *        * 
// *  *     * 
// *    *   *   
// *      * * 
// *        *
package Pattern;
public class Pr34 {
     public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
               if (i==j||j==1||j==n) {
                    System.out.print("* ");
               }
               else{
                    System.out.print("  ");
               }
          }
          System.out.println();
        }
     }
}