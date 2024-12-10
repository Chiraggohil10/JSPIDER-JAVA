package TwodArray;

public class Tar1 {
    public static void main(String[] args) {
        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[0][0]);
        System.out.println(a[1][0]);
        System.out.println(a[2][0]);
        // System.out.println(a[0][3]); ArrayIndexOutOfBoundsException 
        // System.out.println(a[1][3]); ArrayIndexOutOfBoundsException 
        // System.out.println(a[2][3]); ArrayIndexOutOfBoundsException 
        // System.out.println(a[3].length); ArrayIndexOutOfBoundsException
        
    }
}
