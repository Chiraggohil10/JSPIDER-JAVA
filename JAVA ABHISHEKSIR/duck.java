class duck {
    public static void main(String[] args) {
        int n = 1203, rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem==0) {
                break;
            }
            n = n / 10;
        }
        if (rem == 0) {
            System.out.println("Duck no");
        } else {
            System.out.println("Not duck");
        }
    }
}
