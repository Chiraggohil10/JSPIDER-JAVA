//anagram using inbuilt function
//cat act // gum mug
package String;
import java.util.Arrays;
import java.util.Scanner;
public class Str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String str2 = sc.nextLine();
        boolean res = isAnagram(str1, str2);
        if (res == true) {
            System.out.println(str1 + " And " + str2 + " Are Anagram.");
        } else {
            System.out.println(str1 + " And " + str2 + " Are Not Anagram.");
        }
        sc.close();
    }
    
    static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
