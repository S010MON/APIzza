package group69.pizzaAPI.order;

import java.util.List;

import group69.pizzaAPI.pizza.Pizza;
import group69.pizzaAPI.pizza.PizzaRequest;

public class OrderRequest 
{
	private List<PizzaRequest> pizzaRequests;
	private boolean takeaway;
	private String payment_type;
	private long customer_id;
	private Address delivery_address;
	
	public OrderRequest()
	{
		
	}
	
	public OrderRequest(List<PizzaRequest> pizzaRequests,
					boolean takeaway,
					String payment_type,
					long customer_id,
					Address delivery_address) 
	{
		super();
		this.pizzaRequests = pizzaRequests;
		this.takeaway = takeaway;
		this.payment_type = payment_type;
		this.customer_id = customer_id;
		this.delivery_address = delivery_address;
	}

	public List<PizzaRequest> getPizzaRequests() {
		return pizzaRequests;
	}

	public void setPizzasRequests(List<PizzaRequest> pizzaRequests) {
		this.pizzaRequests = pizzaRequests;
	}

	public boolean isTakeaway() {
		return takeaway;
	}

	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}

	public String getPaymentType() {
		return payment_type;
	}

	public void setPaymentType(String paymentType) {
		this.payment_type = paymentType;
	}

	public long getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(long customer_id) {
		this.customer_id = customer_id;
	}

	public Address getDeliveryAddress() {
		return delivery_address;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.delivery_address = deliveryAddress;
	}

	@Override
	public String toString() {
		return "OrderRequest [pizzas=" + pizzaRequests + ", takeaway=" + takeaway + ", payment_type=" + payment_type
				+ ", customer_id=" + customer_id + ", delivery_address=" + delivery_address + "]";
	}
}
