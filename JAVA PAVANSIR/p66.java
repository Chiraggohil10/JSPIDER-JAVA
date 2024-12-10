public class p66 {
    public static void main(String[] args) {
        String str = "DEVELOPER";
                    //012345678
        System.out.println(str.lastIndexOf('P')); // 6
        System.out.println(str.lastIndexOf('O')); // 5
        System.out.println(str.lastIndexOf('N')); // -1
        int x = str.lastIndexOf('E'); // 7 //last occurrence
        int y = str.lastIndexOf('E', x - 1); // 3 //second last occurrence
        int z = str.lastIndexOf('E', y - 1); // 1 //third last occurrence
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

//lastIndexOf searching from right to left direction.
//lastIndexOf returns index value of given character in current string.
//if given character in not present in current string it returns -1.
//we can search for multiple occurrence.


