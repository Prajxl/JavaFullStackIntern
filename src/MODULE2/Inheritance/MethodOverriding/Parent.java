package MODULE2.Inheritance.MethodOverriding;

public class Parent {
    int a=10;
    void watchTv()
    {
        System.out.println("Serial/News");
    }
}
class Child extends Parent {
    int a=30;
    @Override
    void watchTv()
    {
        System.out.println("Cartoon/Sports");
    }
}
class MainClass
{
    public static void main(String[] args) {
        Child c = new Child();
        c.watchTv();
        Parent p = new Parent();
        p.watchTv();
        Parent p1 = new Child(); // Upcasting
        p1.watchTv();
        System.out.println(p1.a);
    }
}