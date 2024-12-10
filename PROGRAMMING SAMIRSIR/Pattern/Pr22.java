//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
package Pattern;

public class Pr22 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
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

//print the star
//2*i-1
//2*1-1 = 1
//2*2-1 = 3
//2*3-1 = 5
//2*4-1 = 7
//2*5-1 = 9


// 2ndlogic
// package Pattern;

// public class Pr22 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int k=i;k<=n;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }
