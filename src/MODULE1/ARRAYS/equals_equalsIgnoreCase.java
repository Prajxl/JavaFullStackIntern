package MODULE1.ARRAYS;

public class equals_equalsIgnoreCase {
    public static void main(String[] args) {
        String str="j2ee";
        System.out.println(str.equals("Adv Java"));
        System.out.println(str.equals("J2EE"));
        System.out.println(str.equals("j2ee"));

        System.out.println(str.equalsIgnoreCase("ADv java"));
        System.out.println(str.equalsIgnoreCase("J2EE"));
        System.out.println(str.equalsIgnoreCase("j2ee"));
    }
}
