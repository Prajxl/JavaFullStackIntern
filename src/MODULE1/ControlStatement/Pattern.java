package JavaJspiders.src.MODULE1.ControlStatement;

public class Pattern {
    // Example 3 : 1 * 2 * 3
    static void Ex3(int n)
    {
        int val=1;
        for (int i = 0; i < n; i++) {
            if (i%2==0)
            {
                System.out.print(val+" ");
                val++;
            }else {
                System.out.print("* ");
            }
        }
    }
    // Example 4 : a * b * c
    static void Ex4(int n)
    {
        char val='a';
        for (int i = 0; i < n; i++) {
            if (i%2==0)
            {
                System.out.print(val+" ");
                val++;
            }else {
                System.out.print("* ");
            }
        }
    }

    static void Ex5(int n)
    {
        int val=1;
        for (int i = 0; i < n; i++) {
            if (i<n/2)
            {
                System.out.print(val++ +" ");
//                val++;
            }else {
                System.out.print(val-- +" ");
//                --val;
            }
        }
    }

    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            if(i%2==0)
            {
                System.out.print("1"+" ");
            }else {
                System.out.print("0"+" ");
            }
        }

        //  a b a b a

        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i%2==0)
            {
                System.out.print("a"+" ");
            }else {
                System.out.print("b"+" ");
            }
        }
        ///  EXAMPLE 3 :  1 * 2 * 3
        System.out.println();
        Ex3(5);
        System.out.println();
        Ex4(5);
        System.out.println();
        Ex5(5);
    }
}
