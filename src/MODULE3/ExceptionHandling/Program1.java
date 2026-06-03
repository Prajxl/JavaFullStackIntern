package MODULE3.ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try{
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        System.out.println("Program ends");
    }
}
