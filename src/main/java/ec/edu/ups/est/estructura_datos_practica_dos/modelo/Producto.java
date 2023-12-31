/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos_practica_dos.modelo;

/**
 *
 * @author davidvargas
 */
public class Producto {

    private String nombre;
    private int codigo;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, int codigo, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
