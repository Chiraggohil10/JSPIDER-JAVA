//       1
//     1 0 1
//   1 0 1 0 1
// 1 0 1 0 1 0 1
//   1 0 1 0 1
//     1 0 1
//       1
package Pattern;

public class Pr29 {
    public static void main(String[] args) {
        int n=7,space=n/2,star=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print((j%2)+" ");
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



// 2nd logic
// package Pattern;

// public class Pr29 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n - 1; i++) {
//             for (int k = 1; k <= n - i; k++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print((j%2)+" ");
//             }
//             System.out.println();
//         }
//         for (int i = n - 2; i >= 1; i--) {
//             for (int k = 1; k <= n - i; k++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print((j%2)+" ");
//             }
//             System.out.println();
//         }
//     }
// }
