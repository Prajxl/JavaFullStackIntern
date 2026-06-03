package MODULE3.OBJECTCLASS.Clone;

public class Whatsapp implements Cloneable{
    String name;
    long number;

    public static void main(String[] args) throws CloneNotSupportedException {
        Whatsapp w1 = new Whatsapp();
        w1.name="Prajwal";
        w1.number=9995297416L;
        Whatsapp w1Copy = (Whatsapp) w1.clone();
        System.out.println(w1.name);
        System.out.println(w1.number);
    }

}
