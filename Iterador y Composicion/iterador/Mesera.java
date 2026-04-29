package iterador;

public class Mesera {
    private DinerMenu dinerMenu;

    public Mesera(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    public void imprimirMenu() {
        Iterador dinerIterator = dinerMenu.crearIterador();
        
        System.out.println("MENÚ\n----\nALMUERZO (Diner Menu):");
        imprimirMenu(dinerIterator);
    }

    private void imprimirMenu(Iterador iterador) {
        while (iterador.hasNext()) {
            MenuItem menuItem = (MenuItem) iterador.next();
            System.out.print(menuItem.getNombre() + ", ");
            System.out.print(menuItem.getPrecio() + " -- ");
            System.out.println(menuItem.getDescripcion());
        }
    }

    // Método Main para probar el código
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        Mesera mesera = new Mesera(dinerMenu);
        
        mesera.imprimirMenu();
    }
}