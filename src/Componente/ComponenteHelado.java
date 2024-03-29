
package Componente;

public abstract class ComponenteHelado {
    private String nombre;
    private String descripcion;

    public ComponenteHelado(String nombre) {
        super();
        this.nombre = nombre;
        this.descripcion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double getPrecio();
    public abstract String obtenerDescripcion();
}