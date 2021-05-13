package group69.pizzaAPI.order;

import java.time.LocalDateTime;
import java.util.List;

import group69.pizzaAPI.pizza.Pizza;

public class Order 
{
	private long id;
	private long customerId;
	private String status;
	private LocalDateTime orderedAt;
	private boolean takeaway;
	private String paymentType;
	private Address deliveryAddress;
	private List<Pizza> pizzas;
	
	public Order()
	{
		
	}
	
	public Order(long id, 
				long customerId, 
				String status, 
				LocalDateTime orderedAt, 
				boolean takeaway, 
				String paymentType,
				Address deliveryAddress,
				List<Pizza> pizzas) 
	{
		this.id = id;
		this.customerId = customerId;
		this.status = status;
		this.orderedAt = orderedAt;
		this.takeaway = takeaway;
		this.paymentType = paymentType;
		this.deliveryAddress = deliveryAddress;
		this.pizzas = pizzas;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + 
				", customerId=" + customerId +
				", status=" + status +
				", orderedAt=" + orderedAt+ 
				", takeaway=" + takeaway + 
				", paymentType=" + paymentType + 
				", deliveryAddress=" + deliveryAddress
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String cancelled) {
		this.status = cancelled;
	}

	public LocalDateTime getOrderedAt() {
		return orderedAt;
	}

	public void setOrderedAt(LocalDateTime orderedAt) {
		this.orderedAt = orderedAt;
	}

	public boolean isTakeaway() {
		return takeaway;
	}

	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
}
