package com.Practica.Elementos;

import com.Practica.Visitor.Visitor;

public class Estudiante extends Persona implements Comparable<Estudiante> {

    public Estudiante(int codigo, String nombre, String direccion) {
        super(codigo, nombre, direccion);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int compareTo(Estudiante otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }
}
