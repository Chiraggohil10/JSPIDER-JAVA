// *         *
// *  *   *  *
// *    *    *
// *         *
// *         *
package Pattern;

public class Pr35 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j==1||j==n||(i==j && j<=(n+1)/2)||(i+j==n+1 && i<=(n+1)/2)) {
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




// *       * 
// *       * 
// *   *   * 
// * *   * * 
// *       * 
// package Pattern;

// public class Pr35 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n;j++){
//                 if (j==1||j==n||(i==j && j<=(n+1)/2)||(i+j==n+1 && i<=(n+1)/2)) {
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }