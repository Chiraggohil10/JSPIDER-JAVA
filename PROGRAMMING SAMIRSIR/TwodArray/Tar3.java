//wap to print prime elements in the 2d array
package TwodArray;

public class Tar3 {
    public static void main(String[] args) {
        int a[][] = { { 5, 6, 8 }, { 11, 13, 15 }, { 19, 17, 10 } };
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (isPrime(a[i][j])) {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
