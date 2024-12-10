//sort the array element in descending order
import java.util.Arrays;
import java.util.Scanner;
public class Ar13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of An Array : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("Enter "+i+" Index Element :");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Original Array Value Is : "+Arrays.toString(arr));

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i+1; j <= arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    //using temp extra variable
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    //without using temp extra variable
                    // arr[i]=arr[i]+arr[j];
                    // arr[j]=arr[i]-arr[j];
                    // arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.println("Descending Order Array Value is : " + Arrays.toString(arr));
        sc.close();
    }
}
