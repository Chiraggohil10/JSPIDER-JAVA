public class p9 {
    static boolean verify(int a){
        if (a%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
public static void main(String[] args) {
    System.out.println("result is : "+verify(10));
    System.out.println("result is : "+verify(11));
    System.out.println("result is : "+verify(12));
    System.out.println("result is : "+verify(13));
    System.out.println("result is : "+verify(14));
    
}
}
