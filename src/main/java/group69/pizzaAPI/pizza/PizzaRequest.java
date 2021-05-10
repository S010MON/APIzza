package group69.pizzaAPI.pizza;

public class PizzaRequest 
{
	private long id;
	private String note;
	
	public PizzaRequest() 
	{
		
	}
	
	public PizzaRequest(long id, String note) 
	{
		this.id = id;
		this.note = note;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
