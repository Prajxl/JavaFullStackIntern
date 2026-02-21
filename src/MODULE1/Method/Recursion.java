package MODULE1.Method;

public class Recursion {
    static void disp(int a)
    {
        System.out.println(a);
        if(a>0)
        {
            a--;
            disp(a);
        }
    }

    public static void main(String[] args) {
        disp(5);
    }
}
