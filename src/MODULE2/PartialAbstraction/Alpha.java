package MODULE2.PartialAbstraction;

import MODULE2.TypeCasting.UpCasting.A;

abstract class Alpha {
    abstract void play();
    void send()
    {
        System.out.println("Sending....");
    }
}
class Beta extends Alpha{
    @Override
    void play()
    {
        System.out.println("Play executing..");
    }


}
class MainClass2{
    public static void main(String[] args) {
        Alpha a = new Beta();
        a.play();
        a.send();

    }
}
