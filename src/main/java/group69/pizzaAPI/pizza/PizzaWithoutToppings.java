package group69.pizzaAPI.pizza;

public class PizzaWithoutToppings 
{
	private long id;
	private String name;
	private boolean vegeterian;
	private double price;
	private String note;

	public PizzaWithoutToppings(long id, String name, boolean vegeterian, double price)
	{
		this.id = id;
		this.name = name;
		this.vegeterian = vegeterian;
		this.price = price;
		note = null;
	}
	
	public PizzaWithoutToppings(long id, String name, boolean vegeterian, double price, String note)
	{
		this.id = id;
		this.name = name;
		this.vegeterian = vegeterian;
		this.price = price;
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", vegeterian=" + vegeterian + ", price=" + price + "]";
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
