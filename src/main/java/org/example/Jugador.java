package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    String nombre;
    List<Arma> cartasArma;

    Jugador(String nombre) {
        this.nombre = nombre;
        this.cartasArma = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Arma> getCartasArma() {
        return cartasArma;
    }
}
