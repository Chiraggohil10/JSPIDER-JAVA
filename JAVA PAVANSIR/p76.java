public class p76 {
    public static void main(String[] args) {
        String str = " java is an object oriented programming language";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// split
//this method is used to cut open the current string into several smaller strings.
//it returns the smaller strings in the form of a string type array.
