// * * * * * * * * *    
//   * * * * * * *
//     * * * * * 
//       * * *
//         *
package Pattern;

public class Pr25 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



// 2nd logic
// package Pattern;

// public class Pr25 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=n;j>i;j--){
//                 System.out.print("* ");
//             }
//             for(int j=n;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }