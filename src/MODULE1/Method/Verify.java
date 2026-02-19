package MODULE1.Method;

public class Verify {
    static void verify()
    {
        System.out.println("Executing verify()........");
        int a=7;
        if(a%2==0)
        {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("Jai Ho");
            }
        }else {
            System.out.println("Not Verified");
        }
    }
    public static void main(String[] args) {
        verify();
    }
}
