//Reverse the String

package String;
import java.util.Scanner;
public class Str02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String rev=" ";
        String s1=sc.nextLine();
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            rev = rev+ch;
        }
        System.out.println("Reverse String :"+rev);
        sc.close();
    }
}


// package String;
// import java.util.Scanner;
// public class Str02 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter String :");
//         String s1=" ";
//         String s2=sc.nextLine();
//         for(int i=s2.length()-1;i>=0;i--){  // performe task on string therefore lenth()
//             s1=s1+s2.charAt(i);
//         }
//         System.out.println("Reverse String :"+s1);
//         sc.close();
//     }
// }

// package String;

// import java.util.Scanner;

// public class Str02 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter String :");
//         String s1=sc.nextLine();

//         String reverse=new StringBuilder(s1).reverse().toString();
//         System.out.println("Reverse String : "+reverse);
        
        
//         System.out.println(new StringBuilder(s1).reverse());
//         sc.close();
//     }
// }
