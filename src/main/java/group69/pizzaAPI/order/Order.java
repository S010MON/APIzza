package group69.pizzaAPI.order;

import java.time.LocalDateTime;
import java.util.List;

import group69.pizzaAPI.pizza.Pizza;

public class Order 
{
	private long id;
	private long customer_id;
	private String status;
	private LocalDateTime ordered_at;
	private boolean takeaway;
	private String payment_type;
	private Address delivery_address;
	private List<Pizza> pizzas;
	
	public Order()
	{
		
	}
	
	public Order(long id, 
				long customer_id,
				String status, 
				LocalDateTime ordered_at,
				boolean takeaway, 
				String payment_type,
				Address delivery_address,
				List<Pizza> pizzas) 
	{
		this.id = id;
		this.customer_id = customer_id;
		this.status = status;
		this.ordered_at = ordered_at;
		this.takeaway = takeaway;
		this.payment_type = payment_type;
		this.delivery_address = delivery_address;
		this.pizzas = pizzas;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + 
				", customer_id=" + customer_id +
				", status=" + status +
				", orderedAt=" + ordered_at +
				", takeaway=" + takeaway + 
				", payment_type=" + payment_type +
				", delivery_address=" + delivery_address
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String cancelled) {
		this.status = cancelled;
	}

	public LocalDateTime getOrdered_at() {
		return ordered_at;
	}

	public void setOrdered_at(LocalDateTime ordered_at) {
		this.ordered_at = ordered_at;
	}

	public boolean isTakeaway() {
		return takeaway;
	}

	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public Address getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(Address delivery_address) {
		this.delivery_address = delivery_address;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
}
