package sii.maroc;
import sii.maroc.Ticket;


public class Restaurant {
	String ballsMozzarella;
	String tomatoes;
	String oliveOil;
	String pepper;
	String water;
	String flour;
	String seaSalt;
	
	
	public Restaurant() {
		
	}
	public Restaurant(String ballsMozzarella, String tomatoes, String oliveOil, String pepper) {
		// TODO Auto-generated constructor stub
		this.ballsMozzarella=ballsMozzarella;
		this.tomatoes=tomatoes;
		this.oliveOil=oliveOil;
		this.pepper=pepper;

	}

	public Restaurant(String flour, String tomatoes,String seaSalt, String ballsMozzarella, String oliveOil, String water) {
		// TODO Auto-generated constructor stub
		this.flour=flour;
		this.seaSalt=seaSalt;
		this.ballsMozzarella=ballsMozzarella;
		this.tomatoes=tomatoes;
		this.oliveOil=oliveOil;
		this.water=water;
		
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket(string);
		
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal =new Meal(ticket);

		return meal;
	}
	
	public Ticket and(String string) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket(string);
	
		int number =Character.getNumericValue(string.charAt(0));
		ticket.numberOfItems=number;
		
		return ticket;
	}
	


	
}
