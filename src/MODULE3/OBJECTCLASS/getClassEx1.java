package MODULE3.OBJECTCLASS;


import java.util.Scanner;

public class getClassEx1 {
}
class Sample extends getClassEx1
{

}
class MainClass5{
    public static void main(String[] args) {
        Object obj1= new getClassEx1();
        System.out.println(obj1.getClass());
        Object obj2 = new Sample();
        System.out.println(obj2.getClass());
        Object o3 = new Scanner(System.in);
        System.out.println(o3.getClass());
        Object o4 = new Object();
        System.out.println(o4.getClass());
    }
}
