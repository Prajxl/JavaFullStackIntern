package MODULE1.Method;

public class Program5 {
    static void test()
    {
        System.out.println("test Starts");
        System.out.println("test ends");
    }
    static void disp()
    {
        System.out.println("disp Starts");
        test();
        System.out.println("disp ends");
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        disp();
        System.out.println("main ends");
    }
}
