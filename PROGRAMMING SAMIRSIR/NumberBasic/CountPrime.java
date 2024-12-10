package NumberBasic;
public class CountPrime {
    public static void main(String[] args) {
        int n = 100,count=0;
        for (int i =2; i <= n; i++) {
            boolean res=isPrime(i);
                if (res==true) {
                count++;
            }
        }
        System.out.print("1 TO 100 Prime Number Count :"+count);
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
