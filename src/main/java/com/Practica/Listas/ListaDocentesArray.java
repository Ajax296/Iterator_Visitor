package com.Practica.Listas;

import com.Practica.Elementos.Docente;
import com.Practica.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDocentesArray extends ArrayList<Docente> {

    public void recorrer(Visitor v) {
        Iterator<Docente> it = this.iterator();
        while (it.hasNext()) {
            it.next().accept(v);
        }
    }
}
