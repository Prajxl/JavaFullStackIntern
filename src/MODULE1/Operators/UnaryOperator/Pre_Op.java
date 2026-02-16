package JavaJspiders.src.MODULE1.Operators.UnaryOperator;

public class Pre_Op {
    public static void main(String[] args) {
        int a=4;
        System.out.println(++a); // 5
        System.out.println(a);    // 5
        System.out.println("----------");

        int b=8;
        System.out.println("b :"+ --b);
        System.out.println("b :"+ b);
        System.out.println("----------");

        int c=13;
        System.out.println(++c);
        System.out.println(++c);
        System.out.println(c);
        System.out.println("----------");

        int d=19;
        System.out.println(--d); // 18
        System.out.println(--d); //17
        System.out.println(d);  // 17
        System.out.println("----------");

        int p=10;
        int q=++p + ++p;
        System.out.println(q);
        System.out.println("----------");

        int r=17;
        int t=--r + --r;
        System.out.println(t);

        int u =12;
        int i=++u +  ++u + ++u;
        System.out.println("----------");
        System.out.println(i);

        int x=14,y=18;
        int z= --x + ++y + --x + ++y;
        System.out.println("-----------");
        System.out.println(z);

    }
}
