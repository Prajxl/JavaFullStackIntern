package MODULE1.Method;

public class PassingValues2 {
    static void doublePass(double d)
    {
        System.out.println("Double Values : "+d);
    }
    static void floatpass(float f)
    {
        System.out.println("Float values : "+f);
    }
    static void boolPass(boolean bool)
    {
        System.out.println("Boolean Value : " +bool);
    }
    static void charPass(char ch)
    {
        System.out.println("Char value : "+ch);
        boolPass(true);
    }
    static void stringValue(String s)
    {
        System.out.println("String Value : "+s);
    }
    static void longPass(long l)
    {
        System.out.println("Long Value :" +l);
    }
    public static void main(String[] args) {
        doublePass(2.3);
        floatpass(3.2f);
        charPass('P');
        stringValue("Prajwal");
        longPass(98999999852L);
    }
}
