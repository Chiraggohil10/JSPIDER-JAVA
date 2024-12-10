// 1 0 1 0 1 
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1
package Pattern;

public class Pr6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}



//2nd logic
// package Pattern;

// public class Pr6 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print((i+j)%2+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//3rd logic
// package Pattern;

// public class Pr6 {
//     public static void main(String[] args) {
//         int n=5;
//         int x=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print((x)%2+" ");
//                 x++;
//             }
//             System.out.println();
//         }
//     }
// }
