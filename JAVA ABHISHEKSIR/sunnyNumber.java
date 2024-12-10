// n=8    n=n+1 == root number 
public class sunnyNumber {
    public static void main(String[] args) {
        int n=48;
        n=n+1;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            if (i*i==n) {
               flag=true;
            }
            if (i*i>n) {
                break;
            }
        }
        if (flag==true) {
            System.out.println("sunny");
        }
        else{
            System.out.println("not sunny");
        }
    }
}
