package com.Practica;
import com.Practica.Elementos.Docente;
import com.Practica.Elementos.Estudiante;
import com.Practica.Listas.*;
import com.Practica.Visitor.VisitorArbol;
import com.Practica.Visitor.VisitorArray;

public class Main {
    public static void main(String[] args) {

        // Crear estudiantes
        Estudiante e1 = new Estudiante(1, "Juan Pérez", "Calle 123");
        e1.agregarTelefono("3001234567");

        Estudiante e2 = new Estudiante(2, "María López", ""); // direccion incompleta

        // Crear docentes
        Docente d1 = new Docente(1, "Carlos Ruiz", "Av. Principal");
        d1.agregarTelefono("3109876543");

        Docente d2 = new Docente(2, "Ana Torres", "Calle 456"); // sin teléfono

        // Listas Arbol
        ListaEstudiantesArbol leArbol = new ListaEstudiantesArbol();
        leArbol.add(e1);
        leArbol.add(e2);

        ListaDocentesArbol ldArbol = new ListaDocentesArbol();
        ldArbol.add(d1);
        ldArbol.add(d2);

        // Listas Array
        ListaEstudiantesArray leArray = new ListaEstudiantesArray();
        leArray.add(e1);
        leArray.add(e2);

        ListaDocentesArray ldArray = new ListaDocentesArray();
        ldArray.add(d1);
        ldArray.add(d2);

        // Recorridos con visitors
        System.out.println("=== Recorrido Arbol ===");
        VisitorArbol vArbol = new VisitorArbol();
        leArbol.recorrer(vArbol);
        ldArbol.recorrer(vArbol);

        System.out.println("\n=== Recorrido Array ===");
        VisitorArray vArray = new VisitorArray();
        leArray.recorrer(vArray);
        ldArray.recorrer(vArray);
    }
}