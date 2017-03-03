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
public class Jefes extends Persona {

    private String seccion_trabajo;
    private ArrayList<Empleado> empleados = new ArrayList();
    private int clientes_atendidos, ganancia;

    public Jefes() {
    }

    public Jefes(String seccion_trabajo, int clientes_atendidos, int ganancia) {
        this.seccion_trabajo = seccion_trabajo;
        this.clientes_atendidos = clientes_atendidos;
        this.ganancia = ganancia;
    }

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
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
        return "Jefes{" + "seccion_trabajo=" + seccion_trabajo + ", empleados=" + empleados + ", clientes_atendidos=" + clientes_atendidos + ", ganancia=" + ganancia + '}';
    }

    
    
}
