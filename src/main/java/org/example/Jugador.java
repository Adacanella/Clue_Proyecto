package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    String nombre;
    List<Arma> cartasArma;
    List<Personaje> cartasPersonaje;
    List<Habitacion> cartasHabitacion;

    Jugador(String nombre) {
        this.nombre = nombre;
        this.cartasArma = new ArrayList<>();
        this.cartasPersonaje = new ArrayList<>();
        this.cartasHabitacion = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Arma> getCartasArma() {
        return cartasArma;
    }

    public List<Personaje> getCartasPersonaje() {
        return cartasPersonaje;
    }

    public List<Habitacion> getCartasHabitacion() {
        return cartasHabitacion;
    }
}
