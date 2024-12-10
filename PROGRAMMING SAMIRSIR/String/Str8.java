// panagram 
// all alphabet one time present ex=abcdefghijklmnopqrstuvwxyz
package String;

import java.util.HashSet;
import java.util.Scanner;

public class Str8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        if (isPanagram(str)) {
            System.out.print("String Is Panagram");
        } else {
            System.out.print("String Is Not Panagram");
        }
        sc.close();
    }

    public static boolean isPanagram(String str) {
        str = str.toLowerCase();

        if (str.length() < 26) {
            return false;
        }

        HashSet hs = new HashSet();
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                hs.add(ch);
            }
        }

        return hs.size() == 26;
    }
}
