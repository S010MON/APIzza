package group69.pizzaAPI.pizza;

public class Pizza 
{
	private long pizza_id;
	private String name;
	private boolean vegetarian;
	private double price;
	private String[] toppings;
	private String note;

	public Pizza(long pizza_id, String name, boolean vegetarian, double price, String[] toppings)
	{
		this.pizza_id = pizza_id;
		this.name = name;
		this.vegetarian = vegetarian;
		this.price = price;
		this.toppings = toppings;
		note = null;
	}
	
	public Pizza(long pizza_id, String name, boolean vegetarian, double price, String[] toppings, String note)
	{
		this.pizza_id = pizza_id;
		this.name = name;
		this.vegetarian = vegetarian;
		this.price = price;
		this.toppings = toppings;
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Pizza [id=" + pizza_id + ", name=" + name + ", vegetarian=" + vegetarian + ", price=" + price + "]";
	}
	
	public long getPizza_id() {
		return pizza_id;
	}

	public void setPizza_id(long pizza_id) {
		this.pizza_id = pizza_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
