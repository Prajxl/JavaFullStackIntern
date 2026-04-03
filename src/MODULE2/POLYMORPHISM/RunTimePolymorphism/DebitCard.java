package MODULE2.POLYMORPHISM.RunTimePolymorphism;

public class DebitCard extends Card{
    @Override
    void swipe()
    {
        System.out.println("Balance Reduces");
    }
}
