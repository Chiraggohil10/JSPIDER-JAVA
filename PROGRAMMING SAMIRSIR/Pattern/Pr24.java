//         A
//       A B C 
//     A B C D E 
//   A B C D E F G 
// A B C D E F G H I 
package Pattern;

public class Pr24 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){   //main loop
            char ch='A';
            for(int k=1;k<=n-i;k++){  // space
                System.out.print("  ");
            }
                for(int j=1;j<=2*i-1;j++){  // print j
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
        }
    }
}



//2nd logic capital alpha
// package Pattern;

// public class Pr24 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){   //main loop
//             for(int k=1;k<=n-i;k++){  // space
//                 System.out.print("  ");
//             }
//                 for(int j=1;j<=2*i-1;j++){  // print j
//                     System.out.print((char) (j+64)+" ");
//                 }
//                 System.out.println();
//         }
//     }
// }


// Small alpha
//         a 
//       a b c 
//     a b c d e 
//   a b c d e f g 
// a b c d e f g h i
// package Pattern;

// public class Pr24 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){   //main loop
//             for(int k=1;k<=n-i;k++){  // space
//                 System.out.print("  ");
//             }
//                 for(int j=1;j<=2*i-1;j++){  // print j
//                     System.out.print((char) (j+96)+" ");
//                 }
//                 System.out.println();
//         }
//     }
// }
