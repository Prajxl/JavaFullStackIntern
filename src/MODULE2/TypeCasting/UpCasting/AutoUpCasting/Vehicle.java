package MODULE2.TypeCasting.UpCasting.AutoUpCasting;

public class Vehicle {
}
class Bike extends Vehicle{

}
class Car extends Vehicle{

}
class Buggy extends Vehicle{

}
class VehicleSimulator{
    static void driveVehicle(Vehicle v)
    {
        System.out.println("Driving the vehicle");
    }
}
class MaiClass
{
    public static void main(String[] args) {
        Bike b = new Bike();
        VehicleSimulator.driveVehicle(b);
        Car c = new Car();
        VehicleSimulator.driveVehicle(c);
        Buggy bg= new Buggy();
        VehicleSimulator.driveVehicle(bg);
    }
}