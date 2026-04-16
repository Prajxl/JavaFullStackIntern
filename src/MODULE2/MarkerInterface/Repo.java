package MODULE2.MarkerInterface;

public class Repo {
    public static void review(Code c)
    {
        if(c!=null)
        {
            c.write();
            if(c instanceof Readable)
            {
                c.read();
            }
        }
    }
}
