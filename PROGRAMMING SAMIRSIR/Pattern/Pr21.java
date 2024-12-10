// A 
// A B 
// A B C 
// A B C D 
// A B C D E  
package Pattern;

public class Pr21 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        
    }
}


//2nd logic
// package Pattern;

// public class Pr21 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(j+64)+" ");               
//             }
//             System.out.println();
//         }
        
//     }
// }

