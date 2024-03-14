
package ProductosConcretos;

import java.util.ArrayList;
import java.util.List;
import Componente.ComponenteHelado;

public class HeladoPersonalizado extends ComponenteHelado {
    private List<Ingrediente> ingredientes;
    private double precioBase = 0.0;

    public HeladoPersonalizado() {
        super("Helado personalizado");
        ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public double getPrecio() {
        double precioTotal = precioBase;
        for (Ingrediente ingrediente : ingredientes) {
            precioTotal += ingrediente.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public String obtenerDescripcion() {
        StringBuilder descripcion = new StringBuilder(getNombre() + ":\n");
        for (Ingrediente ingrediente : ingredientes) {
            descripcion.append("- ").append(ingrediente.obtenerDescripcion()).append("\n");
        }
        return descripcion.toString();
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}

