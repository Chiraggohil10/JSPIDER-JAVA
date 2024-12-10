//longest unique Substring
//enter string : abcdambhld
//o/p = cdambhl
package String;

import java.util.Scanner;

public class Str13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String longest = "";
        int len = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isUnique(sub) && sub.length() > len) {
                    longest = sub;
                    len = sub.length();
                }
            }
        }
        System.out.println("The longest Unique substring is: " + longest);
        sc.close();
    }

    private static boolean isUnique(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
