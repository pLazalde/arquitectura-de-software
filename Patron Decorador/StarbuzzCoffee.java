public class StarbuzzCoffee {
    public static void main(String args[]) {
        // Pedido 1: Un Espresso sencillo
        System.out.println("#Pedido 1"); 
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); 

        // Pedido 2: Dark Roast con Doble Mocha y Whip
        System.out.println("#Pedido 2"); 
        Beverage beverage2 = new DarkRoast(); 
        beverage2 = new Mocha(beverage2); 
        beverage2 = new Mocha(beverage2); 
        beverage2 = new Whip(beverage2); 
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost()); 

        // Pedido 3: House Blend con Soya, Mocha y Whip
        System.out.println("#Pedido 3");
        Beverage beverage3 = new HouseBlend(); 
        beverage3 = new Soy(beverage3); 
        beverage3 = new Mocha(beverage3); 
        beverage3 = new Whip(beverage3); 
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost()); 
    }
}