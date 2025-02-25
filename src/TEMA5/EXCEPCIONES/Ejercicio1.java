package TEMA5.EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            System.out.println("Introduzca un numero entero porfavor");
            Scanner in = new Scanner(System.in);
            int numero=in.nextInt();
            System.out.println("Valor introducido: "+numero);
        }
        catch (InputMismatchException exception){
            System.out.println("Valor introducido incorrecto");
        }

    }
}
