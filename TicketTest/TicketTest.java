import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicketTest {
    private Ticket mojizaTicket;
    private Ticket annaTicket;
    private Ticket elijahTicket;

    @BeforeEach
    public void setUp() {
        mojizaTicket = new Ticket();
        mojizaTicket.setTicketId(1);
    }

    @Test
    public void getTicketId(){
        assertEquals(1, mojizaTicket.getTicketId());
    }
    @Test
    public void createTicketWithParameters(){
        annaTicket = new Ticket(2);
        assertEquals(2, annaTicket.getTicketId());
    }
    @Test
    public void createTicketWithPassengerName() {
        elijahTicket = new Ticket(3, "Elijah Escorter");
        elijahTicket.setPassengerName("Elijah Escorter");
        elijahTicket.setTicketId(3);
        assertEquals(3, elijahTicket.getTicketId());
        assertEquals("Elijah Escorter", elijahTicket.getPassengerName());
    }
}
