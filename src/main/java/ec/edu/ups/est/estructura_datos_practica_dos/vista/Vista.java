/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos_practica_dos.vista;

/**
 *
 * @author davidvargas
 */
import java.util.Scanner;

public class Vista {

    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("=== Sistema de Gestión de Tienda ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Realizar venta");
        System.out.println("3. Mostrar inventario");
        System.out.println("4. Mostrar historial de ventas");
        System.out.println("5. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}
