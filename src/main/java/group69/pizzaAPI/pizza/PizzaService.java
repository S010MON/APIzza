package group69.pizzaAPI.pizza;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import group69.pizzaAPI.DataBase;
import group69.pizzaAPI.exceptions.PizzaNotFoundException;

@Service
public class PizzaService 
{
	
	public List<Pizza> getPizza()
	{
		return DataBase.getDataBase().getPizzas();
	}
	
	public List<Pizza> getPizzaById(long id) throws PizzaNotFoundException
	{
		return DataBase.getDataBase().getPizzaById(id);
	}
}
