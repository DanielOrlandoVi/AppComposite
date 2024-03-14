/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductosConcretos;

import javax.swing.JOptionPane;
/**
 *
 * @author PERSONAL
 */
public class Salida {
    public static void mostrarHelado(String descripcion, double precio) {
        JOptionPane.showMessageDialog(null, descripcion + "\nPrecio: $" + precio);
    }
}