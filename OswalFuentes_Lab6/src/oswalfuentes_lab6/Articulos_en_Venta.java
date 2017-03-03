/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

/**
 *
 * @author Oswal
 */
public class Articulos_en_Venta {
    
    protected int precio;

    public Articulos_en_Venta() {
    }

    public Articulos_en_Venta(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos_en_Venta{" + "precio=" + precio + '}';
    }
    
    
    
}
