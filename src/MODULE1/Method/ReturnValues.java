package MODULE1.Method;

public class ReturnValues {
    static int test()     // 1.Declared return type
    {
        return 10;       // 2. Return an compatible value
    }
    public static void main(String[] args) {
        int val=test();   // 3.Captured Value using an Variable
        System.out.println("Value Returned By Storing method Value in an Variable: "+val);
        System.out.println("Value Returned Directly: "+test());    // 3. Directly CAptured value from method called
    }
}
