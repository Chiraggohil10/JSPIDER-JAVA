//the user entered string is unique or not 
//Enter String : abc  o/p = unique
//Enter String : aba  o/p =  not unique
package String;

import java.util.Scanner;

public class Str12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        if (isUnique(str)) {
            System.out.println("Unique String :" + str);
        } else {
            System.out.println("Not Unique String :" + str);
        }
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
