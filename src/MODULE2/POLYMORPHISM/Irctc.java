package MODULE2.POLYMORPHISM;

public class Irctc {
    void search(String src,String dest)
    {
        System.out.println("Route Details");
    }
    void search(int trainNumber)
    {
        System.out.println("Train Details");
    }
    void search(long pnr)
    {
        System.out.println("Ticket Details");
    }
}
class MainClass{
    public static void main(String[] args) {
        Irctc obj = new Irctc();
        obj.search("Bnglr","Chennai");
        obj.search(165215);
        obj.search(963852852852L);
    }
}
