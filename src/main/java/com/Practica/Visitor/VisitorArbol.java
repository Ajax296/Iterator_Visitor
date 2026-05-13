package com.Practica.Visitor;

import com.Practica.Elementos.Docente;
import com.Practica.Elementos.Estudiante;

import java.util.Random;

public class VisitorArbol implements Visitor {

    @Override
    public void visit(Estudiante e) {
        if (!e.datosCompletos()) {
            System.out.println("[ARBOL] NOTIFICACIÓN - Estudiante incompleto: " + e.getNombre());
        } else {
            System.out.println("[ARBOL] Estudiante | Código: " + e.getCodigo()
                    + " | Nombre: " + e.getNombre()
                    + " | Dirección: " + e.getDireccion()
                    + " | Teléfonos: " + e.getTelefono());
        }
    }

    @Override
    public void visit(Docente d) {
        if (!d.datosCompletos()) {
            int codigoNotificacion = 1000 + new Random().nextInt(9000);
            System.out.println("[ARBOL] NOTIFICACIÓN - Docente incompleto: " + d.getNombre()
                    + " | Código: " + codigoNotificacion);
        } else {
            System.out.println("[ARBOL] Docente | Código: " + d.getCodigo()
                    + " | Nombre: " + d.getNombre()
                    + " | Dirección: " + d.getDireccion()
                    + " | Teléfonos: " + d.getTelefono());
        }
    }
}