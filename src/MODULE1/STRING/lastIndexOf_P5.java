package MODULE1.STRING;

public class lastIndexOf_P5 {
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.lastIndexOf('p'));
        System.out.println(str.lastIndexOf('m'));

        int a = str.lastIndexOf('e');
        int b = str.lastIndexOf('e', a - 1);
        int c = str.lastIndexOf('e', b - 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}