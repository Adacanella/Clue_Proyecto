package org.example;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private String nombreJuego;
    private List<String> jugadores;

    public Juego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
        this.jugadores = new ArrayList<>();
    }

    public void añadirJugador(String jugador) {
        jugadores.add(jugador);
    }

    public void iniciar() {
        System.out.println("Iniciando el juego: " + nombreJuego);
        System.out.println("Jugadores: " + jugadores);
    }
}
