package NumberBasic;
// public class pr19 {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//            if (i==3) {
//             continue;
//            } 
//            System.out.print(i+" ");
//         }
//     }
// }

// public class pr19 {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             if (i==3) {
//                 break;
//             }
//             System.out.print(i+" ");
//         }
//     }
// }

// class pr19{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=4;j++){
//                 if (j==2) {
//                     continue;
//                 }
//                 System.out.print(j+" ");
//             }
//             System.out.println(i+" ");
//         }
//     }
// }

class pr19{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
            for(int j=1;j<=5;j++){
                if (j==2||j==4) {
                    break;
                }
                System.out.println(j+" ");
            }
        }
    }
}
