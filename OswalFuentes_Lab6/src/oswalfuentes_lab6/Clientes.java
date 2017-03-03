/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Oswal
 */
public class Clientes extends Persona {

    private int ticket;
    float dinero;
    ArrayList<Ordenes> ordenas = new ArrayList();

    public Clientes() {
    }

    public Clientes(int ticket, float dinero) {
        this.ticket = ticket;
        this.dinero = dinero;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Ordenes> getOrdenas() {
        return ordenas;
    }

    public void setOrdenas(ArrayList<Ordenes> ordenas) {
        this.ordenas = ordenas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ticket=" + ticket + ", dinero=" + dinero + ", ordenas=" + ordenas + '}';
    }

    
    
}
