package sii.maroc;

public class Ticket {
	
	String ticketName;
	int numberOfItems=0;
	public Ticket(String ticketName) {
		// TODO Auto-generated method stub
		this.ticketName=ticketName;
	}
	public Ticket and(String contenuTicket) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket(contenuTicket);
		return ticket;
	}

}
