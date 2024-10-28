package BUCLES;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        System.out.println("introduce un numero y te daremos el resultado de su factorial");
        Scanner in=new Scanner(System.in);
        int numero=in. nextInt();
        int resultado=1;
        while (numero > 1) {
             resultado= resultado*numero;
             numero=numero-1;
        }
        System.out.println("el factorial del numero introducido es "+ resultado);
    }
}
