package JUEGO;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class orueva {
    public static void main(String[] args) {
        Random pof = new Random(10);
        Scanner in = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("####.##");
        System.out.println("Introduce el nombre del jugador uno");
        String nombre1 = in.next();
        System.out.println("Introduce el nombre del jugador dos");
        String nombre2 = in.next();




        System.out.println("Introduce los atributos del jugador 2, un atributo no puede tener mas de 150 puntos, el total de los atributos no puede ser superior a 500");
        double ataque2_sin_dividir = in.nextInt();
        while (ataque2_sin_dividir > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            ataque2_sin_dividir = in.nextInt();
        }
        double ataque2 = ataque2_sin_dividir / 1.7;
        decimales.format(ataque2);
        System.out.println("Defensa de " + nombre2 + " : ");
        double defensa2_sin_dividir = in.nextInt();
        while (defensa2_sin_dividir > 500) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            defensa2_sin_dividir = in.nextInt();
        }
        double defensa2 = defensa2_sin_dividir / 1.7;
        decimales.format(defensa2);
        System.out.println("Velocidad de " + nombre2 + " : ");
        double velocidad2 = in.nextInt();
        while (velocidad2 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            velocidad2 = in.nextInt();
        }
        decimales.format(velocidad2);
        System.out.println("Vida de " + nombre2 + " :");
        double vida2 = in.nextInt();
        while (vida2 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            vida2 = in.nextInt();
        }
        decimales.format(vida2);

        int probabiliad_critico2 = 20;
        double regeneracion2 = vida2 / 10;
        while (vida2 + ataque2_sin_dividir + defensa2_sin_dividir + velocidad2 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            ataque2_sin_dividir = in.nextInt();
            while (ataque2_sin_dividir > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                ataque2_sin_dividir = in.nextInt();
            }
            ataque2 = ataque2_sin_dividir / 1.7;
            decimales.format(ataque2);
            System.out.println("Defensa de " + nombre2 + " : ");
            defensa2_sin_dividir = in.nextInt();
            while (defensa2_sin_dividir > 500) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                defensa2_sin_dividir = in.nextInt();
            }
            defensa2 = defensa2_sin_dividir / 1.7;
            decimales.format(defensa2);
            System.out.println("Velocidad de " + nombre2 + " : ");
            velocidad2 = in.nextInt();
            while (velocidad2 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                velocidad2 = in.nextInt();
            }
            decimales.format(velocidad2);
            System.out.println("Vida de " + nombre2 + " :");
            vida2 = in.nextInt();
            while (vida2 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                vida2 = in.nextInt();
            }
            decimales.format(vida2);
        }
    }
}
