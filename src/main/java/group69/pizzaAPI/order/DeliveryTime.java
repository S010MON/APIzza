package group69.pizzaAPI.order;

import java.time.LocalDateTime;

public class DeliveryTime 
{
	private LocalDateTime delivery_time;

	public DeliveryTime() {
		super();
	}

	public DeliveryTime(LocalDateTime delivery_time) {
		this.delivery_time = delivery_time;
	}

	public LocalDateTime getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(LocalDateTime delivery_time) {
		this.delivery_time = delivery_time;
	}
	
	
}
