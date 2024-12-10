//wap to print sum of diaognal of 2d array
//10 20 30 
//40 50 60
//70 80 70
//a = 150
//b = 130
package TwodArray;

import java.util.Scanner;

public class Tar4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows Value :");
        int row=sc.nextInt();
        System.out.print("Enter Columns Value :");
        int col=sc.nextInt();

        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++){ 
            for (int j = 0; j < col; j++){ 
                System.out.print("Enter The Elements: ");  
                a[i][j] = sc.nextInt(); 
            }
        }

        int primary=0,secondary=0;
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                System.out.print(a[i][j]+" ");
                if(i==j){
                    primary=primary+a[i][j];
                }
                if (i+j==a[i].length-1) {
                    secondary=secondary+a[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of First Diagonal: "+primary);
        System.out.println("Sum of Second Diagonal: "+secondary);
        sc.close();
    }
}
