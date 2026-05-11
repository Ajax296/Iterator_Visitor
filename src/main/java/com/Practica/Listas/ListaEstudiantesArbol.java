package com.Practica.Listas;

import com.Practica.Elementos.Estudiante;
import com.Practica.Visitor.Visitor;

import java.util.TreeSet;
import java.util.Iterator;

public class ListaEstudiantesArbol extends TreeSet<Estudiante> {

    public void recorrer(Visitor v) {
        Iterator<Estudiante> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }

    public void recorrerInverso(Visitor v) {
        Iterator<Estudiante> it = this.descendingIterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }
}
