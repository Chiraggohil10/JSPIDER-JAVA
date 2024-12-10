//         *
//       * * 
//     * * *
//   * * * *
// * * * * *
package Pattern;

public class Pr17 {
    public static void main(String[] args) {
      int n=5;
      for (int i = 1; i <= n; i++) {
        for (int k = 1; k <= n-i; k++) {        //5-1 = 4 
            System.out.print("  "); // print spaces   //consuming 2 space 1 space star and 1 space for space 
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* "); // print stars
        }
        System.out.println();
    }
    }
}



//2nd logic
// package Pattern;

// public class Pr17 {
//     public static void main(String[] args) {
//       int n=5;
//       for (int i = 1; i <= n; i++) {
//         for (int k = i; k <= n; k++) {
//             System.out.print("  "); // print spaces
//         }
//         for (int j = 1; j <= i; j++) {
//             System.out.print("* "); // print stars
//         }
//         System.out.println();
//     }
//     }
// }
     



//using one space here then output will different
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// package Pattern;

// public class Pr17 {
//     public static void main(String[] args) {
//       int n=5;
//       for (int i = 1; i <= n; i++) {
//         for (int k = 1; k <= n-i; k++) {        //5-1 = 4 
//             System.out.print(" "); // print spaces   //using one space here then output will different
//         }
//         for (int j = 1; j <= i; j++) {
//             System.out.print("* "); // print stars
//         }
//         System.out.println();
//     }
//     }
// }


   



