import java.util.Scanner;

public class p43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println(" string value is : " + str);
        System.out.println(" enter character");
        char ch=sc.next().charAt(0);
        System.out.println(" char value is : " + ch);
        sc.close();
    }
}
