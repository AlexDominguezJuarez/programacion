package JUEGO;

import java.util.Random;
import java.util.Scanner;

public class juego1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int porcentaje = 10;
        System.out.println("Introduce los atributos del jugador 1, un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
        System.out.println("Ataque jugador 1: ");
        double ataque1 = in.nextInt();
        ataque1=ataque1/1.7;
        System.out.println("Defensa jugador 1: ");
        double defensa1 = in.nextInt()/1.7;
        System.out.println("Velocidad jugador 1: ");
        int velocidad1 = in.nextInt();
        System.out.println("Vida jugador 1:");
        int vida1 = in.nextInt();
        Random pof = new Random(10);
        int probabiliad_critico1 = 20;
        int regeneracion1 = vida1 / 10;
        while (vida1 + ataque1 + defensa1 + velocidad1 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            System.out.println("Ataque jugador 1: ");
            ataque1 = in.nextInt();
            System.out.println("Defensa jugador 1: ");
            defensa1 = in.nextInt();
            System.out.println("Velocidad jugador 1: ");
            velocidad1 = in.nextInt();
            System.out.println("Vida jugador 1:");
            vida1 = in.nextInt();
        }

        System.out.println("Introduce los atributos del jugador 2, un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
        System.out.println("Ataque jugador 2: ");
        double ataque2 = in.nextInt()/1.7;
        System.out.println("Defensa jugador 2: ");
        double defensa2 = in.nextInt()/1.7;
        System.out.println("Velocidad jugador 2: ");
        int velocidad2 = in.nextInt();
        System.out.println("Vida jugador 2:");
        int vida2 = in.nextInt();
        int probabilidad_critico2 = 20;
        int regeneracion2 = vida2 / 10;
        while (vida2 + ataque2 + defensa2 + velocidad2 > 500) {
            System.out.println("Valores demasiado superiores, introduzca de nuevo");
            System.out.println("Introduce los atributos del jugador 2, la suma de los atributos no puede sumar mas de 500");
            System.out.println("Ataque jugador 2: ");
            ataque2 = in.nextInt();
            System.out.println("Defensa jugador 2: ");
            defensa2 = in.nextInt();
            System.out.println("Velocidad jugador 2: ");
            velocidad2 = in.nextInt();
            System.out.println("Vida jugador 2:");
            vida2 = in.nextInt();
        }
        System.out.println(".........................................................................................................................................................................................................................");
        System.out.println("ATRIBUTOS JUGADOR 1");
        System.out.println("VIDA : " + vida1);
        System.out.println("ATAQUE : " + ataque1);
        System.out.println("DEFENSA : " + defensa1);
        System.out.println("VELOCIDAD : " + velocidad1);
        System.out.println("PROBABILIDAD DE CRÍTICO : " + porcentaje + "%");
        System.out.println("REGENERACION : " + regeneracion1);
        System.out.println(".........................................................................................................................................................................................................................");
        System.out.println("ATRIBUTOS JUGADOR 2 ");
        System.out.println("VIDA : " + vida2);
        System.out.println("ATAQUE : " + ataque2);
        System.out.println("DEFENSA : " + defensa2);
        System.out.println("VELOCIDAD : " + velocidad2);
        System.out.println("PROBABILIDAD DE CRÍTICO : " + porcentaje + "%");
        System.out.println("REGENERACION : " + regeneracion2);

        int accion = 0;
        int golpe = 0;
        int ronda = 0;
        boolean ganador=true;
        System.out.println(".........................................................................................................................................................................................................................");
        while ((vida1 | vida2) > 0) {
            ronda = ronda++;

            if (velocidad1 > velocidad2) {
                ronda++;
                System.out.println("RONDA " + ronda);
                System.out.println("¿Que quiere hacer el jugador uno?");
                System.out.println("1. ATAQUE");
                System.out.println("2. REGENERACION");
                accion = in.nextInt();
                switch (accion) {
                    case 1:
                        int numero_critico=pof.nextInt(5);
                        int numero_critico2= pof.nextInt(5);
                        golpe = defensa2 % ataque1;
                        vida2 = vida2 - golpe;
                        if (numero_critico==numero_critico2){
                            golpe=golpe*2;
                            System.out.println("GOLPE CRITICO!!");
                        }
                        System.out.println("Daño inflingido : " + golpe);
                        System.out.println("Vida jugador 2 : " + vida2);
                        break;

                    case 2:
                        vida1 = vida1 + regeneracion1;
                        System.out.println("Vida jugador 1: " + vida1);
                        break;
                }
                if ((vida1 | vida2) > 0) {
                    System.out.println("");

                    System.out.println("");
                    System.out.println("¿Que quiere hacer el jugador dos?");
                    System.out.println("1. ATAQUE");
                    System.out.println("2. REGENERACION");
                    accion = in.nextInt();
                    switch (accion) {
                        case 1:
                            int numero_critico=pof.nextInt(5);
                            int numero_critico2= pof.nextInt(5);
                            golpe = defensa1 % ataque2;
                            if (numero_critico==numero_critico2) {
                                golpe = golpe * 2;
                                System.out.println("GOLPE CRITICO!!");
                            }
                            vida1 = vida1 - golpe;
                            System.out.println("Daño inflingido : " + golpe);
                            System.out.println("Vida jugador 1 : " + vida2);
                            break;

                        case 2:
                            vida2 = vida2 + regeneracion2;
                            System.out.println("Vida jugador 2: " + vida1);
                            break;
                    }


                }


            } else {
                ronda++;
                System.out.println("RONDA " + ronda);
                System.out.println("¿Que quiere hacer el jugador dos?");
                System.out.println("1. ATAQUE");
                System.out.println("2. REGENERACION");
                accion = in.nextInt();
                switch (accion) {
                    case 1:
                        int numero_critico=pof.nextInt(5);
                        int numero_critico2= pof.nextInt(5);
                        golpe = defensa1 % ataque2;
                        if (numero_critico==numero_critico2) {
                            golpe = golpe * 2;
                            System.out.println("GOLPE CRITICO!!");
                        }
                        vida1 = vida1 - golpe;
                        System.out.println("Daño inflingido : " + golpe);
                        System.out.println("Vida jugador 2 : " + vida1);
                        break;

                    case 2:
                        vida2 = vida2 + regeneracion2;
                        System.out.println("Vida jugador 2: " + vida2);
                        break;
                }
                if ((vida1 | vida2) > 0) {
                    System.out.println("");

                    System.out.println("");
                    System.out.println("¿Que quiere hacer el jugador uno?");
                    System.out.println("1. ATAQUE");
                    System.out.println("2. REGENERACION");
                    accion = in.nextInt();
                    switch (accion) {
                        case 1:
                            int numero_critico= pof.nextInt(5);
                            int numero_critico2= pof.nextInt(5);
                            golpe = defensa2 % ataque1;
                            if (numero_critico==numero_critico2) {
                                golpe = golpe * 2;
                                System.out.println("GOLPE CRITICO!!");
                            }
                            vida1 = vida1 - golpe;
                            System.out.println("Daño inflingido : " + golpe);
                            System.out.println("Vida jugador 1 : " + vida2);
                            break;

                        case 2:
                            vida2 = vida2 + regeneracion2;
                            System.out.println("Vida jugador 2: " + vida1);
                            break;

                    }

                }
            }System.out.println(".........................................................................................................................................................................................................................");
        }if (vida2<0){
            ganador=true;
        }else {
            ganador=false;
        }
        if (ganador=true){
            System.out.println("EL GANADOR DEL COMBATE ES EL JUGADOR UNO");
        }else {
            System.out.println("EL GANDOR DEL COMBATE ES EL JUGADOR DOS");
        }
    }
}