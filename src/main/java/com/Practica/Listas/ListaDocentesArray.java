package com.Practica.Listas;

import com.Practica.Elementos.Docente;
import com.Practica.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListaDocentesArray extends ArrayList<Docente> {

    public void recorrer(Visitor v) {
        Iterator<Docente> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }

    public void recorrerInverso(Visitor v) {
        ListIterator<Docente> it = this.listIterator(this.size());
        while (it.hasPrevious()) {
            it.previous().accept(v);
        }
    }
}
