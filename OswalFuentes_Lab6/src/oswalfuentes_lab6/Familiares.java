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
public class Familiares {

    private Familiares padre;
    private ArrayList<Familiares> hijos = new ArrayList();

    public Familiares() {
    }

    public Familiares(Familiares padre) {
        this.padre = padre;
    }

    public Familiares getPadre() {
        return padre;
    }

    public void setPadre(Familiares padre) {
        this.padre = padre;
    }

    public ArrayList<Familiares> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiares> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Familiares{" + "padre=" + padre + ", hijos=" + hijos + '}';
    }

    
    
}
