package factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TicketFabrik {

	public static Ticket getTicket() {
		Ticket ticket = null;
		
		// April 4 bis Oktober 10 Sommerticket
		int monat = new GregorianCalendar().get(Calendar.MONTH) + 1; // Monat beginnt bei Januar = 0
		if(monat >= 4 && monat <= 10) {
			ticket = new SommerTicket();
		}else {
			ticket = new WinterTicket();
		}
		
		return ticket;
	}
	
}
