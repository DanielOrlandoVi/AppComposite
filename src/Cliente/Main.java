
package Cliente;

import javax.swing.JOptionPane;
import ProductosConcretos.*;
import Componente.*;



public class Main {
    static int ciclo = 1;
    public static void main(String[] args) {

        while(true){
        // Crear helado personalizado
        HeladoPersonalizado miHelado = new HeladoPersonalizado();
        miHelado.setPrecioBase(3.0); // Establecer precio base para el helado

        // Mantener un registro del precio acumulado
        double precioAcumulado = miHelado.getPrecio();

        // Inicializar mensaje de precio
        StringBuilder mensajePrecio = new StringBuilder("Precio Acumulado: $");
        mensajePrecio.append(precioAcumulado);

        // Array de opciones de ingredientes
        String[] opciones = {"Base de helado", "Cobertura de chocolate", "Nueces", "Caramelo", "Finalizar pedido"};

        // Solicitar ingredientes al usuario
        while (true) {
            // Mostrar el precio acumulado actualizado
            mensajePrecio.setLength(0);
            mensajePrecio.append("Precio Acumulado: $").append(precioAcumulado);

            // Mostrar lista desplegable de ingredientes
            String seleccion = (String) JOptionPane.showInputDialog(null, mensajePrecio.toString(), "Agregar Ingrediente", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            if (seleccion.equals("Finalizar pedido")) // El usuario selecciona "Finalizar pedido"
                break;

            double precio = obtenerPrecioIngrediente(seleccion);
            Ingrediente ingrediente = new Ingrediente(seleccion, precio);
            miHelado.agregarIngrediente(ingrediente);

            // Actualizar el precio acumulado
            precioAcumulado = miHelado.getPrecio();
        }

        // Mostrar descripción y precio del helado personalizado
        Salida.mostrarHelado(miHelado.obtenerDescripcion(), miHelado.getPrecio(), ciclo);
        ciclo += 1;
    }
}

    private static double obtenerPrecioIngrediente(String seleccion) {
        switch (seleccion) {
            case "Base de helado": // Base de helado
                return 0.0;
            case "Cobertura de chocolate": // Cobertura de chocolate
                return 1.5;
            case "Nueces": // Nueces
                return 0.75;
            case "Caramelo": // Caramelo
                return 1.0;
            default:
                return 0.0;
        }
    }
}