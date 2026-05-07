package com.Practica.Elementos;

import com.Practica.Visitor.Visitor;

public interface Element {
    void accept(Visitor v);
}
