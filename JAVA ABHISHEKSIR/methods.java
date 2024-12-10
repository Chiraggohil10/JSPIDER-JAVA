class methods{
    static void manage()
    {
        System.out.println("manage start");
        System.out.println("manage end");
    }
    static void connect(){
        System.out.println("connect start");
        manage();
        System.out.println("connect end");
    }
    public static void main(String[] args) {
        System.out.println("program start");
        connect();
        System.out.println("program end");
    }
}