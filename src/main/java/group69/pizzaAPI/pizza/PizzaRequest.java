package group69.pizzaAPI.pizza;

public class PizzaRequest 
{
	private long pizza_id;
	private String note;
	
	public PizzaRequest() 
	{
		
	}
	
	public PizzaRequest(long pizza_id, String note)
	{
		this.pizza_id = pizza_id;
		this.note = note;
	}

	public long getId() {
		return pizza_id;
	}

	public void setId(long pizza_id) {
		this.pizza_id = pizza_id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
