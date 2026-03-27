package MODULE2.Inheritance.thisandSuperCallStatmnt;

public class EX1Person {
    int age;
    String name;
    double height;
    double weight;
    EX1Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    EX1Person(int age,String name,double height)
    {
        this(age, name);
        this.height=height;
    }
    EX1Person(int age,String name,double height,double weight)
    {
        this(age,name,height);
        this.weight=weight;
    }
    public void display()
    {
        System.out.println("Age : "+age);
        System.out.println("name : "+name);
        System.out.println("height : "+height);
        System.out.println("weight : "+weight);

    }

}
class MainClassEx1{
    public static void main(String[] args) {
        EX1Person p1 = new EX1Person(21,"Prajwal",185.6,67.8);
        p1.display();
        EX1Person p2 = new EX1Person(22,"Amarjith",185.6,90.8);
        p2.display();
    }
}
