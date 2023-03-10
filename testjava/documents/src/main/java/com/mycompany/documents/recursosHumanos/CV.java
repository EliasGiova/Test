
package com.mycompany.documents.recursosHumanos;

import java.util.Date;

/**
 *
 * @author elias
 */
public final class CV extends Documento {
    private String numeroTelefono;
    private int salarioPercibido;

    public CV() {
    }

    public CV(String numeroTelefono, int salarioPercibido) {
        this.numeroTelefono = numeroTelefono;
        this.salarioPercibido = salarioPercibido;
    }

    public CV(String numeroTelefono, int salarioPercibido, String dni, String nombre, String apellido, Date fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.numeroTelefono = numeroTelefono;
        this.salarioPercibido = salarioPercibido;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setFechaNacimiento(Date fechaNacimiento) {
        super.setFechaNacimiento(fechaNacimiento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Date getFechaNacimiento() {
        return super.getFechaNacimiento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getApellido() {
        return super.getApellido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDni() {
        return super.getDni(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getSalarioPercibido() {
        return salarioPercibido;
    }

    public void setSalarioPercibido(int salarioPercibido) {
        this.salarioPercibido = salarioPercibido;
    }
    
    
}
