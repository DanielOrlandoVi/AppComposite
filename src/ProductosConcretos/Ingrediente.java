
package ProductosConcretos;

import Componente.ComponenteHelado;

public class Ingrediente extends ComponenteHelado {
    private double precio;

    public Ingrediente(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return getNombre();
    }
}
    
