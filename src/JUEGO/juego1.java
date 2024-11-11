package JUEGO;

import java.util.Random;
import java.util.Scanner;

public class juego1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce los atributos del jugador 1, la suma de los atributos no puede sumar mas de 500");
        System.out.println("Ataque jugador 1:");
        int ataque1=in.nextInt();
        System.out.println("Defensa jugador 1:");
        int defensa1=in.nextInt();
        int velocidad1=160;
        int vida1= 100;
        Random probabilidad_critico =new Random(20);
        Random regeneracion1= new Random(30);

        int ataque2=175;
        int defensa2=70;
        int velocidad2=80;
        int vida2=155;
        Random probabilidad_critico2=new Random(12);
        Random regeneracion2= new Random(20);

        int accion=0;

        int ronda=0;
        while ( (vida1 | vida2) >=1 ){
            ronda=ronda++;
            System.out.println("ronda " +ronda);
            if (velocidad1>velocidad2){
                System.out.println("Juega primero el jugador 1 ");
                System.out.println("¿Que accion quiere hacer el jugador 1?" +
                        "1 :Ataque" +
                        "2: Regeneracion");
                accion= in.nextInt();
                switch (accion){
                    case 1:
                        vida2=vida2+defensa2-ataque1;

                }



                }
            }


    }
}
