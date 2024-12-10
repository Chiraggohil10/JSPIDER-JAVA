//sum of odd element
public class Ar3 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=11;
        arr[1]=20;
        arr[2]=33;
        arr[3]=40;
        arr[4]=55;
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i]%2!=0) {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
