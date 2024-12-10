//anagram without using inbuilt method
package String;

import java.util.Scanner;

public class Str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String str2 = sc.nextLine();
        String s1 = isAnagram(str1);
        String s2 = isAnagram(str2);
        if (s1.equals(s2)) {
            System.out.println(str1 + " And " + str2 + " Are Anagram.");
        } else {
            System.out.println(str1 + " And " + str2 + " Are Not Anagram.");
        }
        sc.close();
    }

    
    static String isAnagram(String str) {
        char[] ch1 = str.toCharArray();

        for(int i=0;i<=ch1.length-1;i++){
            for(int j=i+1;j<=ch1.length-1;j++){
                if (ch1[i] > ch1[j]) {
                    char temp=ch1[i];
                    ch1[i]=ch1[j];
                    ch1[j]=temp;
                }
            }
        }

        String s1= new String(ch1);
        return s1;
    }
}
