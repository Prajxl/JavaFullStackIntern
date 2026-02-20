package MODULE1.Method;

public class MultiplePass {
    static void addition(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum of "+a+" + "+b+" = "+sum);
    }
    public static void main(String[] args) {
        addition(10,15);
        addition(15,15);
        addition(100,200);
    }
}
