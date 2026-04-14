package pizzastore.factory;

import pizzastore.ingredients.BlackOlives;
import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Eggplant;
import pizzastore.ingredients.FrozenClams;
import pizzastore.ingredients.MozzarellaCheese;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.PlumTomatoSauce;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.SlicedPepperoni;
import pizzastore.ingredients.Spinach;
import pizzastore.ingredients.ThickCrustDough;
import pizzastore.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
        return veggies;
    }
    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
