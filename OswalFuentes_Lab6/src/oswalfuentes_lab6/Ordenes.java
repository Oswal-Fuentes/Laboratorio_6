/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oswal
 */
public class Ordenes {

    private ArrayList<Articulos_en_Venta> articulos = new ArrayList();
    private String cliente, empleado;
    private int cantidad_articulos;
    private double total;
    private Date fecha_venta;

    public Ordenes() {
    }

    public Ordenes(String cliente, String empleado, int cantidad_articulos, double total, Date fecha_venta) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.cantidad_articulos = cantidad_articulos;
        this.total = total;
        this.fecha_venta = fecha_venta;
    }

    public ArrayList<Articulos_en_Venta> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulos_en_Venta> articulos) {
        this.articulos = articulos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCantidad_articulos() {
        return cantidad_articulos;
    }

    public void setCantidad_articulos(int cantidad_articulos) {
        this.cantidad_articulos = cantidad_articulos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "articulos=" + articulos + ", cliente=" + cliente + ", empleado=" + empleado + ", cantidad_articulos=" + cantidad_articulos + ", total=" + total + ", fecha_venta=" + fecha_venta + '}';
    }

}
