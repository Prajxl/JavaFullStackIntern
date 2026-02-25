package MODULE1.ControlStatement;

public class FibonacciSeries {
    static int fib(int n)
    {
        if(n==0|| n==1)
        {
            return n;
        }
        int sum=fib(n-1)+fib(n-2);
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
//        System.out.println(fib(n));
//        for (int i = 0; i < n; i++) {
//            System.out.print(" " + fib(i));
//        }

        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }
}
