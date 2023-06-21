/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos_practica_dos.controlador;

import ec.edu.ups.est.estructura_datos_practica_dos.modelo.HistorialVentas;
import ec.edu.ups.est.estructura_datos_practica_dos.modelo.Inventario;
import ec.edu.ups.est.estructura_datos_practica_dos.modelo.Producto;
import ec.edu.ups.est.estructura_datos_practica_dos.modelo.Venta;

/**
 *
 * @author davidvargas
 */
public class Controlador {

    private Inventario inventario;
    private HistorialVentas historialVentas;

    public Controlador() {
        inventario = new Inventario();
        historialVentas = new HistorialVentas();
    }

    public void agregarProducto(String nombre, int codigo, double precio, int cantidadDisponible) {
        Producto producto = new Producto(nombre, codigo, precio, cantidadDisponible);
        inventario.agregarProducto(producto);
    }

    public void realizarVenta(int codigoProducto, int cantidad) {
        Producto producto = inventario.buscarProducto(codigoProducto);
        if (producto != null && producto.getCantidadDisponible() >= cantidad) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
            Venta venta = new Venta(producto, cantidad);
            historialVentas.agregarVenta(venta);
        } else {
            System.out.println("Error: El producto no existe o no hay suficiente stock.");
        }
    }

    public void mostrarInventario() {
        inventario.mostrarInventario();
    }

    public void mostrarHistorialVentas() {
        historialVentas.mostrarHistorialVentas();
    }
}
