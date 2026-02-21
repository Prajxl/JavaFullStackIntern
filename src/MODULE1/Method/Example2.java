package MODULE1.Method;

public class Example2 {
    static double addition(double a , double b)
    {
        double sum=a+b;
        return sum;
    }
    static public  void main(String args[])
    {
        System.out.println("Result: "+addition(10,25));
        System.out.println("Result: "+addition(2.3,3.2));
        System.out.println("Result: "+addition(10,2.5));
        System.out.println("Result: "+addition(3.2,10));

    }
}
