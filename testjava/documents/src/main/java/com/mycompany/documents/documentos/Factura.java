/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documents.documentos;

/**
 *
 * @author elias
 */
public class Factura {
    private int numFactura;
    private String detFactura;

    public Factura() {
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getDetFactura() {
        return detFactura;
    }

    public void setDetFactura(String detFactura) {
        this.detFactura = detFactura;
    }

    @Override
    public String toString() {
        return "factura{" + "numFactura=" + numFactura + ", detFactura=" + detFactura + '}';
    }

    
    
}
