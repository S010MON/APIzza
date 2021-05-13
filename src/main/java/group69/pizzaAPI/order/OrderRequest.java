
package group69.pizzaAPI.order;

import java.util.List;

import group69.pizzaAPI.pizza.Pizza;
import group69.pizzaAPI.pizza.PizzaRequest;

public class OrderRequest 
{
	private List<PizzaRequest> pizzas;
	private boolean takeaway;
	private String payment_type;
	private long customer_id;
	private Address delivery_address;
	
	public OrderRequest()
	{
		
	}
	
	public OrderRequest(List<PizzaRequest> pizzas,
					boolean takeaway,
					String payment_type,
					long customer_id,
					Address delivery_address) 
	{
		super();
		this.pizzas = pizzas;
		this.takeaway = takeaway;
		this.payment_type = payment_type;
		this.customer_id = customer_id;
		this.delivery_address = delivery_address;
	}

	public List<PizzaRequest> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<PizzaRequest> pizzas) {
		this.pizzas = pizzas;
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

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public Address getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(Address delivery_address) {
		this.delivery_address = delivery_address;
	}

	@Override
	public String toString() {
		return "OrderRequest [pizzas=" + pizzas + ", takeaway=" + takeaway + ", payment_type=" + payment_type
				+ ", customer_id=" + customer_id + ", delivery_address=" + delivery_address + "]";
	}
}
