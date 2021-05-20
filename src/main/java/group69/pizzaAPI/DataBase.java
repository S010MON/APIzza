package group69.pizzaAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import group69.pizzaAPI.exceptions.*;
import group69.pizzaAPI.order.*;
import group69.pizzaAPI.pizza.*;

public class DataBase 
{
	private final int NO_CANCEL_AFTER = 5; //minutes
	
	private static DataBase dataBase = new DataBase();
	
	public long highestCustomerId = 1L;
	public long highestOrderId = 1L;
	public List<Pizza> pizzas = new ArrayList<Pizza>();	
	public List<Order> orders = new ArrayList<Order>();
	

	public static DataBase getDataBase()
	{
		if(dataBase == null)
			dataBase = new DataBase();
		return dataBase;
	}
	
	public List<Pizza> getPizzas()
	{
		return pizzas;
	}
	
	public List<Order> getOrders()
	{
		return orders;
	}
	
	public List<Pizza> getPizzaById(long id) throws PizzaNotFoundException
	{
		for(Pizza each: pizzas)
		{
			if(each.getId() == id)
				return List.of(each);
		}
		throw new PizzaNotFoundException("Pizza Not Found");
	}
	
	public List<Order> getOrderByCustomerId(long id) throws OrderNotFoundException
	{
		for(Order each: orders)
		{
			if(each.getCustomerId() == id)
				return List.of(each);
		}
		throw new OrderNotFoundException("Customer Not Found");
	}
	
	public Order getOrderByOrderId(long id) throws OrderNotFoundException
	{
		for(Order each: orders)
		{
			if(each.getId() == id)
				return each;
		}
		throw new OrderNotFoundException("Customer Not Found");
	}
	
	public Order addOrder(OrderRequest orderRequest) throws OrderNotPlacedException
	{
		try {
			List<Pizza> pizzas = convertToPizzas(orderRequest.getPizzas());
		} catch (PizzaNotFoundException e) {
			throw new OrderNotPlacedException("Unable to locate pizza");
		}
		
		Order order = new Order(highestOrderId++, 
				orderRequest.getCustomer_id(), 
				"IN_PROGRESS", 
				LocalDateTime.now(), 
				orderRequest.isTakeaway(), 
				orderRequest.getPayment_type(),
				orderRequest.getDelivery_address(),
				pizzas);
		orders.add(order);
		return order;
	}
	
	public Order cancelOrder(long orderId) throws OrderNotCancelledException
	{
		Order order;
		try {
			order = getOrderByOrderId(orderId);
		} catch (OrderNotFoundException e) {
			throw new OrderNotCancelledException("Order not found");
		}
		if(ableToCancel(order))
		{
			if(order.getStatus().equalsIgnoreCase("CANCELLED"))
				throw new OrderNotCancelledException("Unable to cancel an already cancelled order");
			if(order.getStatus().equalsIgnoreCase("DELIVERED"))
				throw new OrderNotCancelledException("Unable to cancel an already delivered order");
		}
		order.setStatus("CANCELLED");
		return order;
	}
	
	private Pizza getPizzaByRequest(PizzaRequest request) throws PizzaNotFoundException
	{
		for(Pizza each: pizzas)
		{
			if(each.getId() == request.getId())
				return each;
		}
		throw new PizzaNotFoundException("Pizza Not Found");
	}

	private List<Pizza> convertToPizzas(List<PizzaRequest> list) throws PizzaNotFoundException
	{
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		for(PizzaRequest each: list)
		{
			pizzas.add(getPizzaByRequest(each));
		}
		return pizzas;
	}
	
	private boolean ableToCancel(Order order)
	{
		LocalDateTime lastMomentToChange = order.getOrderedAt().plusMinutes(NO_CANCEL_AFTER);
		if(LocalDateTime.now().isBefore(lastMomentToChange))
			return true;
		return false;		
	}


	// -----------------------------------------------------------------------------------
	/* Initialise a mock database for testing  */
	private DataBase()
	{
		String[] mag = {"Mozzarella", "Tomatoes", "Bazil"};
		pizzas.add(new Pizza(1L,
				"Margarita",
				true,
				12.50,
				mag));

		String[] meat = {"Meat", "More Meat", "Mystery Meat"};
		pizzas.add(new Pizza(2L,
				"Meatlovers",
				false,
				15.75,
				meat));
		String[] cyp = {"Chicken", "Haloumi", "Olives"};
		pizzas.add(new Pizza(3L,
				"Cyprus",
				false,
				14.00,
				cyp));
		String[] neo = {"Buffalo Mozzarella", "San Marzano", "Basil"};
		pizzas.add(new Pizza(4L,
				"Neapolitan",
				false,
				13.75,
				neo));
		String[] qfromage = {"Mozzarella", "Gorgonzola", "Fontina", "Parmigiano"};
		pizzas.add(new Pizza(5L,
				"Quattro Formaggi",
				false,
				12.75,
				qfromage));
		String[] nicole = {"Chicken", "Mozzarella", "Sweetcorn"};
		pizzas.add(new Pizza(6L,
				"Nicole Special",
				false,
				13.75,
				nicole));
		Address address = new Address("Tongerseweg 57B25",
				"Maastricht",
				"6213GA",
				"Nederland");
		
		orders.add(new Order(0, 
				1233456789, 
				"ACCEPTED", 
				LocalDateTime.now(), 
				true, 
				"buttons",
				address,
				List.of(pizzas.get(0), pizzas.get(0))));
	}
}
