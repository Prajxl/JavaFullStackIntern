package MODULE2.Inheritance.MethodOverriding;

import java.awt.*;

public class Windows10 {
    void start()
    {
        System.out.println("List View");
    }
}
class Windows11 extends Windows10{
    @Override
    void start()
    {
        System.out.println("Box View");
    }
}
class MainClass5{
    public static void main(String[] args) {
        Windows10 w10 = new Windows10();
        w10.start();
        w10 = new Windows11();
        w10.start();

    }
}
