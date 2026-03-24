package MODULE2.ReturnAndPassObject.Card;

public class MainClass {
    public static void main(String[] args) {
        DebitCard c1 = Visa.issueDebitCard();
        Visa.displayCardInfo(c1);
        DebitCard c2 = Visa.issueDebitCard();
        Visa.displayCardInfo(c2);
    }
}
