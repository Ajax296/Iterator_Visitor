package com.Practica.Visitor;

import com.Practica.Elementos.Docente;
import com.Practica.Elementos.Estudiante;

public interface Visitor {
    void visit(Estudiante e);
    void visit(Docente d);
}
