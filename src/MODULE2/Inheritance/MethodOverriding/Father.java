package MODULE2.Inheritance.MethodOverriding;

public class Father {
    void bike()
    {
        System.out.println("Normal Bike");
    }
}
class Son extends Father{
    @Override
    void bike()
    {
        System.out.println("Modified Bike");
    }
}
class MainClass2{
    public static void main(String[] args) {
        Father f = new Father();
        f.bike();
        Son s = new Son();
        s.bike();
        f=s;
        f.bike();
    }
}
