package MODULE1.Method;

public class Recursion {
    static void disp(int a) // 5 ,4
    {
        System.out.println(a); //5 ,4
        if(a>0)
        {
            a--; // 4,3
            disp(a);
        }
    }

    public static void main(String[] args) {
        disp(5);
    }
}
