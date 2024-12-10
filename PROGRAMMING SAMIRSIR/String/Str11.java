// longest palindrome substring in the main string .
// I/p= bccbkhkaba
// o/p= bccb

package String;

import java.util.Scanner;

public class Str11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String longest = "";
        int len=0;
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub) && sub.length() > len) {
                        longest = sub;
                        len = sub.length();
                }
            }
        }
        System.out.println("The longest palindromic substring is: " + longest);
        sc.close();
    }

    private static boolean isPalindrome(String sub) {
        int i = 0, j = sub.length() - 1;
        while (i < j) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

