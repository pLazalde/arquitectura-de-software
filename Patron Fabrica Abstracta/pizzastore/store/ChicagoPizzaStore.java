package pizzastore.store;

import pizzastore.factory.ChicagoPizzaIngredientFactory;
import pizzastore.factory.PizzaIngredientFactory;
import pizzastore.pizza.CheesePizza;
import pizzastore.pizza.ClamPizza;
import pizzastore.pizza.PepperoniPizza;
import pizzastore.pizza.Pizza;
import pizzastore.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        
        // Instanciamos la fábrica de ingredientes para Chicago
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Deep Dish Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        
        return pizza;
    }
}
