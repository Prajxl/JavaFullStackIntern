package MODULE3.ExceptionHandling;

public class Program4 {
    void test()
    {
        System.out.println("Executing test()...");
    }
}
class MainClass{
    public static void main(String[] args) {
        try{
            //creates an object dynamically at runtime using Reflection
            Program4 p = (Program4) Class.forName("MODULE3.ExceptionHandling.Program4").newInstance();
            p.test();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("No Such Class Exists");
        }
        catch (IllegalAccessException e)
        {
            System.out.println("Acess Denied");
        }
        catch (InstantiationException e)
        {
            System.out.println("Object creation failed");
        }
    }
}
