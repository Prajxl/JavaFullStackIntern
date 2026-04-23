package MODULE3.OBJECTCLASS.Clone;

public class Contact implements Cloneable{
    String name;
    long number;

    public static void main(String[] args) throws CloneNotSupportedException {

        Contact c = new Contact();
        c.name="Uday";
        c.number=9148944088L;

        Contact replica = (Contact) c.clone();
        System.out.println(replica.name);
        System.out.println(replica.number);

        c.name="Prajwal";
        c.number=9995297416L;

        System.out.println(replica.name);
        System.out.println(replica.number);
    }
}
