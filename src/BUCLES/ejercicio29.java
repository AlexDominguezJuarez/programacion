package BUCLES;

import java.util.Random;
import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        System.out.println("intenta adivinar el numero secreto(del 1 al 100)");
        Random random = new Random();
        int numero_a_acertar = random.nextInt(100);
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        if (numero == numero_a_acertar) {
            System.out.println("felicidades,has acertado el numero");
        } else {
            System.out.println("ese no es el numero corercto");
        while (numero_a_acertar != numero) {


                if (numero < numero_a_acertar) {
                    System.out.println("el numero que has introducido es mas pequeño que el numero a adivinar");
                    numero = in.nextInt();
                } else {
                    System.out.println("el numero que has introducido es mas grande que el numero a adivinar");
                    numero = in.nextInt();
                }
            }System.out.println("Felicidades, has introducido el numero correcto");

        }
    }
}
