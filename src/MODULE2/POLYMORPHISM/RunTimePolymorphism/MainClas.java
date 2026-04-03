package MODULE2.POLYMORPHISM.RunTimePolymorphism;

public class MainClas {
    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        Shop.payment(dc);
        CreditCard cd = new CreditCard();
        Shop.payment(cd);
    }
}
