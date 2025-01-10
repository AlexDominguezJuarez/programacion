package TEMA3;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {
    public static void main(String[] args) {
        int []arrayOculta=new int[14];
        Scanner in=new Scanner(System.in);
        boolean encontrarLaMosca=false;
        while (encontrarLaMosca==false) {
            System.out.println("JUEGO: ATRAPA LA MOSCA");
            System.out.println("..............................................................");
            System.out.println("ADIVINA DONDE ESTÁ LA MOSCA, ESCOJA UNA CASILLA DEL 1 AL 15");
            int eleccion = in.nextInt();
            eleccion--;
            while ((eleccion>14)||(eleccion<0)){
                System.out.println("OPCION INCORRECTA, INTRODUZCA LA CASILLA DE NUEVO");
                eleccion=in.nextInt();
            }
            Random random = new Random();
            int casillaAleatoria = random.nextInt(14);
            arrayOculta[casillaAleatoria] = 1;
            if (arrayOculta[eleccion] == 1) {
                System.out.println("FELICIDADES, HAS ADIVINADO DONDE ESTÁ LA MOSCA");
                encontrarLaMosca=true;
            } else {
                System.out.println("LO SIENTO, AHÍ NO ESTABA LA MOSCA");
                System.out.println();
                System.out.println();
            }
        }System.out.println(arrayOculta);


    }
}