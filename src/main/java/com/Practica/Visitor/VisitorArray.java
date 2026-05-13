package com.Practica.Visitor;

import com.Practica.Elementos.Docente;
import com.Practica.Elementos.Estudiante;

import java.util.Random;

public class VisitorArray implements Visitor {

    @Override
    public void visit(Estudiante e) {
        if (!e.datosCompletos()) {
            System.out.println("[ARRAY] NOTIFICACIÓN - Estudiante incompleto: " + e.getNombre());
        } else {
            System.out.println("[ARRAY] Estudiante | Código: " + e.getCodigo()
                    + " | Nombre: " + e.getNombre());
        }
    }

    @Override
    public void visit(Docente d) {
        if (!d.datosCompletos()) {
            int codigoNotificacion = 1000 + new Random().nextInt(9000);
            System.out.println("[ARRAY] NOTIFICACIÓN - Docente incompleto: " + d.getNombre()
                    + " | Código: " + codigoNotificacion);
        } else {
            System.out.println("[ARRAY] Docente | Código: " + d.getCodigo()
                    + " | Nombre: " + d.getNombre());
        }
    }
}