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
public class Empleado extends Persona{
    
    private String seccion_trabajo,estado;
    private int hora_entrada,hora_salida;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String seccion_trabajo, String estado, int hora_entrada, int hora_salida, int sueldo, int edad, int id, String nacionalidad, String lugar_nacimiento, String nombre, Color color) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color);
        this.seccion_trabajo = seccion_trabajo;
        this.estado = estado;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.sueldo = sueldo;
    }

    
    
    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
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
        return "Empleado{" + "seccion_trabajo=" + seccion_trabajo + ", estado=" + estado + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", sueldo=" + sueldo + '}';
    }
 
    
    
}
