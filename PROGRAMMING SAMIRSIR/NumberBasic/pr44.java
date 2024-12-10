package NumberBasic;
public class pr44 {
    public static void main(String[] args) {
        int n = 50,sum=0;
        for (int i = 2; i <= n; i++) {
            boolean res=isPrime(i);
                if (res==true) {
                sum=sum+i;
            }
        }
        System.out.print("1 TO 50 Prime Number Sum :"+sum);
    }

    public static boolean isPrime(int n){
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
