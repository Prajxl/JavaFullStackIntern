package MODULE2.MarkerInterface;

class SourceCode implements Code,Readable{
    @Override
     public void read()
    {
        System.out.println("Source Code Readable");
    }
    @Override
    public void write()
    {
        System.out.println("Surce code can be written");
    }

}
