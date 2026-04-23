package MODULE3.OBJECTCLASS.Clone;

public class Clone1 implements Cloneable{
    int highScore=100;
}
class MainClass1{
    public static void main(String[] args) throws CloneNotSupportedException{
        Clone1 c = new Clone1();
        c.highScore=500;
        Clone1 c1 = (Clone1) c;
        System.out.println(c1.highScore);
    }
}
