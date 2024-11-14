package JUEGO;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class juego1 {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SIMULADOR DE PELEAS");
        Scanner in = new Scanner(System.in);
        DecimalFormat decimales= new DecimalFormat("####.##");
        int porcentaje = 10;
        System.out.println("Introduce el nombre del jugador uno");
        String nombre1=in.next();

        System.out.println("Introduce el nombre del jugador dos");
        String nombre2=in.next();
        System.out.println("Introduce los atributos de "+nombre1+", un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
        System.out.println("Ataque de "+nombre1+" : ");
        double ataque1 = in.nextInt();

        ataque1=ataque1/1.7;
        decimales.format(ataque1);
        System.out.println("Defensa de "+ nombre1+" : ");
        double defensa1 = in.nextInt()/1.7;
        decimales.format(defensa1);
        System.out.println("Velocidad de "+nombre1+" : ");
        double velocidad1 = in.nextInt();
        decimales.format(velocidad1);
        System.out.println("Vida de " +nombre1+" :");
        double vida1 = in.nextInt();
        decimales.format(vida1);
        Random pof = new Random(10);
        int probabiliad_critico1 = 20;
        double regeneracion1 = vida1 / 10;
        while (vida1 + ataque1 + defensa1 + velocidad1 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            System.out.println("Ataque de " +nombre1+": ");
            ataque1 = in.nextInt();
            System.out.println("Defensa de "+ nombre1+" : ");
            defensa1 = in.nextInt();
            System.out.println("Velocidad de "+ nombre1+" : ");
            velocidad1 = in.nextInt();
            System.out.println("Vida de " + nombre1+ ":");
            vida1 = in.nextInt();
        }

        System.out.println("Introduce los atributos del jugador 2, un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
        double ataque2 = in.nextInt();

        ataque2=ataque2/1.7;
        decimales.format(ataque2);
        System.out.println("Defensa de "+ nombre2+" : ");
        double defensa2 = in.nextInt()/1.7;
        decimales.format(defensa2);
        System.out.println("Velocidad de "+nombre2+" : ");
        double velocidad2= in.nextInt();
        decimales.format(velocidad2);
        System.out.println("Vida de " +nombre2+" :");
        double vida2 = in.nextInt();
        decimales.format(vida2);

        int probabiliad_critico2 = 20;
        double regeneracion2 = vida2 / 10;
        while (vida2 + ataque2 + defensa2 + velocidad2 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            System.out.println("Ataque de " +nombre2+": ");
            ataque1 = in.nextInt();
            System.out.println("Defensa de "+ nombre2+" : ");
            defensa1 = in.nextInt();
            System.out.println("Velocidad de "+ nombre2+" : ");
            velocidad1 = in.nextInt();
            System.out.println("Vida de " + nombre2+ ":");
            vida1 = in.nextInt();

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
        double golpe = 0;
        int ronda = 0;
        boolean ganador=true;
        boolean vivo=true;
        System.out.println(".........................................................................................................................................................................................................................");
        while ( vivo==true) {
            ronda = ronda++;

            if (velocidad1 > velocidad2) {
                ronda++;
                System.out.println("RONDA " + ronda);
                System.out.println("¿Que quiere hacer "+ nombre1+" ?");
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
                        if (vida2<=0) {
                            vivo = false;
                        }
                        System.out.println("Daño inflingido : " + golpe);
                        System.out.println("Vida jugador 2 : " + vida2);
                        break;

                    case 2:
                        vida1 = vida1 + regeneracion1;
                        System.out.println("Vida jugador 1: " + vida1);
                        break;
                }
                if ( vivo==true) {
                    System.out.println("");

                    System.out.println("");
                    System.out.println("¿Que quiere hacer "+ nombre2+ "?");
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
                            System.out.println("Vida jugador 1 : " + vida1);
                            if (vida1<=0) {
                                vivo = false;
                            }
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
                System.out.println("¿Que quiere hacer "+ nombre2+"?");
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
                        if (vida2<=0) {
                            vivo = false;
                        }
                        break;

                    case 2:
                        vida2 = vida2 + regeneracion2;
                        System.out.println("Vida jugador 2: " + vida2);
                        break;
                }
                if (vivo=true){

                    System.out.println("");

                    System.out.println("");
                    System.out.println("¿Que quiere hacer "+nombre1+"?");
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
                            System.out.println("Vida jugador 1 : " + vida1);
                            if (vida1<=0){
                                vivo=false;
                            }
                            break;

                        case 2:
                            vida2 = vida2 + regeneracion2;
                            System.out.println("Vida jugador 2: " + vida2);
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