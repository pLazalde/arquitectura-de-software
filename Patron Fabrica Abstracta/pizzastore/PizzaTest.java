package pizzastore;

import pizzastore.pizza.Pizza;
import pizzastore.store.ChicagoPizzaStore;
import pizzastore.store.NYPizzaStore;
import pizzastore.store.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        // Inicializamos nuestras dos franquicias con sus respectivas fábricas
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("==========================================");
        System.out.println("      ORDENANDO PIZZAS DE QUESO");
        System.out.println("==========================================");
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        System.out.println("==========================================");
        System.out.println("      ORDENANDO PIZZAS DE ALMEJAS");
        System.out.println("==========================================");
        
        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        System.out.println("==========================================");
        System.out.println("      ORDENANDO PIZZAS VEGETARIANAS");
        System.out.println("==========================================");
        
        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        System.out.println("==========================================");
        System.out.println("      ORDENANDO PIZZAS DE PEPPERONI");
        System.out.println("==========================================");
        
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
