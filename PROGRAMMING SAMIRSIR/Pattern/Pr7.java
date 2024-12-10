// 1  2  3  4  5 
// 6  7  8  9  10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
package Pattern;

public class Pr7 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%4d",num); //it gives space between degit acording to passed values example %4d means 4 digit space 
                num++;
            }
            System.out.println();
        }
    }
}
