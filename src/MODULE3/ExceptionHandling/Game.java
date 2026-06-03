package MODULE3.ExceptionHandling;

public class Game implements Cloneable{
    int hiScore=100;

    public static void main(String[] args) {
        System.out.println("Program starts");
        Game original = new Game();
        original.hiScore=5000;
        try{
            Game copy=(Game)original.clone();
            System.out.println(copy.hiScore);
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("Clone Operation FAiled");
        }
        System.out.println("Program ends");
    }
}
