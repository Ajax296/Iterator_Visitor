package com.Practica.Elementos;

import com.Practica.Visitor.Visitor;

public class Docente extends Persona implements Comparable<Docente> {

    public Docente(int codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int compareTo(Docente otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }
}
