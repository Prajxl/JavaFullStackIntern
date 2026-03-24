package MODULE2.ReturnAndPassObject;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = Helper.createPerson();
        Helper.displayPersonDetails(p1);

        Person p2 = Helper.createPerson();
        Helper.displayPersonDetails(p2);

        Person p3 = Helper.createPerson();
        Helper.displayPersonDetails(p3);
    }
}
