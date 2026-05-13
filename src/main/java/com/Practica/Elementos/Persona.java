package com.Practica.Elementos;

import com.Practica.Visitor.Visitor;
import java.util.*;

public abstract class Persona {
    protected int codigo;
    protected String nombre;
    protected String direccion;
    protected List<String> telefono;

    public Persona(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = new ArrayList<>();
    }

    public abstract void accept(Visitor v);

    public boolean datosCompletos() {
        return nombre != null && !nombre.isEmpty() &&
                direccion != null && !direccion.isEmpty() &&
                telefono != null && !telefono.isEmpty();
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