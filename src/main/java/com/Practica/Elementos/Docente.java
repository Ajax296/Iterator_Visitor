package com.Practica.Elementos;

import com.Practica.Visitor.Visitor;

import java.util.*;

public class Docente implements Element, Comparable<Docente> {
    private int codigo;
    private String nombre;
    private String direccion;
    private List<String> telefono;

    public Docente(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = new ArrayList<>();
    }

    public boolean datosCompletos() {
        return nombre != null && !nombre.isEmpty() &&
                direccion != null && !direccion.isEmpty() &&
                telefono != null && !telefono.isEmpty();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public int compareTo(Docente otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public List<String> getTelefono() { return telefono; }
    public void agregarTelefono(String tel) { this.telefono.add(tel); }
}
