public class Program9 {
    static void withoutTemp(int a , int b)
    {
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("without Temp a: "+a+" "+"b "+b);
    }
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a: "+a+" "+"b "+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("with temp a: "+a+" "+"b "+b);
        withoutTemp(a,b);
    }
}
