
//Uppercase convert lowercase and lowercase convert uppercase
//Enter a String : ViKkY
//After Converting String : vIkKy
package String;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=sc.nextLine();
        char ch[] = s.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if (ch[i]>='A' && ch[i]<='Z') {
                ch[i]=(char)(ch[i]+32);
            }
            else if (ch[i]>='a' && ch[i]<='z') {
                ch[i]=(char)(ch[i]-32);
            }
        }
        System.out.print("After Converting String : ");
        System.out.println(ch);
        sc.close();
    }
}