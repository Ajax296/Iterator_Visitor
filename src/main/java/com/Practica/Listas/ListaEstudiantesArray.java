package com.Practica.Listas;

import com.Practica.Elementos.Estudiante;
import com.Practica.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEstudiantesArray extends ArrayList<Estudiante> {

    public void recorrer(Visitor v) {
        Iterator<Estudiante> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }
}
