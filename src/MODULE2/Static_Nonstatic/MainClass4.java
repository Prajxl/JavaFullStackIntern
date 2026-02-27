package MODULE2.Static_Nonstatic;


class Pen{
    double price;
    String brand;
    String color;
}

public class MainClass4 {
    public static void main(String[] args) {

        System.out.println("Main Method Started");
        Pen p1 = new Pen();
        System.out.println("Pen Price= "+p1.price);
        System.out.println("Pen Color= "+p1.color);
        System.out.println("Pen brand= "+p1.brand);
        System.out.println("-----------------------------");
        p1.color="Blue";
        p1.price=10.0;
        p1.brand="Doms";
        System.out.println("Pen Price= "+p1.price);
        System.out.println("Pen Color= "+p1.color);
        System.out.println("Pen brand= "+p1.brand);
        System.out.println("-----------------------------");

        Pen p2 = new Pen();
        p2.color="Black";
        p2.price=15.0;
        p2.brand="Luclu7";
        System.out.println("Pen Price= "+p2.price);
        System.out.println("Pen Color= "+p2.color);
        System.out.println("Pen brand= "+p2.brand);
        System.out.println("Main method ended");
    }
}
