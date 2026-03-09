package MODULE1.Method;

public class fact {
    static int factorial(int n)
    {
        int fact=1;
        while (n>=1)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <= n; i++) {
            System.out.println(factorial(i));
        }
    }
}