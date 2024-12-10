//sum of all the element of array using for each loop
package LeftConcepts;

public class Foreachloop2 {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        int sum=0;

        for(int a:x){
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
