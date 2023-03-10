
package com.mycompany.documents.recursosHumanos;

import java.util.Date;

/**
 *
 * @author elias
 */
public final class Contrato extends Documento {
    private String detalleContrato;

    public Contrato() {
    }

    public Contrato(String detalleContrato) {
        this.detalleContrato = detalleContrato;
    }

    public Contrato(String detalleContrato, String dni, String nombre, String apellido, Date fechaNacimiento) {
        super(dni, nombre, apellido, fechaNacimiento);
        this.detalleContrato = detalleContrato;
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

    public String getDetalleContrato() {
        return detalleContrato;
    }

    public void setDetalleContrato(String detalleContrato) {
        this.detalleContrato = detalleContrato;
    }
   
  
}
