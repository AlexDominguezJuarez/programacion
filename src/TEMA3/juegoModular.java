package TEMA3;

import javax.swing.text.AbstractDocument;
import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class juegoModular {
    //FUNCIONES
    public static void mostrarGanador(int vidaJugador1, int vidaJugador2){
        if (vidaJugador2<=0){
            System.out.println("GANA EL JUGADOR 1");
        }
        if(vidaJugador1<=0){
            System.out.println("GANA EL JUGADOR 2");
        }
    }


    public static boolean comprobacionMenuEleccion(int eleccionAccion){
        if ((eleccionAccion<0)||(eleccionAccion>2)){
            return false;
        }
        return true;
    }

    public static int regeneracion(int regeneracion, int vidaJugador){
        vidaJugador=vidaJugador+regeneracion;
        System.out.println("SALUD RESTAURADA="+regeneracion);
        System.out.println();
        System.out.println("SALUD="+vidaJugador);
        return vidaJugador;
    }

    public static int metodoDeJuego(){
        Scanner in=new Scanner(System.in);
        System.out.println("1. JUGAR CON PERSONAJES YA CREADOS");
        System.out.println("2. PERSONALIZAR CARACTERISITCAS DE TU PERSONAJE");
        int eleccion = in.nextInt();
        return eleccion;
    }

    public static int definirEstadisticas(int habilidad){
        Scanner in=new Scanner(System.in);

        habilidad = in.nextInt();

        while (habilidad > 200) {
            System.out.println("EL ATRIBUTO ES DEMASIADO ALTO, INTRODUZCALO DE NUEVO    ");
            habilidad = in.nextInt();
        }
        return habilidad;
    }

    public static int menuDeAtaque(){
        Scanner in=new Scanner(System.in);
        int eleccion;
        boolean eleccionCorrecta=true;
        System.out.println("¿QUE ACCION QUIERES REALIZAR?");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. ATAQUE");
        System.out.println("2. REGENERACION");
        eleccion=in.nextInt();
        eleccionCorrecta=comprobacionMenuEleccion(eleccion);
        while (eleccionCorrecta==false){
            System.out.println("ELECCION NO DISPONIBLE, ELIJA DE NUEVO");
            eleccion=in.nextInt();
            eleccionCorrecta=comprobacionMenuEleccion(eleccion);
        }
        return eleccion;
    }

    public static int eleccionDePersonajeDefinido(){
        int eleccion_personaje;
        Scanner in=new Scanner(System.in);

        System.out.println("***ELIGE A TU PERSONAJE***");
        System.out.println("¿CON QUE JUGADOR QUIERES JUGAR?");
        System.out.println("1. BABOBUBA");
        System.out.println("2. EL CABEZON");
        System.out.println("3. DOMI");
        System.out.println("4. EL PARSE");
        System.out.println("5. GUSTAVO");
        System.out.println("6. EL NADADOR");
        System.out.println("7. EL ESQUIROL");
        System.out.println("8. RUMANO");
        eleccion_personaje = in.nextInt();
        return eleccion_personaje;
    }

    public static void mostrarEstadisticas(String nombre,int vida ,int ataque , int defensa,int velocidad, int regeneracion){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ESTADISTICAS DE "+nombre);
        System.out.println("VIDA DE "+nombre+" :"+vida);
        System.out.println("ATAQUE DE "+nombre+" :"+ataque);
        System.out.println("DEFENSA DE "+nombre+" :"+defensa);
        System.out.println("VELOCIDAD DE "+nombre+" :"+velocidad);
        System.out.println("REGENERACION DE"+nombre+" :"+regeneracion);
        System.out.println("----------------------------------------------------------------------------");


    }

    public static int ataqueRonda(int ataqueJugador1,int defensaJugador2,int vidaJugador2){
        Random pof=new Random();
        int numero_aleatorio_positivo=0;
        int numero_aleatorio_negativo=0;
        int golpe;
        int numero_critico = pof.nextInt(5);
        int numero_critico2 = pof.nextInt(5);
        numero_aleatorio_positivo=numero_aleatorio_positivo+pof.nextInt();
        numero_aleatorio_negativo=numero_aleatorio_negativo+pof.nextInt();
        golpe = ataqueJugador1 - (defensaJugador2 % ataqueJugador1)+numero_aleatorio_positivo-numero_aleatorio_positivo;
        vidaJugador2 = vidaJugador2 - golpe;
        if (numero_critico == numero_critico2) {
            golpe = golpe * 2;
            System.out.println("GOLPE CRITICO!!");
        }
        System.out.println("DAÑO INFLINGIDO="+golpe);
        return vidaJugador2;
    }

    public static void mostrarEstadisticasRonda(int vida1, int vida2,int vidaRegenerada1, int vidaRegenerada2){

    }

    public static void main(String[] args) {
        //VARIABLES
        Scanner in=new Scanner(System.in);
        Random random=new Random();


        int eleccion;
        int eleccionAccion1;
        int eleccionAccion2;
        int escogerPersonaje1=0;
        int escogerPersonaje2=0;

        String nombreJugador1="";
        int vidaJugador1=0;
        int ataqueJugador1=0;
        int defensaJugador1=0;
        int velocidadJugador1=0;
        int probabilidadCritico1=0;
        int regeneracion1=0;

        String nombreJugador2="";
        int vidaJugador2=0;
        int ataqueJugador2=0;
        int defensaJugador2=0;
        int velocidadJugador2=0;
        int probabilidadCritico2=0;
        int regeneracion2=0;
        int vidaRegenerada1=0;
        int vidaRegenerada2=0;
        int vidaAntesDeSerRegenerada1=0;
        int vidaAntesDeSerRegenerada2=0;


        boolean vivo=true;
        int ronda=0;




        eleccion=metodoDeJuego();
        switch (eleccion){
            case 1:
                System.out.println("***JUGADOR 1***");
                System.out.println();

                escogerPersonaje1=eleccionDePersonajeDefinido();
                switch (escogerPersonaje1){
                    case 1:
                        nombreJugador1 = "BABOBUBA";
                        vidaJugador1 = 110;
                        ataqueJugador1 = 85;
                        defensaJugador1 = 100;
                        velocidadJugador1 = 140;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 2:
                        nombreJugador1 = "EL CABEZON";
                        vidaJugador1 = 80;
                        ataqueJugador1 = 140;
                        defensaJugador1 = 125;
                        velocidadJugador1 = 90;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                    case 3:
                        nombreJugador1 = "DOMI";
                        vidaJugador1 = 100;
                        ataqueJugador1 = 100;
                        defensaJugador1 = 1150;
                        velocidadJugador1 = 95;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                    case 4:
                        nombreJugador1 = "EL PARSE";
                        vidaJugador1 = 125;
                        ataqueJugador1 = 80;
                        defensaJugador1 = 90;
                        velocidadJugador1 = 140;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                    case 5:
                        nombreJugador1 = "GUSTAVO";
                        vidaJugador1 = 90;
                        ataqueJugador1 = 150;
                        defensaJugador1 = 110;
                        velocidadJugador1 = 100;
                        probabilidadCritico1 = random.nextInt(5);

                        break;
                    case 6:
                        nombreJugador1 = "EL NADADOR";
                        vidaJugador1 = 130;
                        ataqueJugador1 = 80;
                        defensaJugador1 = 110;
                        velocidadJugador1 = 120;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                    case 7:
                        nombreJugador1 = "EL ESQUIROL";
                        vidaJugador1 = 125;
                        ataqueJugador1 = 80;
                        defensaJugador1 = 90;
                        velocidadJugador1 = 140;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                    case 8:
                        nombreJugador1 = "RUMANO";
                        vidaJugador1 = 120;
                        ataqueJugador1 = 90;
                        defensaJugador1 = 100;
                        velocidadJugador1 = 110;
                        probabilidadCritico1 = random.nextInt(5);
                        break;
                }
                mostrarEstadisticas(nombreJugador1,vidaJugador1,ataqueJugador1,defensaJugador1,velocidadJugador1,regeneracion1);
                System.out.println();
                System.out.println("***JUGADOR2***");
                escogerPersonaje2=eleccionDePersonajeDefinido();

                switch (escogerPersonaje2){
                    case 1:
                        nombreJugador2 = "BABOBUBA";
                        vidaJugador2 = 110;
                        ataqueJugador2 = 85;
                        defensaJugador2 = 100;
                        velocidadJugador2 = 140;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 2:
                        nombreJugador2 = "EL CABEZON";
                        vidaJugador2 = 80;
                        ataqueJugador2 = 140;
                        defensaJugador2 = 125;
                        velocidadJugador2 = 90;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 3:
                        nombreJugador2 = "DOMI";
                        vidaJugador2 = 100;
                        ataqueJugador2 = 100;
                        defensaJugador2 = 150;
                        velocidadJugador2 = 95;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 4:
                        nombreJugador2 = "EL PARSE";
                        vidaJugador2 = 125;
                        ataqueJugador2 = 80;
                        defensaJugador2 = 90;
                        velocidadJugador2 = 140;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 5:
                        nombreJugador2 = "GUSTAVO";
                        vidaJugador2 = 90;
                        ataqueJugador2 = 150;
                        defensaJugador2 = 110;
                        velocidadJugador2 = 100;
                        probabilidadCritico2 = random.nextInt(5);

                        break;
                    case 6:
                        nombreJugador1 = "EL NADADOR";
                        vidaJugador2 = 130;
                        ataqueJugador2 = 80;
                        defensaJugador2 = 110;
                        velocidadJugador2 = 120;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 7:
                        nombreJugador2 = "EL ESQUIROL";
                        vidaJugador2 = 125;
                        ataqueJugador2 = 80;
                        defensaJugador2 = 90;
                        velocidadJugador2 = 140;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                    case 8:
                        nombreJugador2 = "RUMANO";
                        vidaJugador2 = 120;
                        ataqueJugador2 = 90;
                        defensaJugador2 = 100;
                        velocidadJugador2 = 110;
                        probabilidadCritico2 = random.nextInt(5);
                        break;
                }
                mostrarEstadisticas(nombreJugador2,vidaJugador2,ataqueJugador2,defensaJugador2,velocidadJugador2,regeneracion2);
                System.out.println();


                break;
            case 2:
                System.out.println("INTRODUCE EL NOMBRE DEL JUGADOR 1");
                nombreJugador1=in.nextLine();

                System.out.println("INTRODUCE LAS ESTADISTICAS DE " + nombreJugador1 + ", UN ATRIBUTO NO PUEDE SER SUPERIOR A 150, WL TOTAL DE LOS ATRIBUTOS DEBE SER INFERIOR A 500");

                System.out.println("ELIJA CUANTA VIDA QUIERE QUE TENGA EL PERSONAJE");
                vidaJugador1=definirEstadisticas(vidaJugador1);
                System.out.println("ELIJA CUANTO ATAQUE QUIERE QUE TENGA EL PERSONAJE");
                ataqueJugador1=definirEstadisticas(ataqueJugador1);
                System.out.println("ELIJA CUANTA DEFENSA QUIERE QUE TENGA EL PERSONAJE");
                defensaJugador1=definirEstadisticas(defensaJugador1);
                System.out.println("ELIJA CUANTA VELOCIDAD QUIERE QUE TENGA EL PERSONAJE");
                velocidadJugador1=definirEstadisticas(velocidadJugador1);
                regeneracion1=defensaJugador1/10;
                mostrarEstadisticas(nombreJugador1,vidaJugador1,ataqueJugador1,defensaJugador1,velocidadJugador1,regeneracion1);

                System.out.println();
                System.out.println("INTRODUCE LAS ESTADISTICAS DE " + nombreJugador2 + ", UN ATRIBUTO NO PUEDE SER SUPERIOR A 150, WL TOTAL DE LOS ATRIBUTOS DEBE SER INFERIOR A 500");

                System.out.println("ELIJA CUANTA VIDA QUIERE QUE TENGA EL PERSONAJE");
                vidaJugador2=definirEstadisticas(vidaJugador2);
                System.out.println("ELIJA CUANTO ATAQUE QUIERE QUE TENGA EL PERSONAJE");
                ataqueJugador2=definirEstadisticas(ataqueJugador2);
                System.out.println("ELIJA CUANTA DEFENSA QUIERE QUE TENGA EL PERSONAJE");
                defensaJugador2=definirEstadisticas(defensaJugador2);
                System.out.println("ELIJA CUANTA VELOCIDAD QUIERE QUE TENGA EL PERSONAJE");
                velocidadJugador2 =definirEstadisticas(velocidadJugador2);
                regeneracion2=defensaJugador2/10;
                mostrarEstadisticas(nombreJugador2,vidaJugador2,ataqueJugador2,defensaJugador2,velocidadJugador2,regeneracion2);

                break;

        }
        while (vivo==true) {
            System.out.println("¡¡¡COMIENZA EL COMBATE!!!");
            if (velocidadJugador1 >= velocidadJugador2) {
                ronda++;
                System.out.println("***RONDA "+ronda+"***");
                System.out.println();
                System.out.println("JUGADOR 1");
                System.out.println("-------------------------------------");

                eleccionAccion1=menuDeAtaque();

                switch (eleccionAccion1) {
                    case 1:
                        System.out.println();
                        System.out.println("ATAQUE");
                        System.out.println();

                        vidaJugador2 = ataqueRonda(ataqueJugador1, defensaJugador2, vidaJugador2);
                        break;

                    case 2:
                        vidaAntesDeSerRegenerada2=vidaJugador2;
                        System.out.println();
                        System.out.println("RECUPERACION");
                        System.out.println("");
                        vidaJugador1 = regeneracion(regeneracion1, vidaJugador1);
                        vidaRegenerada2=vidaJugador2;
                        break;

                }
                if (vidaJugador2<=0) {
                    vivo = false;
                }
                if (vivo==true) {
                    System.out.println("-------------------------------------");
                    System.out.println();
                    System.out.println("JUGADOR 2");
                    System.out.println("-------------------------------------");

                    eleccionAccion1 = menuDeAtaque();

                    switch (eleccionAccion1) {
                        case 1:
                            System.out.println();
                            System.out.println("ATAQUE");
                            System.out.println();

                            vidaJugador2 = ataqueRonda(ataqueJugador1, defensaJugador2, vidaJugador2);
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("RECUPERACION");
                            System.out.println();
                            vidaJugador1 = regeneracion(regeneracion1, vidaJugador1);

                            break;

                    }
                }
            }


            if (velocidadJugador2>velocidadJugador1){
                System.out.println("¡¡¡COMIENZA EL COMBATE!!!");

                ronda++;
                System.out.println("***RONDA "+ronda+"***");
                System.out.println();
                System.out.println("JUGADOR 2");
                System.out.println("-------------------------------------");

                eleccionAccion1=menuDeAtaque();

                switch (eleccionAccion1) {
                    case 1:
                        System.out.println();
                        System.out.println("ATAQUE");
                        System.out.println();

                        vidaJugador2 = ataqueRonda(ataqueJugador1, defensaJugador2, vidaJugador2);
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("RECUPERACION");
                        System.out.println();
                        vidaJugador1 = regeneracion(regeneracion1, vidaJugador1);

                        break;

                }
                if (vidaJugador2<=0) {
                    vivo = false;
                }
                if (vivo==true) {
                    System.out.println("-------------------------------------");
                    System.out.println();
                    System.out.println("JUGADOR 2");
                    System.out.println("-------------------------------------");

                    eleccionAccion1 = menuDeAtaque();

                    switch (eleccionAccion1) {
                        case 1:
                            System.out.println();
                            System.out.println("ATAQUE");
                            System.out.println();

                            vidaJugador2 = ataqueRonda(ataqueJugador1, defensaJugador2, vidaJugador2);
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("RECUPERACION");
                            System.out.println("");
                            vidaJugador1 = regeneracion(regeneracion1, vidaJugador1);

                            break;


                    }
                }

            } mostrarGanador(vidaJugador1,vidaJugador2);
        }
    }
}