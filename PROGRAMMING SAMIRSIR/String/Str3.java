//convert each word first character into upper case and remaining character should be in lower case.
//Enter String :rAm iS Good 
//After Converting String : Ram Is Good
package String;
import java.util.Scanner;

public class Str3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        
        sc.close();
    }
}
