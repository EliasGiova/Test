/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.documents;

import com.mycompany.documents.documentos.Factura;

import com.mycompany.documents.documentos.UrgentOrder;
import com.mycompany.documents.recursosHumanos.CV;
import com.mycompany.documents.recursosHumanos.Contrato;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Documents {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Factura fac1 = new Factura();
        fac1.setDetFactura("Tv Samsung");
        fac1.setNumFactura(1);
        
        UrgentOrder orden = new UrgentOrder();
        orden.setDetalle("Una compra de tv");
        orden.setNumOrden(3);
        
        System.out.println(fac1.toString());
        System.out.println(orden.toString());
        
        System.out.println("------------------------------");
        System.out.println("Carga de CV O CONTRATO");
        
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("Ingrese su dni: ");
        String documento = leer.next();
        System.out.println("Que documento quiere crear cv o contrato");
        String resp = leer.next();
        if(resp.equalsIgnoreCase("cv")){
            CV curriculum = new CV();
            curriculum.setNombre(nombre);
            curriculum.setApellido(apellido);
            curriculum.setDni(documento);
            System.out.println("Ingrese sueldo");
            curriculum.setSalarioPercibido(leer.nextInt());
            System.out.println(curriculum.toString() + "Salario Percibido es de " + curriculum.getSalarioPercibido());
        }else if (resp.equalsIgnoreCase("contrato")) {
            Contrato contrato = new Contrato();
            contrato.setApellido(apellido);
            contrato.setNombre(nombre);
            contrato.setDni(documento);
            System.out.println("Detalle: ");
            contrato.setDetalleContrato(leer.next());
            System.out.println(contrato.toString() + contrato.getDetalleContrato());
        }else{
            System.out.println("opcion incorrecta");
        }
    }
}
