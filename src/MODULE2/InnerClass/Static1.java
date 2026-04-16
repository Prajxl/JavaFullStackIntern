package MODULE2.InnerClass;
//STATIC INNER CLASS
//STATIC INNER CLASS
//STATIC INNER CLASS

public class Static1 {
    static class Sample{          //STATIC INNER CLASS
        void test()
        {
            System.out.println("Executing()......");
        }
    }
}
class MainClass1{
    public static void main(String[] args) {
        Static1.Sample ref = new Static1.Sample();
        ref.test();
    }
}