package NumberBasic;
import java.util.Scanner;

public class OlaFare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int fare = calculateFare(distance);
        System.out.println(fare);
        sc.close();
    }

    public static int calculateFare(int distance) {
        int fare = 0;
        if (distance <= 2) {
            fare = 25;
        } 
        else if (distance <= 7) {
            fare = 25 + (distance - 2) * 15;
        } 
        else if (distance <= 12) {
            fare = 25 + 5 * 15 + (distance - 7) * 20;
        } 
        else {
            fare = 25 + 5 * 15 + 5 * 20 + (distance - 12) * 25;
        }
        return fare;
    }
}
