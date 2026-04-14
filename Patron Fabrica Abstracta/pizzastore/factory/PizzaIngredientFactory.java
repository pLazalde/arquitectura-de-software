package pizzastore.factory;

import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies(); 
    public Pepperoni createPepperoni(); 
    public Clams createClam();
}
