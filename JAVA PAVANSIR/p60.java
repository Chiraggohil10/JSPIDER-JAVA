public class p60 {
    public static void main(String[] args) {
        int[] arr = {13,11,14,15,16,11,11,17};
        int value=16;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value+" found at index : "+i);
                flag=true;
            }
        }
        if (flag==false) {
            System.out.println("not found at array");
        }
    }
}
