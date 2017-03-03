/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.awt.Color;

/**
 *
 * @author Oswal
 */
public class Persona {
    
    protected int edad,id;
    protected String nacionalidad,lugar_nacimiento,nombre;
    //Arbol Genealogico
    protected Color color;
    protected Familiares familiar;

    public Persona() {
    }

    public Persona(int edad, int id, String nacionalidad, String lugar_nacimiento, String nombre, Color color, Familiares familiar) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color = color;
        this.familiar = familiar;
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

    public Familiares getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiares familiar) {
        this.familiar = familiar;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", id=" + id + ", nacionalidad=" + nacionalidad + ", lugar_nacimiento=" + lugar_nacimiento + ", nombre=" + nombre + ", color=" + color + ", familiar=" + familiar + '}';
    }
    
    
    
}
