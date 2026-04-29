package composicion;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        // Creación de patos individuales (Hojas)
        Quackable rubberDuck = new RubberDuck();
        Quackable mallardOne = new MallardDuck();
        Quackable mallardTwo = new MallardDuck();
        Quackable mallardThree = new MallardDuck();

        // Creación de la bandada principal (Compuesto)
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(rubberDuck);

        // Creación de una sub-bandada familiar (Compuesto dentro de un Compuesto)
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        // Agregando la sub-bandada a la bandada principal
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);
    }

    // El cliente trata a los compuestos y a las hojas de la misma manera
    void simulate(Quackable duck) {
        duck.quack();
    }
}