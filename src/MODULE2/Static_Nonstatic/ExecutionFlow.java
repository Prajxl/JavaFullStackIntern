package MODULE2.Static_Nonstatic;

class Demo{
    static {
        System.out.println("1-Static of Demo");
    }
    {
        System.out.println("1-Nonstatic block");
    }
    static {
        System.out.println("2-Static of Demo");
    }
    {
        System.out.println("2-Nonstatic block");
    }
}
public class ExecutionFlow {

    static {
        System.out.println("MainMethod Static block");
    }
    {
        System.out.println("Non static Block of Main");
    }
    public static void main(String[] args) {
        System.out.println("MainMethod Started");
        System.out.println("==========================");
        Demo d1 = new Demo();
        System.out.println("==========================");
        Demo d2 = new Demo();
        System.out.println("==========================");
        ExecutionFlow e1 = new ExecutionFlow();
    }
}


