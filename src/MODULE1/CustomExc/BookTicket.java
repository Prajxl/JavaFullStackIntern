package MODULE1.CustomExc;

public class BookTicket extends RuntimeException{
    BookTicket(){

    }
    BookTicket(String msg)
    {
        super(msg);
    }
}
class BookMyShow {
    private static int availableTicket=3;
    static void bookTicket()
    {
        availableTicket--;
        if(availableTicket==0)
        {
            throw new BookTicket("Ticket is sold out ");
        }
    }
}
class MainClass5
{
    public static void main(String[] args) {
        try{
            BookMyShow.bookTicket();
            BookMyShow.bookTicket();
            BookMyShow.bookTicket();
            BookMyShow.bookTicket();
        }catch (BookTicket e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}