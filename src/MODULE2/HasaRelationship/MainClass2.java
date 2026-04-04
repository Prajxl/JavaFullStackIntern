package MODULE2.HasaRelationship;

class Engine{
    void power(){

    }
}
class Driver{
    void drive()
    {}
}
class Car{
    Engine eng = new Engine(); // Car has a Engine which is Strong association with Car = Composition
    Driver dr; // Car has driver which is weak Assiciation = aggregation
    Car(Driver dr)
    {
        this.dr=dr;
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        Driver d = new Driver();
        Car c = new Car(d);
        c.eng.power();
        c.dr.drive();
    }

}

