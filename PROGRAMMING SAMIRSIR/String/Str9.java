//reverse the given sentence  
//i/p = ram is good 
//o/p = good is ram.
// package String;

// import java.util.Scanner;

// public class Str9 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter String: ");
//         String str=sc.nextLine();

//         String[] arr=str.split(" ");

//         String rev="";

//         for(int i=arr.length-1;i>=0;i--){
//             rev=rev+arr[i]+" ";
//         }
//         System.out.println("Reversed Sentence: "+rev);
//         sc.close();
//     }
// }

package String;

import java.util.Scanner;

public class Str9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        String[] arr=str.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            System.out.print("Reversed Sentance :"+arr[i]+" ");
          
        }
        sc.close();
    }
}
