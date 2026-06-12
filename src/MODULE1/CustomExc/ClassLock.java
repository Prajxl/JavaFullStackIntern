package MODULE1.CustomExc;

public class ClassLock {
    static void watchTv()
    {
        System.out.println("watching the tv");
    }
    static void play(){
        System.out.println("Playing");
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run()
    {

        synchronized (ClassLock.class){
            Thread to = Thread.currentThread();
            System.out.println(to.getPriority());
            System.out.println(to.getName());
            ClassLock.play();
            ClassLock.watchTv();
        }
    }
}
class MainClass7{
    public static void main(String[] args) {
        MyThread1 thi = new MyThread1();
        Thread t1 = new Thread(thi);
        Thread t2 = new Thread(thi);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.setPriority(4);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
