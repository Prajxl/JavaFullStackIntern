package MODULE2.PartialAbstraction;
abstract class Delta {
    void help()
    {
        System.out.println("Help.....");
    }
    void verify()
    {
        System.out.println("Verify.....");
    }
    void play()
    {
        System.out.println("play......");
    }
}
class Example extends Delta{

}
class MainClass3
{
    public static void main(String[] args) {
        Delta ref = new Example();
        ref.help();
        ref.play();
        ref.verify();
    }
}
