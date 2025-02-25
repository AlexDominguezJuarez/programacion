package TEMA5.EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner in = new Scanner(System.in);
        double numeroAIntroducir=0;
        double[] vector = new double[5];
        while (contador < 5) {
            try {
                System.out.println("Introduce un valor numerico al vector");
                numeroAIntroducir=in.nextDouble();
                vector[contador] = numeroAIntroducir;
                contador++;

            } catch (InputMismatchException exceptionI) {
                System.out.println("¡Introduzca un valor correcto!\n");
                in.nextLine();

            } catch (ArrayIndexOutOfBoundsException exceptionA) {
                System.out.println("Array completa");

            }
        }
        System.out.println("Array completa");
        for (int i=0;i<vector.length;i++) {
            System.out.println(vector[i]);
        }
    }
}
