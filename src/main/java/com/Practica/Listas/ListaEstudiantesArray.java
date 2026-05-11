package com.Practica.Listas;

import com.Practica.Elementos.Estudiante;
import com.Practica.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListaEstudiantesArray extends ArrayList<Estudiante> {

    public void recorrer(Visitor v) {
        Iterator<Estudiante> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }

    public void recorrerInverso(Visitor v) {
        ListIterator<Estudiante> it = this.listIterator(this.size());
        while (it.hasPrevious()) {
            it.previous().accept(v);
        }
    }
}
