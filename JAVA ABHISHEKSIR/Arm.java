public class Arm {
    public static void main(String[] args) {
        int n=9800817;
       int temp=n;
        int sum=0,count=0,pow;
        while(n>0){
            int rem=n%10;
            count++;
            n=n/10;
        }
        n=temp;
        while(n>0){
            pow=1;
            int rem=n%10;
            for(int i=1;i<=count;i++){
                pow=pow*rem;
            }
            sum=sum+pow;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not arm");
        }
    }
}
