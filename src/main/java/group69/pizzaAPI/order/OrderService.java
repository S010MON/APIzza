package group69.pizzaAPI.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import group69.pizzaAPI.DataBase;
import group69.pizzaAPI.exceptions.OrderNotCancelledException;
import group69.pizzaAPI.exceptions.OrderNotFoundException;
import group69.pizzaAPI.exceptions.OrderNotPlacedException;

@Service
public class OrderService 
{
	public ArrayList<Order> database = new ArrayList<Order>();
	
	public List<Order> getOrders()
	{			
		return DataBase.getDataBase().getOrders();
	}
	
	public List<Order> getOrderByCustomerId(long id) throws OrderNotFoundException
	{
		return DataBase.getDataBase().getOrderByCustomerId(id);
	}
	
	public Order postOrder(OrderRequest orderRequest) throws OrderNotPlacedException
	{
		return DataBase.getDataBase().addOrder(orderRequest);
	}
	
	public Order cancelOrder(long order_Id) throws OrderNotCancelledException
	{
		return DataBase.getDataBase().cancelOrder(order_Id);
	}
	
	public List<Object> getDeliveryTime(long order_Id) throws OrderNotFoundException
	{
		Order order = DataBase.getDataBase().getOrderByOrderId(order_Id);
		DeliveryTime delivery_time = new DeliveryTime(order.getOrderedAt().plusMinutes(25));
		return List.of(order, delivery_time);
	}
}
