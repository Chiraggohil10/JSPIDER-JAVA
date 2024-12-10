package NumberBasic;
public class pr16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
}


// public class pr16 {
//     public static void main(String[] args) {
//         int n=500;
//         for(int i=1;i<=n/2;i++){
//             if (n%i==0) {
//                 System.out.println(i);
//             }
//         }
//         System.out.println(n);
//     }
// }