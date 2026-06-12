package MODULE1.CustomExc;

public class ObjectLock {
    void play()
    {
        System.out.println("Cricket");
    }
    void disp()
    {
        System.out.println("Score");
    }
}
class Mythread implements Runnable
{
    ObjectLock ref = new ObjectLock();
    @Override
    public void run()
    {
        synchronized (ref)
        {
            ref.disp();
            ref.play();
        }
    }
}
class MainClass6{
    public static void main(String[] args) {
        Mythread th = new Mythread();
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        t1.start();
        t2.start();
    }
}
