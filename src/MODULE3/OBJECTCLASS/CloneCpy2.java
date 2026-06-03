package MODULE3.OBJECTCLASS;

public class CloneCpy2 implements Cloneable{
    int size;
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class MainClass4{
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneCpy2 org = new CloneCpy2();
        org.size=500;
        CloneCpy2 cpy = (CloneCpy2) org.clone();
        System.out.println(cpy.size);
    }
}