package MODULE2.PartialAbstraction.Car;

public class MainClass6 {
    public static void main(String[] args) {
        Alto a = new Alto();
        CarSimulator.simulate(a);

        Innova i = new Innova();
        CarSimulator.simulate(i);
    }
}
