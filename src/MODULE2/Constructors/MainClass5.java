package MODULE2.Constructors;

import java.util.Scanner;

class  TicketCounter{
    int counterNumber;
    int numberOfTickets;
    String ticketOfficerName;
    static int sumOfTicket=0;

    TicketCounter(int counterNumber,int numberOfTickets,String ticketOfficerName) {
        this.counterNumber = counterNumber;
        this.numberOfTickets = numberOfTickets;
        this.ticketOfficerName = ticketOfficerName;
        sumOfTicket += numberOfTickets;
    }

    void details()
    {
        System.out.println("Counter Number= "+counterNumber+"\n"+"Number of Ticker= "+numberOfTickets+"\nTicket Officer Name= "+ ticketOfficerName);
        System.out.println("There are "+numberOfTickets+" Available at counter "+counterNumber);
    }

    static void availableTicket()
    {
        System.out.println("There are Total = "+  sumOfTicket +" Available");
    }

    void buyTickets(Scanner sc)
    {
        System.out.print("Enter the Number of ticket needed = ");
        int n=sc.nextInt();
        if(sumOfTicket>=n)
        {
            System.out.println("Buying "+n+" tickets, success");
            sumOfTicket = sumOfTicket - n;
            System.out.println("Available Ticket = "+sumOfTicket);
        }else
        {
            System.out.println("Buying "+n+" tickets, Failed, due to insufficient ticekts in counter"+counterNumber);
        }
    }


}

public class MainClass5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TicketCounter t1 = new TicketCounter(1,10,"Prajwal");
        t1.details();
        TicketCounter t2 = new TicketCounter(2,9,"nandan");
        t2.details();
        TicketCounter.availableTicket();
        t1.buyTickets(sc);
    }
}
