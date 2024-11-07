package JUEGO;

import java.util.Random;

public class juego1 {
    public static void main(String[] args) {
        int ataque1=100;
        int defensa1=120;
        int velocidad1=160;
        int vida1= 100;
        Random probabilidad_critico =new Random(75);

        int probabilidad_critico=
        int ataque2=175;
        int defensa2=70;
        int velocidad2=80;
        int vida2=155;
        int ronda=1;
            while ( (vida1 | vida2) >=1 ){
                ronda=ronda++;
                System.out.println("ronda " +ronda);
                if (velocidad1>velocidad2){
                    System.out.println("Ataca primero el jugador 1 ");
                    vida2=vida2+defensa2-ataque1;
                    System.out.println();

                }
            }


    }
}
