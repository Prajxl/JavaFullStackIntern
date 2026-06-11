package MODULE3.Multithread;

public class ExThhread
{
    public static void main(String[] args) {
        int x=10;
        int y=32;
        int z=19;

        y=x++ + y++ + ++z - x++ - ++y - z++;
        x=y-- + --y + ++x - y++ - --x + z++;
        z=y++ + --z + --y + z++ - --z + y++;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
