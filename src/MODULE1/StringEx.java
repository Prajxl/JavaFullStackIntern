package MODULE1;

public class StringEx {
    public static void main(String[] args) {
        String s1="Ja";
        String s2="va";
        String s3=s1+s2; // Object creation Non constant pool s3 store
        String s4="Java"; // Constant pool
        System.out.println(s3==s4); // different adresss
        System.out.println(s3.equals(s4));
    }
}
