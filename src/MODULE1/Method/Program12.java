package MODULE1.Method;

public class Program12 {
    static double doubleReturned()
    {
        return 4.5;
    }
    static float floatReturned()
    {
        return 4.5f;
    }
    static long longReturned()
    {
        return 98745236523L;
    }
    static char charReturned()
    {
        return 'P';
    }
    static String stringReturned()
    {
        return "Prajwal";
    }
    static boolean BoolReturned()
    {
        return true;
    }
    public static void main(String[] args) {

        double d=doubleReturned();
        System.out.println("Double Returned: "+d);
        System.out.println("Double Returned: "+doubleReturned());

        float f=floatReturned();
        System.out.println("float returned: "+f);
        System.out.println("float returned: "+floatReturned());

        long l=longReturned();
        System.out.println("Long Returned: "+l);

        char ch=charReturned();
        System.out.println("Character Returned: "+ch);

        String s=stringReturned();
        System.out.println("String Returned: "+s);

        boolean b=BoolReturned();
        System.out.println("Boolean Value Returned: "+b);

    }
}
