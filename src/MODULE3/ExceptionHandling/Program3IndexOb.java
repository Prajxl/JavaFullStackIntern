package MODULE3.ExceptionHandling;

public class Program3IndexOb {
    public static void main(String[] args) {
        String str = "Developer";
        try {
            System.out.println(str.charAt(15));
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("Index Out of Bounds");
        }
        catch (NullPointerException e)
        {
            System.out.println("Operation with Null pointer");
        }
        System.out.println(str.charAt(7));
    }
}
