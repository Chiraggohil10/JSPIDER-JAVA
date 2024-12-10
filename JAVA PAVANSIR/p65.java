public class p65 {
    public static void main(String[] args) {
        String str = "DEVELOPER";
                    //012345678
        System.out.println(str.indexOf('V')); // 2
        System.out.println(str.indexOf('L')); // 4
        System.out.println(str.indexOf('T'));// -1
        int a = str.indexOf('E'); // 1 //first occurrence
        int b = str.indexOf('E', a + 1); // 3 //second occurrence
        int c = str.indexOf('E', b + 1); // 7 //third occurrence
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        

    }
}

//indexOf searches from left to right direction .
//indexOf returns index value of given character in current string.
//if given character in not present in current string it returns -1.
//we can search for multiple occurrence.