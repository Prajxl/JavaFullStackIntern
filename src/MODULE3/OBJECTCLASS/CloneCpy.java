package MODULE3.OBJECTCLASS;

public class CloneCpy implements Cloneable{
    int hiScore=100;

    public static void main(String[] args) throws CloneNotSupportedException{
        CloneCpy org = new CloneCpy();
        org.hiScore =200;
        CloneCpy cpy = (CloneCpy) org.clone();
        System.out.println(cpy.hiScore);
    }
}
