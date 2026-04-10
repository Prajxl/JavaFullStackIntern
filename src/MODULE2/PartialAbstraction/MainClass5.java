package MODULE2.PartialAbstraction;

public class MainClass5 {
    public static void main(String[] args) {
        Vivo v = new Vivo();
        AndroidEmulator.emulate(v);

        Oppo p = new Oppo();
        AndroidEmulator.emulate(p);

        Samsung s = new Samsung();
        AndroidEmulator.emulate(s);
    }
}
