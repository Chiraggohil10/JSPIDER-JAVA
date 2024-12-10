import java.util.Scanner;
public class p61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size :"); //size of array
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("enter array values :"); //value
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("array values is :"); //display
        for(int i=0;i<arr.length;i++){
           System.out.print(" "+arr[i]);
        }
        sc.close();
        }
    }

