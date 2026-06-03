package MODULE3;

public class Finalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Bye Bye");
    }
}
class MainClass
{
    public static void main(String[] args) {
        Finalize f = new Finalize();
        System.gc();
        f=null;
        System.gc();
    }

}
