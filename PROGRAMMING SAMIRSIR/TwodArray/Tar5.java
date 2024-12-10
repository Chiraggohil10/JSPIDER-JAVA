//find Smallest and biggest element from 2d array .
package TwodArray;

public class Tar5 {
    public static void main(String[] args) {
        int a[][] = { { 5, 6, 8 }, { 11, 13, 15 }, { 19, 17, 10 } };
        int small=a[0][0];
        int big=a[0][0];
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (a[i][j] < small) {
                    small=a[i][j];
                }

                if (a[i][j] > big) {
                    big=a[i][j];
                }
            }
        }
        System.out.println("Smallest Element :"+small);
        System.out.println("Biggest Element :"+big);
    }
}
