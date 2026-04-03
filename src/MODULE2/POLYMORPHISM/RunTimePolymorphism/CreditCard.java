package MODULE2.POLYMORPHISM.RunTimePolymorphism;

public class CreditCard extends Card{
    @Override
    void swipe()
    {
        System.out.println("Due Increases");
    }
}
