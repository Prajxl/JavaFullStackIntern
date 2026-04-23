package MODULE3.OBJECTCLASS;

public class Student2 {
    String name="Alice";

    public String toString()
    {
        return "Student name :"+name;
    }
}

class Maiclass2{
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}