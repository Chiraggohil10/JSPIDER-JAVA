//Biggest element
import java.util.Arrays;
import java.util.Scanner;
public class Ar8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of An Array : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("Enter "+i+" Index Element :");
            arr[i]=sc.nextInt();
        }

        System.out.println("The Array Is: "+Arrays.toString(arr)); // print the array
        
        int big=arr[0]; // suppose arr[0] is big
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] > big) {
                big=arr[i];
            }
        }
        System.out.println("Biggest Element : " +big);
        sc.close();
    }
}
