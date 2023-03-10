
package com.mycompany.documents.recursosHumanos;

import java.util.Date;

/**
 *
 * @author elias
 */
public abstract class Documento {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;

    public Documento() {
    }

    public Documento(String dni, String nombre, String apellido, Date fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Documento{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }


    
    
}
