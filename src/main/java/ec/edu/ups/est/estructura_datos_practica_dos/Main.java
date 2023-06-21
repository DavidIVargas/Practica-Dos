/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.est.estructura_datos_practica_dos;

import ec.edu.ups.est.estructura_datos_practica_dos.controlador.Controlador;
import ec.edu.ups.est.estructura_datos_practica_dos.vista.Vista;

/**
 *
 * @author davidvargas
 */
public class Main {

    private static Controlador controlador = new Controlador();

    public static void main(String[] args) {
        boolean ejecutando = true;

        while (ejecutando) {
            Vista.mostrarMenu();

            int opcion = Vista.leerEntero("");
            Vista.mostrarMensaje("");

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    realizarVenta();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    mostrarHistorialVentas();
                    break;
                case 5:
                    ejecutando = false;
                    break;
                default:
                    Vista.mostrarMensaje("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }

            Vista.mostrarMensaje("");
        }
    }

    private static void agregarProducto() {
        Vista.mostrarMensaje("=== Agregar Producto ===");

        String nombre = Vista.leerString("Ingrese el nombre del producto: ");
        int codigo = Vista.leerEntero("Ingrese el código del producto: ");
        double precio = Vista.leerDouble("Ingrese el precio del producto: ");
        int cantidad = Vista.leerEntero("Ingrese la cantidad disponible del producto: ");

        controlador.agregarProducto(nombre, codigo, precio, cantidad);

        Vista.mostrarMensaje("Producto agregado correctamente.");
    }

    private static void realizarVenta() {
        Vista.mostrarMensaje("=== Realizar Venta ===");

        int codigoProducto = Vista.leerEntero("Ingrese el código del producto a vender: ");
        int cantidad = Vista.leerEntero("Ingrese la cantidad a vender: ");

        controlador.realizarVenta(codigoProducto, cantidad);
    }

    private static void mostrarInventario() {
        Vista.mostrarMensaje("=== Inventario ===");
        controlador.mostrarInventario();
    }

    private static void mostrarHistorialVentas() {
        Vista.mostrarMensaje("=== Historial de Ventas ===");
        controlador.mostrarHistorialVentas();
    }
}
