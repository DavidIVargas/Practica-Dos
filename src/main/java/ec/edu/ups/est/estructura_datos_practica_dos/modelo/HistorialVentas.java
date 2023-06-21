/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos_practica_dos.modelo;

/**
 *
 * @author davidvargas
 */
import java.util.Stack;

public class HistorialVentas {

    private Stack<Venta> ventas;

    public HistorialVentas() {
        ventas = new Stack<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.push(venta);
    }

    public Venta obtenerUltimaVenta() {
        return ventas.peek();
    }

    public Venta eliminarUltimaVenta() {
        return ventas.pop();
    }

    public void mostrarHistorialVentas() {
        System.out.println("Historial de Ventas:");
        for (Venta venta : ventas) {
            System.out.println("Fecha: " + venta.getFecha());
            System.out.println("Producto: " + venta.getProducto().getNombre());
            System.out.println("Cantidad: " + venta.getCantidad());
            System.out.println("----------------------");
        }
    }
}
