package pizzastore.factory;

import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.FreshClams;
import pizzastore.ingredients.MarinaraSauce;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.ReggianoCheese;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.SlicedPepperoni;
import pizzastore.ingredients.ThinCrustDough;
import pizzastore.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { }; 
        return veggies;
    }
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
