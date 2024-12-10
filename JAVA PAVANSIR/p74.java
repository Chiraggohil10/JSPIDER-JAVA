public class p74 {
    public static void main(String[] args) {
        String str="Developer";
        System.out.println(str.substring(6));
        System.out.println(str.substring(4));
        System.out.println(str.substring(3,8));
        System.out.println(str.substring(0,9));
        

    }
}

//substring
//startindex includng
//endindex excluding
//ex: developer -> (3,8) ->elope 3 is including and 8 is excluding
//    012345678

// this method is used to derive a sequence of characters from the current string
