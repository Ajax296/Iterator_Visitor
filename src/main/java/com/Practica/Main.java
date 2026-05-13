package com.Practica;
import com.Practica.Elementos.Docente;
import com.Practica.Elementos.Estudiante;
import com.Practica.Listas.*;
import com.Practica.Visitor.VisitorArbol;
import com.Practica.Visitor.VisitorArray;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante(1, "Juan Pérez", "Calle 123");
        e1.agregarTelefono("3001234567");
        Estudiante e2 = new Estudiante(2, "María López", "Av. Central");
        e2.agregarTelefono("3109876543");
        Estudiante e3 = new Estudiante(3, "Carlos García", ""); // incompleto

        Docente d1 = new Docente(1, "Ana Torres", "Calle 456");
        d1.agregarTelefono("3201112233");
        Docente d2 = new Docente(2, "Luis Ramírez", "Av. Norte"); // incompleto

        ListaEstudiantesArbol leArbol = new ListaEstudiantesArbol();
        leArbol.add(e1); leArbol.add(e2); leArbol.add(e3);

        ListaDocentesArbol ldArbol = new ListaDocentesArbol();
        ldArbol.add(d1); ldArbol.add(d2);

        ListaEstudiantesArray leArray = new ListaEstudiantesArray();
        leArray.add(e1); leArray.add(e2); leArray.add(e3);

        ListaDocentesArray ldArray = new ListaDocentesArray();
        ldArray.add(d1); ldArray.add(d2);

        VisitorArbol vArbol = new VisitorArbol();
        VisitorArray vArray = new VisitorArray();

        System.out.println("=== [ARBOL] Recorrido Normal Estudiantes ===");
        leArbol.recorrer(vArbol);
        System.out.println("\n=== [ARBOL] Recorrido Inverso Estudiantes ===");
        leArbol.recorrerInverso(vArbol);

        System.out.println("\n=== [ARBOL] Recorrido Normal Docentes ===");
        ldArbol.recorrer(vArbol);
        System.out.println("\n=== [ARBOL] Recorrido Inverso Docentes ===");
        ldArbol.recorrerInverso(vArbol);

        System.out.println("\n=== [ARRAY] Recorrido Normal Estudiantes ===");
        leArray.recorrer(vArray);
        System.out.println("\n=== [ARRAY] Recorrido Inverso Estudiantes ===");
        leArray.recorrerInverso(vArray);

        System.out.println("\n=== [ARRAY] Recorrido Normal Docentes ===");
        ldArray.recorrer(vArray);
        System.out.println("\n=== [ARRAY] Recorrido Inverso Docentes ===");
        ldArray.recorrerInverso(vArray);
    }
}