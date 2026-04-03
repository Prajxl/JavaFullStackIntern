package MODULE2.POLYMORPHISM.RunTimePolymorphism;

public class Shop {
    static void payment(Card c)
    {
        if(c!=null)
        {
            c.swipe();
        }
    }
}
