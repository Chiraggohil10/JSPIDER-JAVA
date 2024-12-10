package Pattern;

public class Chirag{
    public static void main(String[] args) {
        cm();
        System.out.println();
        hm();
        System.out.println();
        im();
        System.out.println();
        rm();
        System.out.println();
        am();
        System.out.println();
        gm();
    }
    static void cm(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void hm() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == (n + 1) / 2 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void im(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j==(n+1)/2 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void rm(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || (i==1 && j<=(n+1)/2) ||(j==(n+1)/2 && i<=(n+1)/2) || (i==(n+1)/2 && j<=(n+1)/2) || i - j == n / 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void am(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1||i==(n+1)/2||(i==1) || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void gm(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
              if (i == 1 || i == n || j == 1||(j==n && i>=(n+1)/2)||(i==(n+1)/2 && j>=(n+1)/2))
              {
                 System.out.print("* ");
              } 
              else {
                 System.out.print("  ");
              }
           }
           System.out.println();
        }
     }
}
