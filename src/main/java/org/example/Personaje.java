package org.example;
public class Personaje {
    String nombre;

    Personaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
