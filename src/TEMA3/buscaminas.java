package TEMA3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static TEMA3.MyArray.imprimirFuncion;



public class buscaminas {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int contadorMinas = 0;
        String[]arrayMinasOcultas=new String [20];
        int[] arrayMinas = new int[20];
        int numeroAleatorio;
        int recorrerFuncion = 0;
        int numeroDeNumeros = arrayMinas.length;
        int numeroMinas=0;
        int eleccionJugador=0;
        int casillasAcertadas=0;
        boolean mina=false;
        boolean ganado=false;

        for (int i=numeroDeNumeros;i>recorrerFuncion;recorrerFuncion++){
            arrayMinasOcultas[recorrerFuncion]=".";
        }

        System.out.println("BUSCAMINAS");
        System.out.println();

        Random random = new Random();

        while (contadorMinas != 6) {
            contadorMinas++;
            numeroAleatorio = random.nextInt(19) ;
            while (arrayMinas[numeroAleatorio]==5){
                numeroAleatorio=random.nextInt(19);
            }
            arrayMinas[numeroAleatorio] = 5;
        }

        recorrerFuncion=0;
        for (int i = numeroDeNumeros; i > recorrerFuncion; recorrerFuncion++) {
            if (arrayMinas[recorrerFuncion] == 5) {
                arrayMinas[recorrerFuncion-1] = arrayMinas[recorrerFuncion-1] + 1;

                arrayMinas[recorrerFuncion+1] = arrayMinas[recorrerFuncion+1]+1;

                if (arrayMinas[recorrerFuncion+1]==6){
                    arrayMinas[recorrerFuncion+1]=5;
                }
                if (arrayMinas[recorrerFuncion-1]==6){
                    arrayMinas[recorrerFuncion-1]=5;
                }
            }

        }

        recorrerFuncion=0;

        while ((ganado==false)&&(mina==false)){
            System.out.println("SELECCIONA LA CASILLA DONDE NO HAYA MINA");
            eleccionJugador=in.nextInt()-1;
            casillasAcertadas++;
            switch (arrayMinas[eleccionJugador]){
                case 0:
                    arrayMinasOcultas[eleccionJugador]="0";
                    break;
                case 1:
                    arrayMinasOcultas[eleccionJugador]="1";
                    break;
                case 2:
                    arrayMinasOcultas[eleccionJugador]="2";
                    break;
                case 5:
                    arrayMinasOcultas[eleccionJugador]="*";
            }
            if (arrayMinas[eleccionJugador]==5){
                mina=true;
            }
            recorrerFuncion=0;
            for (int i=numeroDeNumeros;i>recorrerFuncion;recorrerFuncion++){
                System.out.println(arrayMinasOcultas[recorrerFuncion]);

            }

            if (casillasAcertadas>13){
                ganado=true;
            }
        }
        if (ganado==true){
            System.out.println("FELICIDADES, HAS GANADO!");
        }
        if (mina==true){
            System.out.println("LO SIENTO, HAS PERDIDO");
        }
    }
}
