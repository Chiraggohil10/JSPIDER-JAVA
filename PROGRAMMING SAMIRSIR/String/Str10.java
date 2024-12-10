// reverse the each word in the sentanse 
//i/p = ram is good 
//o/p = mar si doog
package String;

import java.util.Scanner;

public class Str10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        String main="";
        String[] arr=str.split(" ");
        for(int i=0;i<=arr.length-1;i++){
            String s1=arr[i];
            String rev=reverse(s1);
            main=main+rev+" ";
        }
        System.out.print("Reverse Sentanse :"+main);
        sc.close();
    }

    static String reverse(String s1){
        String rev="";
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            rev = rev+ch;
        }
        
        // second logic
        // String rev=new StringBuilder(s1).reverse().toString();
        return rev;
    }
}
