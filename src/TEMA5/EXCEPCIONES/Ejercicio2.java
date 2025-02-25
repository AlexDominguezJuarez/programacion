package TEMA5.EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            System.out.println("Introduzca el numero a dividir");
            Scanner in=new Scanner(System.in);
            int numeroADividir=in.nextInt();
            System.out.println("Introduzca el numero divisor");
            int numeroDivisor=in.nextInt();
            int numeroFinal=numeroADividir/numeroDivisor;
            System.out.println("Resultado: "+numeroFinal);
        }catch (ArithmeticException exceptionA){
            System.out.println("Error, no se puede dividir por 0");
        }catch (InputMismatchException exceptionI){
            System.out.println("Error, tipo de dato introducido no valido");
        }
    }
}
