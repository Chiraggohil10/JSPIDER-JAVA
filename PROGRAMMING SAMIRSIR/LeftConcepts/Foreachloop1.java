//print even array element using for each loop
package LeftConcepts;

public class Foreachloop1 {
    public static void main(String[] args) {
        int a[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int b[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int x : a){
            if (x%2==0) {
                System.out.print(x+" ");
            }
        }
        System.out.println();
        for(int z : b){
            if (z%2!=0) {
                System.out.print(z+" ");
            }
        }
    }
}
