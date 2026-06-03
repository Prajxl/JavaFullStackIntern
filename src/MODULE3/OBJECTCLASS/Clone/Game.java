package MODULE3.OBJECTCLASS.Clone;

public class Game implements Cloneable{
    int hiScore=100;

    public static void main(String[] args) throws CloneNotSupportedException{
        Game original = new Game();
        original.hiScore=5000;
        Game copy = (Game) original.clone();
        System.out.println(copy.hiScore);
    }
}
