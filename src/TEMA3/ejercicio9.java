package TEMA3;

import java.util.Scanner;

public class ejercicio9 {



    public static void main(String[] args) {

        System.out.println("INTRODUCE LA LETRA LA CUAL FORMARA LA PIRAMIDE" );
        Scanner in_= new Scanner(System.in);
        String palabra= in_.nextLine();

        char letra=palabra.charAt(0);
        System.out.println("INTRODUCE LAS FILAS DE LA PIRAMIDE");
        int linea= in_.nextInt();

        piramide(letra, linea);
    }

    public static void piramide(char letra, int lineas) {
        int j=0;
        for(int i = 1; i <= lineas; ++i, j = 0) {
            for(int espacio = 1; espacio <= lineas - i; ++espacio) {
                System.out.print(" ");
            }
            while(j != 2 * i - 1) {
                System.out.print("T");
                ++j;
            }


            System.out.println();
        }
    }
}