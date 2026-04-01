package MODULE2.TypeCasting.UpCasting;

import MODULE2.Static_Nonstatic.MainClass;
//Variables → compile-time → reference type
//Methods  →  runtime → object type
public class A {
    int a=10;
    void show()
    {
        System.out.println("acessing A");
    }
}
class B extends  A{
    int a=20;
    int bVar=40;

    void show()
    {
        System.out.println("acessing B");
    }

}
class c extends A{
    int a=30;
    int c=30;

    void show()
    {
        System.out.println("acessing C");
    }

}
class MainClass1{
    static public void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println(b.a);
        A a = b;
        a.show();
        System.out.println(b.bVar);
        System.out.println(a.a);

        A a2 = new B();
        System.out.println(a2.a);

    }
}
