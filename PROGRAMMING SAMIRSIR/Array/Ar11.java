//check smallest and biggest element sum is prime number or not.
import java.util.Arrays;
import java.util.Scanner;
public class Ar11 {
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
        
        int small=arr[0]; // suppose arr[0] is small
        int big=arr[0]; // suppose arr[0] is big
        int sum=0;
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] < small) {
                small=arr[i];
            }
            if(arr[i] > big){
                big=arr[i];
            }
        }
        sum=big+small;
        if (isPrime(sum)) {
            System.out.println(sum+" : Prime Number ");
        }
        else{
            System.out.println(sum+" : Not Prime Number ");
        }
        sc.close();
    }

    static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
