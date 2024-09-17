package org.example;
public class Arma {
    String nombre;

    Arma(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}