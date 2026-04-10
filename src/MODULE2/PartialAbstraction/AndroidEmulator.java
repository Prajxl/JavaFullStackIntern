package MODULE2.PartialAbstraction;

public class AndroidEmulator {
    static void emulate(Android a)
    {
        if(a!=null)
        {
            a.ui();
            a.kernel();
        }
    }
}
