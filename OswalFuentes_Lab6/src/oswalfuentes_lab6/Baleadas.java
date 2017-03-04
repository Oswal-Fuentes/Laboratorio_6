/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.util.ArrayList;

/**
 *
 * @author Oswal
 */
public class Baleadas extends Articulos_en_Venta {

    private ArrayList<String> ingredientes = new ArrayList();

    public Baleadas() {
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Baleadas{" + "ingredientes=" + ingredientes + '}';
    }
    
}
