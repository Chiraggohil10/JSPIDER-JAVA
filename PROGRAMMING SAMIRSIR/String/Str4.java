//sorting string into acsending order 
//ramesh => aehmrs
package String;

public class Str4 {
    public static void main(String[] args) {
        String s="ramesh";

        char[] ch = s.toCharArray();

        for(int i=0;i<=ch.length-1;i++){
            for(int j=i+1;j<=ch.length-1;j++){
                if (ch[i] > ch[j]) {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        String s1= new String(ch);
        System.out.print("After Sorting :");
        System.out.println(s1);
    }
}



//2nd logic
// package String;

// import java.util.Arrays;

// public class Str4 {
//     public static void main(String[] args) {
//         String str= "ramesh";

//         char[] ch=str.toCharArray();

//         Arrays.sort(ch);
//         System.out.println(ch);

//     }
// }
