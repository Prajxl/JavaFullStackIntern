package MODULE2.WideningAndNarrowing;

public class Narrowing {
    // Assining higher primitive dataype to Lower Primitve datatype
    // to perform narrowing its mandatory to write casting statement
    // its an explicit process which is not supported by the compiler
    static void Demo() {
        double x = 12.5;
        int a = (int) x;
        char c = (char) x;
        byte b = (byte) x;
        System.out.println(c);
        System.out.println(a);
    }


    public static void main(String[] args) {
       Narrowing.Demo();
    }
}
