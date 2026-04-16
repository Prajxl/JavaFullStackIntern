package MODULE2.PartialAbstraction.Car;

public class Alto extends Car{
    @Override
    void gear(){
        System.out.println("Manual");
    }
    @Override
    void fuel()
    {
        System.out.println("Petrol");
    }
}

class Innova extends Car{
    @Override
    void gear()
    {
        System.out.println("AutoMatic");
    }

    @Override
    void fuel()
    {
        System.out.println("Diesel");
    }
}
