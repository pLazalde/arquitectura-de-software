package iterador;

public class MenuItem {
    private String nombre;
    private String descripcion;
    private boolean vegetariano;
    private double precio;

    public MenuItem(String nombre, String descripcion, boolean vegetariano, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vegetariano = vegetariano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public double getPrecio() {
        return precio;
    }
}