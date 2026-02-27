package MODULE2.Static_Nonstatic;

class Laptop{
    String brand;
    double price;
    String modelName;
    int ram;
    int Process;
    String intelChip;
    String screen;
}

public class MainClass6 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand="ACER";
        l1.price=67000;
        l1.modelName="Aspire7";
        l1.ram=6;
        l1.Process=3050;
        l1.intelChip="i5";
        l1.screen="FULL HD";

        System.out.println("Model Brand= "+l1.brand+"\nModel Name="+l1.modelName+"\nCHipSet="+l1.intelChip+"\nScreen Type="+l1.screen+"\nLaptop Price="+l1.price+"\nRam="+l1.ram);

    }
}
