//wap to print all the even number between 1 to 20
package LeftConcepts;

public class Dowhileloop {
    public static void main(String[] args) {
        int i=1,n=20;
        do{
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }while(i<=n);
    }
}
