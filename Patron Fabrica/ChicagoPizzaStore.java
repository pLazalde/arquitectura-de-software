public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return null; 
        } else if (item.equals("clam")) {
            return null; 
        } else if (item.equals("pepperoni")) {
            return null; 
        } else {
            return null;
        }
    }
}