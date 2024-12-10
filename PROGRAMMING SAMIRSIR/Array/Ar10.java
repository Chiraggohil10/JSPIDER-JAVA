// linear search
//search user entered number in the user entered array
// using method
import java.util.Arrays;
import java.util.Scanner;
public class Ar10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of Array :");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("Enter "+i+" Index Element :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Value is : "+Arrays.toString(arr)); // array print
        
        System.out.print("Enter The Element To Search :");
        int value=sc.nextInt();
        linearSearch(arr,value);
        sc.close();
    }

    static void linearSearch(int arr[],int value){
        boolean flag=false;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == value) {
                System.out.println(value+" Found At Index : "+i);
                flag=true;
            }
        }
        if (flag==false) {
            System.out.println("Element Not Found At Array");
        }
    }
}






//using main method

// import java.util.Arrays;
// import java.util.Scanner;
// public class Ar10 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The Size Of Array :");
//         int size=sc.nextInt();

//         int arr[]=new int[size];
//         for (int i = 0; i <= arr.length - 1; i++) {
//             System.out.print("Enter "+i+" Index Element :");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Array Value is : "+Arrays.toString(arr)); // array print
//         System.out.print("Enter The Element To Search :");
//         int value=sc.nextInt();
//         boolean flag=false;
//         for (int i = 0; i <= arr.length-1; i++) {
//             if (arr[i] == value) {
//                 System.out.println(value+" Found At Index : "+i);
//                 flag=true;
//             }
//         }
//         if (flag==false) {
//             System.out.println("Element Not Found At Array");
//         }
//          sc.close();
//     }
// }