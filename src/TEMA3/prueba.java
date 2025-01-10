package TEMA3;

import java.util.Random;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int[] tablero = new int[20];
        boolean[] minas = new boolean[20];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

// Colocar minas aleatoriamente
        int minasColocadas = 0;
        while (minasColocadas < 6) {
            int posicion = rand.nextInt(20);
            if (!minas[posicion]) {
                minas[posicion] = true;
                minasColocadas++;
            }
        }

// Rellenar el tablero con pistas
        for (int i = 0; i < 20; i++) {
            if (minas[i]) {
                tablero[i] = -1; // -1 representa una mina
            } else {
                tablero[i] = contarMinasAlrededor(minas, i);
            }
        }

// Juego
        boolean juegoActivo = true;
        boolean[] descubiertas = new boolean[20];

        while (juegoActivo) {
            System.out.println("Selecciona una posición (0-19): ");
            int seleccion = scanner.nextInt();

            if (seleccion < 0 || seleccion >= 20) {
                System.out.println("Posición inválida. Intenta de nuevo.");
                continue;
            }

            if (minas[seleccion]) {
                System.out.println("¡Has perdido! Has seleccionado una mina.");
                juegoActivo = false;
            } else {
                descubiertas[seleccion] = true;
                mostrarTablero(tablero, descubiertas);

// Verificar si el jugador ha ganado
                if (haGanado(descubiertas, minas)) {
                    System.out.println("¡Felicidades! Has ganado.");
                    juegoActivo = false;
                }
            }
        }

        scanner.close();
    }

    private static int contarMinasAlrededor(boolean[] minas, int posicion) {
        int contador = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Ignorar la posición actual
                int nuevaPosicion = posicion + i+ 5 + j; // Considerando un tablero de 5 columnas
                if (nuevaPosicion >= 0 && nuevaPosicion < minas.length && minas[nuevaPosicion]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private static void mostrarTablero(int[] tablero, boolean[] descubiertas) {
        for (int i = 0; i < tablero.length; i++) {
            if (descubiertas[i]) {
                if (tablero[i] == -1) {
                    System.out.print(" "); // Mostrar mina
                } else {
                    System.out.print(tablero[i] + " "); // Mostrar número
                }
            } else {
                System.out.print(". "); // Casilla no descubierta
            }
        }
        System.out.println();
    }

    private static boolean haGanado(boolean[] descubiertas, boolean[] minas) {
        for (int i = 0; i < minas.length; i++) {
            if (!minas[i] && !descubiertas[i]) {
                return false; // Hay casillas no descubiertas que no son minas
            }

        }return true;
    }
}

