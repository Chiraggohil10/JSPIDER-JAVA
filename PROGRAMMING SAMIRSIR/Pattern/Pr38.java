//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1
//   1 2 3 2 1
//     1 2 1
//       1

package Pattern;

public class Pr38 {
    public static void main(String[] args) {
        int n = 7, space = n / 2, star = 1;
        for (int i = 1; i <= n; i++) {
            int x = 1;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print(x + " ");
                if (k <= star / 2) {
                    x++;
                } 
                else {
                    x--;
                }

            }
            if (i <= n / 2) {
                space--;
                star += 2;
            } 
            else {
                space++;
                star -= 2;
            }
            System.out.println();
        }

    }
}



//2nd logic
// package Pattern;
// public class Pr38 {

//     public static void main(String[] args) {
//         int n=7,space=n/2,star=1;
//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=space;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print(j+" ");
//             }
//             for(int j=star-1;j>=1;j--){
//                 System.out.print(j+" ");
//             }

//             if (i<=n/2) {
//                space--;
//                star++;; 
//             }
//             else{
//                 space++;
//                 star--;
//             }
//             System.out.println();
//         }
//     }
// }



// 3rd logic
// package Pattern;

// public class Pr38 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n-1;i++){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print(j+" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//         for(int i=n-2;i>=1;i--){
//             for(int k=1;k<=n-i;k++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print(j+" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
