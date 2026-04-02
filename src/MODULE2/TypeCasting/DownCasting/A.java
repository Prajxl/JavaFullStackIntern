package MODULE2.TypeCasting.DownCasting;

public class A {
    int a;
    void Test(){

    }
}
class B extends A{
    int b;
    void disp(){

    }
}
class C extends B{
    int c;
    void play()
    {

    }
}
class MainClass{
    static public void main(String[] args) {
        A a1 = new C();
        a1.Test();
        B b1=(B) a1;
        b1.Test();
        b1.disp();
        b1.a=10;
        b1.b=20;
        C c1= (C) b1;
        c1.a=30;
        c1.b=50;
        c1.a=40;
        c1.Test();
        c1.play();
        c1.disp();

    }
}