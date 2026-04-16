package MODULE2.MarkerInterface;

public class ByteCode implements Code{
    @Override
    public void read()
    {
        System.out.println("Not human readable");
    }
    @Override
    public void write()
    {
        System.out.println("written by compiler");
    }

}
