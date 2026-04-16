package MODULE2.InnerClass;
//NON-STATIC INNER CLASS
//NON-STATIC INNER CLASS
//NON-STATIC INNER CLASS

public class NonStatic1 {
    class Beta{
        void disp()
        {
            System.out.println("Non Static Inner Class");
        }
    }
}
class MainClass2{
    public static void main(String[] args) {
        NonStatic1.Beta ref = new NonStatic1().new Beta();
        ref.disp();
    }
}