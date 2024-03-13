
package Componente;

public abstract class ProductoAbstracto {
    
    public String nombre;
    public double precio;

    public ProductoAbstracto(String nombre, double precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
