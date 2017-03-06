/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oswal
 */
public class Administacion_de_Archivos {

    private ArrayList<Persona> listaPersonas = new ArrayList();
    private File archivo = null;

    public Administacion_de_Archivos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Personas: " + listaPersonas;
    }

    public void setPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public void escribirArchivo_Clientes() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                // nombre,edad,id,nacionalidad,lugar nacimiento,color,ticket,dinero;
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugar_nacimiento() + ";");
                bw.write(t.getColor() + ";");
                bw.write(((Clientes) t).getTicket() + ";");
                bw.write(((Clientes) t).getDinero() + ";");
                bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    /*public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                int c, e;
                String n;
                ArrayList<Hobbie> temp = new ArrayList();
                c = sc.nextInt();
                n = sc.next();
                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(",");
                while (s2.hasNext()) {
                    temp.add(new Hobbie(s2.nextInt(), s2.next()));
                }
                e = sc.nextInt();
                listaPersonas.add(new Persona(c, n, e));
                listaPersonas.get(listaPersonas.size() - 1).setHobbies(temp);
            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }
    }*/
}
