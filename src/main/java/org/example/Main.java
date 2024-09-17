package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos Al Clue!");

        // Solicitar el número de jugadores
        int numJugadores = obtenerNumeroDeJugadores(scanner);

        List<Jugador> jugadores = new ArrayList<>();

        // Solicitar nombres de los jugadores
        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Ingresa el nombre del jugador " + i + ": ");
            String nombre = scanner.nextLine();
            jugadores.add(new Jugador(nombre));
        }

        // Imprimir jugadores y sus cartas vacías para verificar
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
            System.out.println("Cartas de Armas: " + jugador.getCartasArma());
            System.out.println("Cartas de Personajes: " + jugador.getCartasPersonaje());
            System.out.println("Cartas de Habitaciones: " + jugador.getCartasHabitacion());
        }
    }

    private static int obtenerNumeroDeJugadores(Scanner scanner) {
        System.out.print("¿Cuántos jugadores están participando? ");
        return Integer.parseInt(scanner.nextLine());
    }
}
