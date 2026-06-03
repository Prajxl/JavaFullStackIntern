package MODULE3.OBJECTCLASS;

class finalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Bye bye last object");
    }
}
class MainClass
{
    public static void main(String[] args) {
        finalize f1 = new finalize();
        System.gc();
        f1=null;
        System.gc();
    }
}