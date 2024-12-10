// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1
package Pattern;

public class Pr10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


//2nd logic
// package Pattern;

// public class Pr10 {
//     public static void main(String[] args) {
//         int n=5;
//         int num=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print(num+" ");
//                 num--;
//             }
//             System.out.println();
//             num=5;
//         }
//     }
// }
