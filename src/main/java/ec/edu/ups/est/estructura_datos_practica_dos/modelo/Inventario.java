/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos_practica_dos.modelo;

/**
 *
 * @author davidvargas
 */
import java.util.LinkedList;

public class Inventario {

    private LinkedList<Producto> productos;

    public Inventario() {
        productos = new LinkedList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad disponible: " + producto.getCantidadDisponible());
            System.out.println("----------------------");
        }
    }

    public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
