package BUCLES;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ejercicio28 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aver = new Random(99999);
        int numero_premiado = aver.nextInt();

        boolean acierto = false;
        int numero_de_intentos = 1;
        int intento;
        while (numero_de_intentos <= 5) {
            System.out.println("introduce tu numero de boleto");
            intento = in.nextInt();
            numero_de_intentos++;
            if (intento == numero_premiado) {
                System.out.println("Felicidades, has acertado el numero");
                break;
            } else {
                System.out.println("Lo sentimos, ese no es el numero premiado");
            }
        }
        if (numero_de_intentos == 6) {
            System.out.println("lo sentimos, se han acabado los intentos");
        }
    }
}
