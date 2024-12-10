public class Ar4 {
    public static void main(String[] args) {
        int x[]=new int[5];
        x[0]=11;
        x[1]=12;
        x[2]=13;
        x[3]=19;
        x[4]=20;
        for(int i=0;i<=x.length-1;i++){
            if (isPrime(x[i])) {
                System.out.println(x[i]);
            }
        }
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
