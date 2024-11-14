package JUEGO;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class juego1 {
    public static void main(String[] args) {
        //COSAS PARA Q LAS COSAS FUNCIONEN
        System.out.println("BIENVENIDO AL SIMULADOR DE PELEAS");
        Scanner in = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("####.##");
        Random random=new Random();
        //NOMBRES
        System.out.println("Introduce el nombre del jugador uno");
        String nombre1 = in.nextLine();
        System.out.println("Introduce el nombre del jugador dos");
        String nombre2 = in.nextLine();
        //PERSONAJES
        String nombre_gustavo="GUSTAVO";
        int vida_gustavo=90;
        int ataque_gustavo=150;
        int defensa_gustavo=110;
        int velocidad_gustavo=100;
        int probabilidad_critico_gustavo= random.nextInt(3);

        String nombre_eloy="CABEZON";
        int vida_eloy=80;
        int ataque_eloy=140;
        int defensa_eloy=125;
        int velocidad_eloy=90;
        int probabilidad_critico_eloy=random.nextInt(5);

        String nombre_rumano="RUMANO";
        int vida_rumano=120;
        int ataque_rumano=90;
        int defensa_rumano=100;
        int velocidad_rumano=110;
        int probabilidad_critico_rumano=random.nextInt(6);

        String nombre_parse="EL PARSE";
        int vida_parse=125;
        int ataque_parse=90;
        int defensa_parse=90;
        int velocidad_parse=125;

        String nombre_Alejandro="BABOBUBA";
        int vida_alejandro=110;
        int ataque_alejandro=85;
        int defensa_alejandro=100;
        int velocidad_alejandro=140;
        int probabilidad_critico_alejandro= random.nextInt(3);

        String nombre_izan="NADADOR";
        int vida_izan=130;
        int ataque_izan=80;
        int defensa_izan=110;
        int velocidad_izan=130;
        int probabilidad_critico_izan=random.nextInt(4);

        String nombre_joan="MUY MONO";
        int vida_joan=95;
        int ataque_joan=115;
        int defensa_joan=115;
        int velocidad_joan=105;
        int probabilidad_critico_joan= random.nextInt(5);

        String nombre_alex="DOMI";
        int vida_alex=100;
        int ataque_alex=100;
        int defensa_alex=



        //JUGADOR UNO
        System.out.println("Introduce los atributos de " + nombre1 + ", un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
        System.out.println("Ataque de " + nombre1 + " : ");
        double ataque1_sin_dividir = in.nextInt();


        while (ataque1_sin_dividir > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            ataque1_sin_dividir = in.nextInt();
        }
        double ataque1 = ataque1_sin_dividir / 1.7;
        decimales.format(ataque1);
        System.out.println("Defensa de " + nombre1 + " : ");

        double defensa1_sin_dividir = in.nextInt();
        while (defensa1_sin_dividir> 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            defensa1_sin_dividir = in.nextInt();
        }
        double defensa1 = defensa1_sin_dividir / 1.7;

        decimales.format(defensa1);
        System.out.println("Velocidad de " + nombre1 + " : ");
        double velocidad1 = in.nextInt();
        while (velocidad1 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            velocidad1 = in.nextInt();
        }
        decimales.format(velocidad1);
        System.out.println("Vida de " + nombre1 + " :");
        double vida1 = in.nextInt();
        while (vida1 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            vida1 = in.nextInt();
        }
        decimales.format(vida1);
        Random pof = new Random(10);
        int probabiliad_critico1 = 20;
        double regeneracion1 = vida1 / 10;
        while (vida1 + ataque1_sin_dividir + defensa1_sin_dividir + velocidad1 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            System.out.println("Ataque de " + nombre1 + " : ");
            ataque1_sin_dividir = in.nextInt();


            while (ataque1_sin_dividir > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                ataque1_sin_dividir = in.nextInt();
            }
            ataque1 = ataque1_sin_dividir / 1.7;
            decimales.format(ataque1);
            System.out.println("Defensa de " + nombre1 + " : ");

            defensa1_sin_dividir = in.nextInt();
            while (defensa1_sin_dividir> 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                defensa1_sin_dividir = in.nextInt();
            }
            defensa1 = defensa1_sin_dividir / 1.7;

            decimales.format(defensa1);
            System.out.println("Velocidad de " + nombre1 + " : ");
            velocidad1 = in.nextInt();
            while (velocidad1 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                velocidad1 = in.nextInt();
            }
            decimales.format(velocidad1);
            System.out.println("Vida de " + nombre1 + " :");
            vida1 = in.nextInt();
            while (vida1 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                vida1 = in.nextInt();
            }
            decimales.format(vida1);
        }
        //JUGADOR DOS
        System.out.println("Introduce los atributos del jugador 2, un atributo no puede tener mas de 150 puntos, el total de los atributos no puede ser superior a 500");
        double ataque2_sin_dividir = in.nextInt();
        while (ataque2_sin_dividir > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            ataque2_sin_dividir = in.nextInt();
        }
        double ataque2 = ataque2_sin_dividir / 1.7;
        decimales.format(ataque2);
        System.out.println("Defensa de " + nombre2 + " : ");
        double defensa2_sin_dividir = in.nextInt();
        while (defensa2_sin_dividir > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            defensa2_sin_dividir = in.nextInt();
        }
        double defensa2 = defensa2_sin_dividir / 1.7;
        decimales.format(defensa2);
        System.out.println("Velocidad de " + nombre2 + " : ");
        double velocidad2 = in.nextInt();
        while (velocidad2 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            velocidad2 = in.nextInt();
        }
        decimales.format(velocidad2);
        System.out.println("Vida de " + nombre2 + " :");
        double vida2 = in.nextInt();
        while (vida2 > 150) {
            System.out.println("el atributo es demasiado alto, introducelo de nuevo");
            vida2 = in.nextInt();
        }
        decimales.format(vida2);

        int probabiliad_critico2 = 20;
        double regeneracion2 = vida2 / 10;
        while (vida2 + ataque2_sin_dividir + defensa2_sin_dividir + velocidad2 > 500) {
            System.out.println("valores demasiado superiores, introduzca de nuevo");
            ataque2_sin_dividir = in.nextInt();
            while (ataque2_sin_dividir > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                ataque2_sin_dividir = in.nextInt();
            }
            ataque2 = ataque2_sin_dividir / 1.7;
            decimales.format(ataque2);
            System.out.println("Defensa de " + nombre2 + " : ");
            defensa2_sin_dividir = in.nextInt();
            while (defensa2_sin_dividir > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                defensa2_sin_dividir = in.nextInt();
            }
            defensa2 = defensa2_sin_dividir / 1.7;
            decimales.format(defensa2);
            System.out.println("Velocidad de " + nombre2 + " : ");
            velocidad2 = in.nextInt();
            while (velocidad2 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                velocidad2 = in.nextInt();
            }
            decimales.format(velocidad2);
            System.out.println("Vida de " + nombre2 + " :");
            vida2 = in.nextInt();
            while (vida2 > 150) {
                System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                vida2 = in.nextInt();
            }
            decimales.format(vida2);
        //ESTADISTICAS
        }
        System.out.println(".........................................................................................................................................................................................................................");
        System.out.println("ATRIBUTOS DE "+ nombre2);
        System.out.println("VIDA : " + vida1);
        System.out.println("ATAQUE : " + ataque1);
        System.out.println("DEFENSA : " + defensa1);
        System.out.println("VELOCIDAD : " + velocidad1);
        System.out.println("PROBABILIDAD DE CRÍTICO : " + porcentaje + "%");
        System.out.println("REGENERACION : " + regeneracion1);
        System.out.println(".........................................................................................................................................................................................................................");
        System.out.println("ATRIBUTOS DE "+nombre2);
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
        //RONDA
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
                        golpe = ataque1-(defensa2 % ataque1);
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
                } if ( vivo==true) {
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
                            golpe = ataque1-(defensa2 % ataque1);
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
                        golpe = ataque2-(defensa1 % ataque2);
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
                }if (vivo=true){

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
                            golpe = ataque1-(defensa2 % ataque1);
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
            }
            //FINAL
            System.out.println(".........................................................................................................................................................................................................................");
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