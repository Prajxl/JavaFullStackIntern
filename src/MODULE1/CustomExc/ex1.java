package MODULE1.CustomExc;

public class ex1 extends Exception {
    ex1()
    {

    }
    ex1(String msg)
    {
        super(msg);
    }
}
class Doctor{
    static void Pressure(int bp) throws ex1
    {
        if(bp<=50)
        {
            throw  new ex1("Blood Pressure Dropped to "+bp);
        }else {
            System.out.println("Blood pressure is normal");
        }
    }
}
class  MainClass{
    public static void main(String[] args) {
        try{
            Doctor.Pressure(49);
        }catch (ex1 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
