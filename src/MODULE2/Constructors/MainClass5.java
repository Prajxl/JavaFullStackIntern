package MODULE2.Constructors;

class TicketCounter{
    int counterNumber;
    int numberOfTickets;
    String ticket_Officer_Name;

    TicketCounter(int counterNumber,int numberOfTickets,String ticket_Officer_Name)
    {
        this.counterNumber=counterNumber;
        this.numberOfTickets=numberOfTickets;
        this.ticket_Officer_Name=ticket_Officer_Name;
        System.out.println("Counter Number= "+counterNumber+" "+"Number of Ticker= "+numberOfTickets+" Ticket Officer Name= "+ticket_Officer_Name);
    }

    void display()
    {
        System.out.println("Counter Number= "+counterNumber+" "+"Number of Ticker= "+numberOfTickets+" Ticket Officer Name= "+ticket_Officer_Name);
    }

}

public class MainClass5 {
    public static void main(String[] args) {
        TicketCounter t1 = new TicketCounter(1,100,"Prajwal");
        t1.display();
        TicketCounter t2 = new TicketCounter(2,95,"nandan");
        t2.display();
    }
}
