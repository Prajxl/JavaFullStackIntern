package MODULE2.POLYMORPHISM;

public class Flipkart {
    void payment()
    {
        System.out.println("COD");
    }
    void payment(long card)
    {
        System.out.println("Card");
    }
    void payment(String upi)
    {
        System.out.println("Google Pay");
    }
}
class MainClass1
{
    public static void main(String[] args) {
        Flipkart ref = new Flipkart();
        ref.payment();
        ref.payment(852963741L);
        ref.payment("GPAY");
    }
}
