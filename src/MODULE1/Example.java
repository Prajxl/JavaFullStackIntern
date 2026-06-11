package MODULE1;

public class Example {
    static {
        System.out.println("static Example 1"); // 3
    }
    {
        System.out.println("nonstatic Example 1 "); // 5
    }
    Example()
    {
        System.out.println("Constructor ex 1"); // 6
    }
}
class Example2{
    static {
        System.out.println("static Example 2"); // 4
    }
    {
        System.out.println("nonstatic Example 2 "); // 7
    }
    Example2()
    {
        System.out.println("Constructor ex 2"); // 8
    }
}
class MainClass5{
    static {
        System.out.println("MainClass Static block"); // 1
    }

    public static void main(String[] args) {
        System.out.println("Main method starts"); // 2
        new Example();
        new Example2();
        System.out.println("main method endded"); //9
    }
}
