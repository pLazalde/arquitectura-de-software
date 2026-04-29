package iterador;

public class DinerMenuIterator implements Iterador {
    private MenuItem[] items;
    private int posicion = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // Verifica si hemos llegado al final del arreglo o si el siguiente elemento es nulo
        if (posicion >= items.length || items[posicion] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[posicion];
        posicion++;
        return menuItem;
    }
}