public class nestedif {
    public static void main(String[] args) {
        int age = 11;
        boolean voterid = true;

        //outer condition
        if (age>=18) {
                        //inner condition
                    if (voterid==true) {
                        System.out.println("eligible for voting");
                    }
                    else{
                        System.out.println("not eligible for voting");
                        System.err.println("voterid is not available");
                    }

        }
        else{
            System.out.println("not eligible for voting");
        }
    }
}
