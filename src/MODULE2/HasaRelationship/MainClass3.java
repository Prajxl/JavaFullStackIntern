package MODULE2.HasaRelationship;

class SimCard{
    void call()
    {

    }
}
class Camera {
    void photo()
    {

    }
}
class Mobile
{
    Camera cam = new Camera(); // Compostion
    SimCard sim; // Aggregation
    Mobile(SimCard sim)
    {
        this.sim=sim;
    }
}
public class MainClass3 {
    public static void main(String[] args) {
        SimCard aritel = new SimCard();
        Mobile realme = new Mobile(aritel);
        realme.cam.photo();
        realme.sim.call();
    }
}
