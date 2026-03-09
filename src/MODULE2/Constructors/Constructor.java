package MODULE2.Constructors;


class Circle
{
    double radius;
    final static double pi=3.14;

    Circle(double rad)
    {
        System.out.println("Creating a circle of radius "+rad);
        radius=rad;
    }

    void diameter()
    {
        double dia = 2*radius;
        System.out.println("Diameter "+dia);
    }

    void area()
    {
        double area = pi * radius *radius;
        System.out.println("Area = "+area);
    }

    void circumference()
    {
        double circum=2*pi*radius;
        System.out.println("Circumference = "+circum);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        c1.diameter();
        c1.area();
        c1.circumference();
    }
}
