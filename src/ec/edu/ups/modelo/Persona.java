/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Estudiantes
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private List<Telefono> listaTelefonos;
    
    public Persona() {
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.listaTelefonos = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.listaTelefonos = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, List<Telefono> listaTelefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.listaTelefonos = listaTelefonos;
        this.listaTelefonos = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List<Telefono> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", listaTelefonos=" + listaTelefonos + '}';
    }
    
    
}
