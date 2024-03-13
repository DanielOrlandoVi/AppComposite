
package ProductosConcretos;

import Componente.ProductoAbstracto;
public class ProductoSimple extends ProductoAbstracto{
    
    private String sabor;
    private String galleta;
    
    public ProductoSimple(String nombre, double precio, String sabor, String galleta){
        super(nombre, precio);
        this.sabor = sabor;
        this.galleta = galleta;
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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getGalleta() {
        return galleta;
    }

    public void setGalleta(String galleta) {
        this.galleta = galleta;
    }
    
    
    
    
}
