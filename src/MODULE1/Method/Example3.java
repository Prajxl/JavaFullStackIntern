package MODULE1.Method;

public class Example3 {
    static int square(int n)
    {
        int sq=n*n;
        return sq;
    }

    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" Square "+square(i));
        }
    }
}
