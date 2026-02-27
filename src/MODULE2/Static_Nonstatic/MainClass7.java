package MODULE2.Static_Nonstatic;

class Emp{
    String name;
    int id;
    double salary;
}


public class MainClass7 {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.name="Prajwal";
        e1.id=76;
        e1.salary=100000;
        System.out.println("Employee Name : "+e1.name);
        System.out.println("Employee Id : "+e1.id);
        System.out.println("Employee Salary : "+e1.salary);

    }
}
