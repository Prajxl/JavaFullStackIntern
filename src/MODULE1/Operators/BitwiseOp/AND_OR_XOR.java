package JavaJspiders.src.MODULE1.Operators.BitwiseOp;

public class AND_OR_XOR {
    public static void main(String[] args) {
//        int a=13;
//        int b=11;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);

        int i=55,j=23;
        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println(i^j);

        int a=10 , b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);


    }
}
