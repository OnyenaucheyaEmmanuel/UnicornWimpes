public class Ticket {
    private int ticketId;
    private String passengerName;
    private String destination;

    public Ticket(){}
    public Ticket(int ticketId){
        this.ticketId = ticketId;
    }

    public Ticket(int i, String TicketName) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
    }

    public int getTicketId(){
        return ticketId;
    }
   public void setTicketId(int Id){
        this.ticketId = Id;
   }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
