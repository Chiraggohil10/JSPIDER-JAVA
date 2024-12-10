// 5 5 5 5 5 
// 4 4 4 4 4 
// 3 3 3 3 3 
// 2 2 2 2 2 
// 1 1 1 1 1 

package Pattern;

public class Pr9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//2nd logic
// package Pattern;

// public class Pr9 {
//     public static void main(String[] args) {
//         int n=5;
//         int num=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print(num+" ");
//             }
//             System.out.println();
//             num--;
//         }
//     }
// }
