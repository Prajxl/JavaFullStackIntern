package MODULE2.Inheritance.MethodOverriding;

public class Whatsapp {
    void readReceipt()
    {
        System.out.println("Sent");
    }
}
class Whatsapp2 extends Whatsapp{
    @Override
    void readReceipt()
    {
        System.out.println("Sent-Delivered");
    }
}
class Whatsapp3 extends Whatsapp2{
    @Override
    void readReceipt()
    {
        System.out.println("Sent-Delivered-Seen");
    }
}
class MainClass4{
    public static void main(String[] args) {
        Whatsapp w = new Whatsapp3();
        w.readReceipt();

    }
}
