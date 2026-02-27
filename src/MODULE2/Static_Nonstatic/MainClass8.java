package MODULE2.Static_Nonstatic;

class BankAcc{
    String holderName;
    double deposite;
    int accNumber;
}

public class MainClass8 {
    public static void main(String[] args) {
        BankAcc acc1 = new BankAcc();
        acc1.holderName="Prajwal";
        acc1.accNumber=1457545;
        acc1.deposite=550000;
        System.out.println("Holder name = "+acc1.holderName);
        System.out.println("Account Number = "+acc1.accNumber);
        System.out.println("Deposite = "+acc1.deposite);
    }
}
