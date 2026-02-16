public class Program8 {
    public static void main(String[] args) {
        double Principle = 100000.0;      // Loan Which we are taking from bank is Principle
        int tenure = 2;                  // Period of time we are taking

        float rate = 11.5F;
        double SimpleInterest = (Principle * tenure * rate) / 100;
        System.out.println(SimpleInterest);
        double totalrepayment = Principle + SimpleInterest;
        System.out.println("Total amount to pay "+totalrepayment);
        double emi = totalrepayment / (tenure * 12 );
        System.out.println("EMI to Pay Per Month "+emi);
    }
}
