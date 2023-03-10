
package com.mycompany.documents.documentos;


public class Orden {
    private int numOrden;
    private String detalle;

    public Orden() {
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "orden{" + "numOrden=" + numOrden + ", detalle=" + detalle + '}';
    }
     
    
}
