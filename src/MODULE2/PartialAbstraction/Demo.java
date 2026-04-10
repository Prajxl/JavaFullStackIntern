package MODULE2.PartialAbstraction;

abstract class Demo {
    abstract void test();
    abstract void disp();
}
class Sample extends Demo{
    @Override
    void test()
    {
        System.out.println("Executing test...");
    }
    @Override
    void disp()
    {
        System.out.println("Executing disp....");
    }
}
class MainClass1{
    public static void main(String[] args) {
        Demo ref = new Sample();
        ref.disp();
        ref.test();
    }
}
