package MODULE2.PartialAbstraction.Car;

public class CarSimulator {
    static void simulate(Car c)
    {
        if(c!=null)
        {
            c.drive();
            c.fuel();
            c.gear();
        }
    }
}
