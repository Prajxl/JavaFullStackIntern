package MODULE2.Constructors;


class Pizza {
    String toping;
    String toping2;
    int price = 100;
    boolean cheese;

    Pizza(boolean c) {
        cheese = c;
        if (cheese==true) {
            price = price + 30;
        }
    }

    Pizza(boolean c, String t) {
        cheese = c;
        toping = t;
        price = price + 40;
        if (cheese == true) {
            price = price + 30;
        }
    }

    Pizza(boolean c, String t, String t2) {
        cheese = c;
        toping = t;
        toping2 = t2;
        price = price + 80;
        if (cheese == true) {
            price = price + 30;
        }
    }
}
public class MainClass {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(true,"Mushroom");
        System.out.println(p1.cheese+" "+p1.toping+" "+p1.price);
        Pizza p2 = new Pizza(true,"Corn","Onion");
        System.out.println(p2.cheese+" "+p2.toping+" "+p2.toping2+" "+p2.price);
        Pizza p3 = new Pizza(true);
        System.out.println(p3.price);
        Pizza p4 = new Pizza(false);
        System.out.println(p4.price);
    }
}

