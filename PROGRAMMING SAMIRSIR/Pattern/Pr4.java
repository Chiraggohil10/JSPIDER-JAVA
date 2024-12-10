// 1 1 1 1 1 
// 0 0 0 0 0 
// 1 1 1 1 1 
// 0 0 0 0 0 
// 1 1 1 1 1 
package Pattern;

public class Pr4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((i%2)+" ");
            }
            System.out.println();
        }
    }
}



//2nd Logic
// package Pattern;

// public class Pr4 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if (i%2==0) {
//                     System.out.print("0 ");
//                 }
//                 else{
//                     System.out.print("1 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
