package TEMA5.EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner in =new Scanner(System.in);
        int dimensionArray=random.nextInt(100);
        int [] array=new int[dimensionArray];
        for (int i=0;i<array.length;i++){
            int numeroDeArray=random.nextInt(10);
            array[i]=numeroDeArray;
        }
        int numeroPosicion;
        try {
            System.out.println("¿Que posicion quieres mostrar?");
            numeroPosicion=in.nextInt();
            System.out.println("La posicion contiene: "+array[numeroPosicion]);


        }catch (InputMismatchException exceptionI){
            System.out.println("Valor incorrecto, introduzca un numero");
        }catch (MatchException exception){
                System.out.println("Introduzca un numero del 1 al 10");
            }
        }

    }

