package MODULE1.STRING;

public class startWith_endsWith {
    public static void main(String[] args) {
        String str ="Engineering";
        System.out.println(str.contains("job"));
        System.out.println(str.contains("gin"));
        System.out.println();

        System.out.println(str.startsWith("eng"));
        System.out.println(str.startsWith("Engine"));
        System.out.println();

        System.out.println(str.endsWith(" ing"));
        System.out.println(str.endsWith("ring"));

    }
}
