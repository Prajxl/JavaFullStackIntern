package MODULE3.OBJECTCLASS.Clone;

public class DataBackup implements Cloneable{
    int size=101;
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class MainClass
{
    public static void main(String[] args) throws CloneNotSupportedException {
        DataBackup db= new DataBackup();
        db.size=100;
        DataBackup dbCopy= (DataBackup) db.clone();
        System.out.println(dbCopy.size);
    }
}
