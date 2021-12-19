package sii.maroc;


public class Meal {
	Ticket ticket;
	
	public Meal(Ticket ticket) {
		this.ticket=ticket;
	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		int premierNombre = Character.getNumericValue(ticket.ticketName.charAt(0));
		
		return premierNombre;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		int result=0;
		int premierNombre = Character.getNumericValue(ticket.ticketName.charAt(0));
		if(premierNombre>1) {
			for(int i=1;i<premierNombre;i++) {
				result+=3;
			}
			result+=6;
			return result;
		}
		return premierNombre*6;
	}

}
