package MODULE2.HasaRelationship;

public class Ex2 {
    void play()
    {
        System.out.println("Now doing example 2");
    }
}
class Example{
    Ex2 ref;
    Example(Ex2 ref)
    {
        this.ref=ref;
    }

}
class MainClass{
    public static void main(String[] args) {
        Ex2 e2 = new Ex2();
        Example e = new Example(e2);
        e.ref.play();
    }
}
