package MODULE2.Inheritance.MethodOverriding;

public class Mother {
    void marriage()
    {
        System.out.println("Arranged Marriage");
    }
}
class Daughter extends Mother
{
    @Override
    void marriage()
    {
        System.out.println("Love Marriage");
    }
    void makeup()
    {
    }
}
class MainClass3{
    public static void main(String[] args) {
        Mother m= new Mother();
        m.marriage();
        Mother m2 = new Daughter(); // Here Mother Acessing Her Own Marriage Property not daughter but daughter modified it.
        m2.marriage();
        Daughter d = new Daughter();
        d.marriage();
        d.makeup();
    }
}
