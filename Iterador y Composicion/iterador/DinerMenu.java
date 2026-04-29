package iterador;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numeroDeItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Hamburguesa Vegetariana", "Hamburguesa de soya con lechuga y tomate", true, 2.99);
        addItem("Sopa del día", "Sopa del día con ensalada de la casa", false, 3.29);
        addItem("Hot Dog", "Hot dog tradicional con chucrut y aderezo", false, 3.05);
    }

    public void addItem(String nombre, String descripcion, boolean vegetariano, double precio) {
        MenuItem menuItem = new MenuItem(nombre, descripcion, vegetariano, precio);
        if (numeroDeItems >= MAX_ITEMS) {
            System.err.println("Lo siento, el menú está lleno. No se pueden agregar más platillos.");
        } else {
            menuItems[numeroDeItems] = menuItem;
            numeroDeItems++;
        }
    }

    // Aquí está la clave del patrón: devolvemos la abstracción, no el arreglo
    public Iterador crearIterador() {
        return new DinerMenuIterator(menuItems);
    }
}