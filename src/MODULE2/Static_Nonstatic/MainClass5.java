package MODULE2.Static_Nonstatic;

class TextBook{
    String name;
    int  Pages;
    double price;
    String authorName;
}

public class MainClass5 {
    public static void main(String[] args) {
        TextBook t1 = new TextBook();
        t1.name="All in One";
        t1.Pages=38;
        t1.authorName="Prajwal";
        t1.price=100.0;
        System.out.println("Text Book title =>"+t1.name);
        System.out.println("Text Book Pages =>"+t1.Pages);
        System.out.println("Text Book authorName=>"+t1.authorName);
        System.out.println("Text Book Price=>"+t1.price);

        TextBook t2 = new TextBook();
        t2.name="After";
        t1.Pages=50;
        t1.authorName="Anna Tood";
        t1.price=250.0;
        System.out.println("Text Book title =>"+t2.name);
        System.out.println("Text Book Pages =>"+t2.Pages);
        System.out.println("Text Book authorName=>"+t2.authorName);
        System.out.println("Text Book Price=>"+t2.price);
    }
}
