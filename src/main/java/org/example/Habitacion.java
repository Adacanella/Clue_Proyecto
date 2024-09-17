package org.example;
public class Habitacion {
    String nombre;

    Habitacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}