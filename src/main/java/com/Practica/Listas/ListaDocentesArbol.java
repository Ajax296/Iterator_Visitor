package com.Practica.Listas;

import com.Practica.Elementos.Docente;
import com.Practica.Visitor.Visitor;

import java.util.TreeSet;
import java.util.Iterator;

public class ListaDocentesArbol extends TreeSet<Docente> {

    public void recorrer(Visitor v) {
        Iterator<Docente> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }
}
