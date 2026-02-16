package JavaJspiders.src.MODULE1.Operators.UnaryOperator;

public class Post_Op {
    public static void main(String[] args) {
        int a=5,b=9;

        System.out.println("------Post increment-------");
        System.out.println(a++);
        System.out.println(a);

        int n=14;
        System.out.println("------Post Decrement-------");
        System.out.println(b--);
        System.out.println(b);

        System.out.println("------N-----");
        System.out.println(n--);
        System.out.println(n--);
        System.out.println(n--);
        System.out.println(n);

        System.out.println("---------------");
        int p=11;
        int q= p++ + p++;
        System.out.println(q);

        System.out.println("---------------");
        int x=17, y=15;
        int z= x-- + y++ + x-- + y++;
        System.out.println("z :"+z);

        int j = 10,k=14;
    }
}
