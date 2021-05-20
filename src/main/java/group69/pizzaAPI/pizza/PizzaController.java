package group69.pizzaAPI.pizza;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import group69.pizzaAPI.exceptions.PizzaNotFoundException;

@RestController
@RequestMapping(path = "/api/pizza")
public class PizzaController 
{
	private final PizzaService pizzaService;
	
	@Autowired
	public PizzaController(PizzaService pizzaService)
	{
		this.pizzaService = pizzaService;
	}
	
	@GetMapping()
	public List<Pizza> getPizza()
	{
		return pizzaService.getPizza();
	}
	
	@GetMapping(value = "/{pizza_id}")
	public List<Pizza> getPizza(@PathVariable long pizza_id)
	{
		try {
			return pizzaService.getPizzaById(pizza_id);
		} catch(PizzaNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pizza_ID_Not_Found", e);
		}
	}
}
