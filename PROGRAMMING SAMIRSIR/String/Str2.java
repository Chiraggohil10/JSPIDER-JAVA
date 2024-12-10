//Count Word of String
//Enter String :Ram Is God 
//Number Of word :3
package String;
import java.util.Scanner;

public class Str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String s=sc.nextLine();
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                count++;
            }
        }
        System.out.println("Number Of word :"+count);
        sc.close();
    }
}
