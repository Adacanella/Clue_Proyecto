package org.example;

public class Juego {
    private String nombreJuego;

    public Juego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public void iniciar() {
        System.out.println("Iniciando el juego: " + nombreJuego);
    }
}

