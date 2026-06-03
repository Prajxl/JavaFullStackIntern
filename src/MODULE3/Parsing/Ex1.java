package MODULE3.Parsing;

public class Ex1 {
    public static void main(String[] args) {
//        String str = "100A"; // Number Format Exception
        String str = "100";
        int x = Integer.parseInt(str);
        System.out.println(x);
        String s2 = "10.44";
        double y = Double.parseDouble(s2);
        System.out.println(y);
        String s3 = "TUre";
        boolean b = Boolean.parseBoolean(s3);
        System.out.println(b);
        char c[] = str.toCharArray();
        System.out.println(c);
    }
}
