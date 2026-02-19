package MODULE1.Method;

public class Methods {
    static void help()
    {
        System.out.println("Executing help....");
    }
    static void run()
    {
        System.out.println("Execute run.....");
    }
    static void start()
    {
        System.out.println("Execute start....");
    }

    public static void main(String[] args) {
        help();
        start();
        run();
        start();
        start();
        start();
    }
}
