
package JUEGO;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        //COSAS PARA Q LAS COSAS FUNCIONEN
        System.out.println("BIENVENIDO AL SIMULADOR DE PELEAS (VERSION GRUPO DE AMIGOS)");
        Scanner in = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("####.##");
        Random pof = new Random(10);
        Random random = new Random();
        int porcentaje = 10;
        int eleccion = 0;
        int recarga_habilidad1 = 0;
        int recarga_habilidad2 = 0;
        int eleccion1 = 0;
        int eleccion2 = 0;
        double vida1 = 0;
        double vida2 = 0;
        int velocidad1 = 0;
        int velocidad2 = 0;
        double ataque1 = 0;
        double ataque2 = 0;
        double defensa2 = 0;
        double defensa1 = 0;
        double regeneracion1 = 0;
        double regeneracion2 = 0;
        String nombre1 ="JUGADOR1" ;
        String nombre2 ="JUGADOR2";
        int eleccion1_jugador1 = 0;
        int eleccion2_jugador1 = 0;
        int eleccion3_jugador1 = 0;
        int eleccion1_jugador2 = 0;
        int eleccion2_jugador2 = 0;
        int eleccion3_jugador2 = 0;
        int eleccion_personaje;
        boolean ganador_jugador1=false;
        boolean ganador_jugador2= false;
        //PERSONAJES
        String nombre_gustavo = "GUSTAVO";
        int vida_gustavo = 90;
        int ataque_gustavo = 150;
        int defensa_gustavo = 110;
        int velocidad_gustavo = 100;
        int probabilidad_critico_gustavo = random.nextInt(4);

        String nombre_eloy = "CABEZON";
        int vida_eloy = 80;
        int ataque_eloy = 140;
        int defensa_eloy = 125;
        int velocidad_eloy = 90;
        int probabilidad_critico_eloy = random.nextInt(5);

        String nombre_rumano = "RUMANO";
        int vida_rumano = 120;
        int ataque_rumano = 90;
        int defensa_rumano = 100;
        int velocidad_rumano = 110;
        int probabilidad_critico_rumano = random.nextInt(6);

        String nombre_parse = "EL PARSE";
        int vida_parse = 125;
        int ataque_parse = 80;
        int defensa_parse = 90;
        int velocidad_parse = 125;
        int probabilidad_critico_parse = random.nextInt(4);

        String nombre_Alejandro = "BABOBUBA";
        int vida_alejandro = 110;
        int ataque_alejandro = 85;
        int defensa_alejandro = 100;
        int velocidad_alejandro = 140;
        int probabilidad_critico_alejandro = random.nextInt(5);

        String nombre_izan = "NADADOR";
        int vida_izan = 130;
        int ataque_izan = 80;
        int defensa_izan = 110;
        int velocidad_izan = 120;
        int probabilidad_critico_izan = random.nextInt(5);

        String nombre_joan = "ESQUIROL";
        int vida_joan = 95;
        int ataque_joan = 115;
        int defensa_joan = 115;
        int velocidad_joan = 105;
        int probabilidad_critico_joan = random.nextInt(5);

        String nombre_alex = "DOMI";
        int vida_alex = 100;
        int ataque_alex = 100;
        int defensa_alex = 115;
        int velocidad_alex = 95;
        int probabilidad_critico_alex = random.nextInt(5);


        //ELECCION DE PERSONAJES
        System.out.println("1. JUGAR CON PERSONAJES YA CREADOS");
        System.out.println("2. PERSONALIZAR CARACTERISITCAS DE TU PERSONAJE");
        eleccion = in.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("***ELIGE EL PRIMER JUGADOR***");
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
                switch (eleccion_personaje) {
                    case 1:
                        System.out.println("HAS ELEGIDO A BABOBUBA");
                        System.out.println("BABOBUBA (ALEJANDRO) ES UN GRAN JUGADOR DE FUTBOL, CON UNOS GEMELOS PRIVILEGIADOS TIENE " +
                                "UNA GRAN VELOCIDAD, PERO ES PRACTICAMENTE INOFENSIVO");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_alejandro);
                        System.out.println("ATAQUE " + ataque_alejandro);
                        System.out.println("DEFENSA " + defensa_alejandro);
                        System.out.println("VELOCIDAD " + velocidad_alejandro);
                        System.out.println("REGENERACION " + vida_alejandro / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_alejandro);
                        ataque1 = (ataque_alejandro / 2.1);
                        defensa1 = (defensa_alejandro / 1.7);
                        velocidad1 = (velocidad_alejandro);
                        vida1 = (vida_alejandro);
                        porcentaje = probabilidad_critico_alejandro;
                        regeneracion1 = vida_alejandro / 10;
                        nombre1 = "BABOBUBA";


                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. OJOS VERDES");
                        System.out.println("LOS OJOS VERDES DE BABOBUBA PUEDEN DISTRAER AL CONTRICANTE, HAY UNA POSIBILIDAD DEL 50% DE QUE EL RIVAL NO PUEDA MOVERSE, 3 TURNOS DE RECARGA");
                        System.out.println("2. ENTRENAMIENTO");
                        System.out.println("BABOBUBA HA IDO MUCHO A ENTRENAR Y SUS GEMELOS HAN CRECIDO, AUMENTA SU VELOCIDAD A 150 PERMANENTEMENTE(SOLO SE PUEDE USAR UNA VEZ )");
                        System.out.println("3. LIGAR CON LA PRIMA DE SUS AMIGOS");
                        System.out.println("BABOBUBA SE BESA CON LA PRIMA DEL ESQUIROL, POR CADA BESO RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA) ");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;
                    case 2:
                        System.out.println("HAS ELEGIDO A CABEZON");
                        System.out.println("EL CABEZON (ELOY) ES UN CHICO DE PUEBLO CON UN DIAMETRO CRANEAL DESMESURADO, LO CUAL LE RESTA VELOCIDAD, PERO LO COMPENSA CON SU GRAN FUERZA DE MOZO ALBACETEÑO");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_eloy);
                        System.out.println("ATAQUE " + ataque_eloy);
                        System.out.println("DEFENSA " + defensa_eloy);
                        System.out.println("VELOCIDAD " + velocidad_eloy);
                        System.out.println("REGENERACION " + vida_eloy / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_eloy);

                        ataque1 = (ataque_eloy / 2.1);
                        defensa1 = (defensa_eloy / 1.7);
                        velocidad1 = (velocidad_eloy);
                        vida1 = (vida_eloy);
                        porcentaje = probabilidad_critico_eloy;
                        regeneracion1 = vida_eloy / 10;
                        nombre1 = "CABEZON";


                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. CABEZAZO");
                        System.out.println("EL CABEZON USA SU CABEZA PARA ATACAR, AUMENTANDO SU ATAQUE POR 1,5 EN SU PROXIMO TURNO(2 TURNOS DE RECARGA)");
                        System.out.println("2. FIESTA DE PUEBLO");
                        System.out.println("EN EL PUEBLO DE EL CABEZON SE RUMOREA QUE EN LAS FIESTAS HAY UNA GRAN CANTIDAD DE PASTILLAS(Y NO DE LAS DE LA FARMACIA), AUMENTA SU VELOCIDAD AL MAXIMO");
                        System.out.println("3. HOMBRO FUERA");
                        System.out.println("EL CABEZON PUEDE SACARSE EL HOMBRO PARA DESPISTAR AL RIVAL, PERO NO PUEDE ATACAR CON LA MISMA FUERZA, 70% DE POSIBILIDAD DE EVITAR EL SIGUIENTE ATAQUE,-20 PUNTOS DE ATAQUE(SOLO SI EL CABEZON ES MAS VELOZ QUE SU RIVAL)");


                    case 3:
                        System.out.println("HAS ELEGIDO A DOMI");
                        System.out.println("CON UN PELO QUE PARECE UN ARBUSTO , DOMI (ALEX) ES UN SER PECULIAR, CON MUCHAS MANIAS Y MUY MAJO, HERMANO DE GUSTAVO");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_alex);
                        System.out.println("ATAQUE " + ataque_alex);
                        System.out.println("DEFENSA " + defensa_alex);
                        System.out.println("VELOCIDAD " + velocidad_alex);
                        System.out.println("REGENERACION " + vida_alex / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_alex);

                        ataque1 = (ataque_alex / 2.1);
                        defensa1 = (defensa_alex / 1.7);
                        velocidad1 = (velocidad_alex);
                        vida1 = (vida_alex);
                        porcentaje = probabilidad_critico_alex;
                        regeneracion1 = vida_alex / 10;
                        nombre1 = "DOMI";

                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. IR A LA DERECHA");
                        System.out.println("DOMI SIEMPRE TIENE QUE IR EN UN ASIENTO DE LA DERECHA EN EL COCHE, LO CUAL DESQUICICIA A SUS RIVALES, LA DEFENSA DE SU RIVAL BAJA 30 PUNTOS(4 TURNOS DE RECARGA)");
                        System.out.println("2. JOSE CARLOS");
                        System.out.println("UN DIA EL CABEZON Y DOMI ADOPTARON A JOSE CARLOS, UNA BOTELLA DE RON DE 5 EUROS, CADA TRAGO DE ESE RON AUMENTA 20 PUNTOS DE ATAQUE, PERO BAJA 20 DE VIDA(2 TURNOS DE RECARGA)");
                        System.out.println("3. DEJARLE DE HABLAR");
                        System.out.println("'LO SIENTO, VOY A EMPEZAR MEDICINA' LE DIJERON A DOMI ANTES DE QUE LE DEJARAN DE HABLAR, CADA VEZ QUE SE ACUERDA, SU ATAQUE Y SU DEFENSA SUBEN 20 PUNTOS, PERO SU VELOCIDAD Y VIDA BAJAN 20 (2 TURNOS DE RECARGA)");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;

                    case 4:
                        System.out.println("HAS ELEGIDO AL PARSE");
                        System.out.println("COLOMBIANO DE NACIMIENTO, EL PARSE (SIMON) TIENE UNA PERILLA CON HABILIDADES ESPECIALES, ¡LA CUAL LE PERMITE ESCOGER 3 HABILIDADES");

                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_parse);
                        System.out.println("ATAQUE " + ataque_parse);
                        System.out.println("DEFENSA " + defensa_parse);
                        System.out.println("VELOCIDAD " + velocidad_parse);
                        System.out.println("REGENERACION " + vida_parse / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_parse);

                        ataque1 = (ataque_parse / 2.1);
                        defensa1 = (defensa_parse / 1.7);
                        velocidad1 = (velocidad_parse);
                        vida1 = (vida_parse);
                        porcentaje = probabilidad_critico_parse;
                        regeneracion1 = vida_parse / 10;
                        nombre1 = "EL PARSE";


                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 3 HABILIDADES");
                        System.out.println("1. SUPERPERILLA");
                        System.out.println("LA PERILLA DEL PARSE ES TAN FRONDOSA QUE AL RIVAL LE CUESTA ATRAVESARLA, AUMENTA 30 PUNTOS LA DEFENSA(3 TURNOS DE RECARGA)");
                        System.out.println("2. PORRO");
                        System.out.println("EN LOS VIEJOS TIEMPOS, GUSTAVO Y EL PARSE LE DABAN A LA LECHUGA DEL DIABLO, CUANDO SE FUMA SE AUMENTA SU POSIBILIDAD DE CRITICO A 33%, PERO SE REDUCE SU VELOCIDAD 30 PUNTOS");
                        System.out.println("3. LIGAR CON LAS PRIMAS DE SUS AMIGOS");
                        System.out.println("EL PARSE SE BESA CON LA PRIMA DE DOMI Y GUSTAVO, POR CADA BESO RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA) ");
                        System.out.println("4. MECANICO");
                        System.out.println("EL PARSE ESTUDIA PARA SER MECANICO, Y HA INVENTADO UN APARATO QUE REGENERA SU VIDA, POR CADA TURNO QUE PASA RECUPERA 8 PUNTOS DE VIDA ");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;

                    case 5:
                        System.out.println("HAS ELEGIDO A GUSTAVO");
                        System.out.println("A SUS 16 AÑOS DE EDAD, PARECE EL MAS ADULTO DEL GRUPO. HERMANO DE DOMI. ES EL REY DE LOS GUSTAVOS,AUNQUE REALMENTE SE LLAMA LUIS");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_gustavo);
                        System.out.println("ATAQUE " + ataque_gustavo);
                        System.out.println("DEFENSA " + defensa_gustavo);
                        System.out.println("VELOCIDAD " + velocidad_gustavo);
                        System.out.println("REGENERACION " + vida_gustavo / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_gustavo);


                        ataque1 = (ataque_gustavo / 2.1);
                        defensa1 = (defensa_gustavo / 1.7);
                        velocidad1 = (velocidad_gustavo);
                        vida1 = (vida_gustavo);
                        porcentaje = probabilidad_critico_gustavo;
                        regeneracion1 = vida_gustavo / 10;
                        nombre1 = "GUSTAVO";
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. RAPARSE");
                        System.out.println("UN DIA GUSTAVO DIJO 'RAPARME' Y EN LOS BANCOS LE CORTAMOS EL PELO, CON SU NUEVO CORTE, GUSTAVO OBTIENE 30 PUNTOS MAS DE VELOCIDAD(SOLO SE PUEDE USAR UNA VEZ)");
                        System.out.println("2. PELUSA");
                        System.out.println("UN DIA GUSTAVO SE MIRO SU OMBLIGO, DEL CUAL SACÓ UNA PELUSA, ESTA PELUSA INFLINGE UN GOLPE DE 150 PUNTOS(4 TURNOS DE RECARGA)");
                        System.out.println("3. PROBLEMA DE HIPERTROFIA");
                        System.out.println("GUSTAVO ESTÁ EXCESIVAMENTE FUERTE, LO CUAL LE SUBE EL ATAQUE Y LA DEFENSA 18 PUNTOS, PERO LE BAJA LA VELOIDAD 35 PUNTOS(SOLO SE PUEDE USAR UNA VEZ)");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;

                    case 6:
                        System.out.println("HAS ELEGIDO AL NADADOR");
                        System.out.println("TODO UN COMPETIDOR AL VOLANTE, SE BEBE LOS CHUPITOS COMO LE ECHA GASOLINA AL COCHE");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_izan);
                        System.out.println("ATAQUE " + ataque_izan);
                        System.out.println("DEFENSA " + defensa_izan);
                        System.out.println("VELOCIDAD " + velocidad_izan);
                        System.out.println("REGENERACION " + vida_izan / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_izan);
                        nombre1 = "EL NADADOR";

                        ataque1 = (ataque_izan / 2.1);
                        defensa1 = (defensa_izan / 1.7);
                        velocidad1 = (velocidad_izan);
                        vida1 = (vida_izan);
                        porcentaje = probabilidad_critico_izan;
                        regeneracion1 = vida_izan / 10;
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. CAMINO A BARCELONA");
                        System.out.println("JUNTO A GUSTAVO, DOMI Y EL PARSE, UNA NOCHE APARENTEMENTE NORMAL EN EL ARENAL TERMINO SIENDO UN VIAJE EL EL COCHE DEL NADADOR A LA SAGRADA FAMILIA, A VELOCIDAD MEDIA DE 187KM/H, AUMENTA LA VELOCIDAD AL MAXIMO ");
                        System.out.println("2. CONDUCCION TEMERARIA");
                        System.out.println("CON LA REALIDAD ALTERADA, EL NADADOR ATROPELLA A SU RIVAL CREYENDO QUE ESTÁ EN LOS COCHE DE CHOQUE, EL GOLPE INFLINGE 105 PUNTOS(3 TURNOS DE RECARGA)");
                        System.out.println("3. LIGAR CON LA MEJOR AMIGA DE SUS AMIGOS");
                        System.out.println("MIENTRAS DOMI ESTABA EN SU PUEBLO, EL NADADOR SE LIO CON LA (AHORA EX)MEJOR AMIGA DE DOMI, CADA BESO DE ELLA RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA)");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;

                    case 7:
                        System.out.println("HAS ELEGIDO A EL ESQUIROL");
                        System.out.println("EL ESQUIROL (JOAN) JUGABA EN EL CLUB WATERPOLO CASTELLO, HASTA QUE EL CHAQUETERO SE PASÓ AL GODELLA, POR LO DEMAS UN TIO DE 10");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_joan);
                        System.out.println("ATAQUE " + ataque_joan);
                        System.out.println("DEFENSA " + defensa_joan);
                        System.out.println("VELOCIDAD " + velocidad_joan);
                        System.out.println("REGENERACION " + vida_joan / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_joan);

                        ataque1 = (ataque_eloy / 2.1);
                        defensa1 = (defensa_eloy / 1.7);
                        velocidad1 = (velocidad_eloy);
                        vida1 = (vida_eloy);
                        porcentaje = probabilidad_critico_eloy;
                        regeneracion1 = vida_eloy / 10;
                        nombre1 = "EL ESQUIROL";


                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. ENCANTO");
                        System.out.println("EL ESQUIROL TIENE UN ATRACTIVO INNEGABLE, EL CUAL PUEDE DISTRAER A SU RIVAL, TIENE UN 50% DE QUE SU RIVAL NO PUEDA MOVERSE EL SIGUIENTE TURNO");
                        System.out.println("2. BIOQUIMICA");
                        System.out.println("EN UNA PRACTICA DE LABORATORIA A DESCUBIERTO UN COMPUESTO QUE ES EFECTIVO PARA TODO. AUMENTA 30 PUNTOS EN EL ATRIBUTO QUE SE ELIJA (SOLO SE PUEDE USAR UNA VEZ)");
                        System.out.println("3. SER EL MAS PEQUEÑO");
                        System.out.println("EL ESQUIROL ES DE LO MAS PEQUEÑOS DEL GRUPO, PERO SIEMPRE SE HA DICHO QUE LOS ULTIMOS ALGUN DIA SERÁN LOS PRIMEROS, ACTUA SIEMPRE EL PRIMERO");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;

                    case 8:
                        System.out.println("HAS ELEGIDO AL RUMANO");
                        System.out.println("MAS FRIO QUE UNA NOCHE EN EL CASTILLO DE SU ABUELO EL CONDE DRACULA, EL RUMANO LLEGO A ESPAÑA HACE AÑOS, VIGILA QUE TUS TUBERIAS NO SEAN DE COBRE");
                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("E S T A D I S T I C A S ");
                        System.out.println("VIDA " + vida_joan);
                        System.out.println("ATAQUE " + ataque_rumano);
                        System.out.println("DEFENSA " + defensa_rumano);
                        System.out.println("VELOCIDAD " + velocidad_rumano);
                        System.out.println("REGENERACION " + vida_rumano / 15);
                        System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_rumano);

                        ataque1 = (ataque_rumano / 2.1);
                        defensa1 = (defensa_rumano / 1.7);
                        velocidad1 = (velocidad_rumano);
                        vida1 = (vida_rumano);
                        porcentaje = probabilidad_critico_rumano;
                        regeneracion1 = vida_rumano / 10;
                        nombre1 = "RUMANO";

                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }


                        System.out.println(".........................................................................................................................................................................................................................");
                        System.out.println("H A B I L I D A D E S");
                        System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                        System.out.println("1. ROBAR COBRE");
                        System.out.println("EL RUMANO SE PAGA LA UNIVERSIDAD A BASE DE VENDER COBRE, EL CUAL ROBA A SUS RIVALES. LE ROBA 30 PUNTOS DE VIDA A SU RIVAL Y RESTAURA CON ELLOS SU VIDA(3 TURNOS DE RECARGA)");
                        System.out.println("2. LIGAR CON LAS PRIMAS DE SUS AMIGOS");
                        System.out.println("EL RUMANO TIENE UNA RELACION DE 3 AÑOS CON LA PRIMA DE BABOBUBA, CADA BESO RECUPERA 40 PUNTOS DE VIDA");
                        System.out.println("3. VER ILLOJUAN");
                        System.out.println("EL RUMANO ES UN GRAN FAN DEL STREAMER ILLOJUAN, CUANDO SE PASA SU TURNO VIENDO SI STREAM, AUMENTA 20 PUNTOS SU ATAQUE, DEFENSA Y VELOCIDAD(4 TURNOS DE RECARGA)");
                        eleccion1_jugador1 = in.nextInt();
                        eleccion2_jugador1 = in.nextInt();
                        switch (eleccion1_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        switch (eleccion2_jugador1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                        }

                        break;


                }
                break;

            case 2:
                System.out.println("Introduce el nombre del jugador uno");



                String basura=in.nextLine();
                nombre1 = in.nextLine();



                System.out.println("Introduce los atributos de " + nombre1 + ", un atributo no puede tener mas de 150 puntos, el total de los atributos no pueder ser superior a 500");
                System.out.println("Ataque de " + nombre1 + " : ");
                double ataque1_sin_dividir = in.nextInt();


                while (ataque1_sin_dividir > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    ataque1_sin_dividir = in.nextInt();
                }
                ataque1 = ataque1_sin_dividir / 2.1;
                decimales.format(ataque1);
                System.out.println("Defensa de " + nombre1 + " : ");

                double defensa1_sin_dividir = in.nextInt();
                while (defensa1_sin_dividir > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    defensa1_sin_dividir = in.nextInt();
                }
                defensa1 = defensa1_sin_dividir / 1.5;

                decimales.format(defensa1);
                System.out.println("Velocidad de " + nombre1 + " : ");
                velocidad1 = in.nextInt();
                while (velocidad1 > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    velocidad1 = in.nextInt();
                }
                decimales.format(velocidad1);
                System.out.println("Vida de " + nombre1 + " :");
                vida1 = in.nextInt();
                while (vida1 > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    vida1 = in.nextInt()*1.2;
                }
                decimales.format(vida1);

                int probabiliad_critico1 = 20;
                regeneracion1 = vida1 / 15;
                while (vida1 + ataque1_sin_dividir + defensa1_sin_dividir + velocidad1 > 500) {
                    System.out.println("valores demasiado superiores, introduzca de nuevo");
                    System.out.println("Ataque de " + nombre1 + " : ");
                    ataque1_sin_dividir = in.nextInt();


                    while (ataque1_sin_dividir > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        ataque1_sin_dividir = in.nextInt();
                    }
                    ataque1 = ataque1_sin_dividir / 2.1;
                    decimales.format(ataque1);
                    System.out.println("Defensa de " + nombre1 + " : ");

                    defensa1_sin_dividir = in.nextInt();
                    while (defensa1_sin_dividir > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        defensa1_sin_dividir = in.nextInt();
                    }
                    defensa1 = defensa1_sin_dividir / 1.5;

                    decimales.format(defensa1);
                    System.out.println("Velocidad de " + nombre1 + " : ");
                    velocidad1 = in.nextInt();
                    while (velocidad1 > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        velocidad1 = in.nextInt();
                    }
                    decimales.format(velocidad1);
                    System.out.println("Vida de " + nombre1 + " :");
                    vida1 = in.nextInt();
                    while (vida1 > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        vida1 = in.nextInt()*1.2;
                    }
                    decimales.format(vida1);
                }
                //JUGADOR DOS
                System.out.println("Introduce el nombre del jugador dos");
                basura= in.nextLine();
                nombre2 = in.nextLine();

                System.out.println("Introduce los atributos de "+nombre2 +", un atributo no puede tener mas de 150 puntos, el total de los atributos no puede ser superior a 500");





                System.out.println("Ataque de " + nombre2 + " : ");
                double ataque2_sin_dividir = in.nextInt();


                while (ataque2_sin_dividir > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    ataque2_sin_dividir = in.nextInt();
                }
                ataque2 = ataque1_sin_dividir / 2.1;
                decimales.format(ataque1);
                System.out.println("Defensa de " + nombre2 + " : ");

                double defensa2_sin_dividir = in.nextInt();
                while (defensa2_sin_dividir > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    defensa2_sin_dividir = in.nextInt();
                }
                defensa2 = defensa2_sin_dividir / 1.5;

                decimales.format(defensa2);
                System.out.println("Velocidad de " + nombre2 + " : ");
                velocidad2 = in.nextInt();
                while (velocidad2 > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    velocidad2 = in.nextInt();
                }
                decimales.format(velocidad2);
                System.out.println("Vida de " + nombre2 + " :");
                vida2 = in.nextInt();
                while (vida2 > 200) {
                    System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                    vida2 = in.nextInt()*1.2;
                }
                decimales.format(vida2);

                int probabiliad_critico2 = 20;
                regeneracion2 = vida2 / 15;
                while (vida2 + ataque2_sin_dividir + defensa2_sin_dividir + velocidad2 > 501) {
                    System.out.println("valores demasiado superiores, introduzca de nuevo");
                    System.out.println("Ataque de " + nombre2 + " : ");
                    ataque1_sin_dividir = in.nextInt();


                    while (ataque2_sin_dividir > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        ataque2_sin_dividir = in.nextInt();
                    }
                    ataque2 = ataque2_sin_dividir /2.1;
                    decimales.format(ataque2);
                    System.out.println("Defensa de " + nombre2 + " : ");

                    defensa2_sin_dividir = in.nextInt();
                    while (defensa2_sin_dividir > 200) {
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
                    while (vida2 > 200) {
                        System.out.println("el atributo es demasiado alto, introducelo de nuevo");
                        vida2 = in.nextInt()*1.2;
                    }
                    decimales.format(vida2);

                    //ESTADISTICAS
                }


        }
        if (eleccion == 1) {
            System.out.println("***ELIGE EL SEGUNDO JUGADOR***");
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
            switch (eleccion_personaje) {

                case 1:
                    System.out.println("HAS ELEGIDO A BABOBUBA");
                    System.out.println("BABOBUBA (ALEJANDRO) ES UN GRAN JUGADOR DE FUTBOL, CON UNOS GEMELOS PRIVILEGIADOS TIENE " +
                            "UNA GRAN VELOCIDAD, PERO ES PRACTICAMENTE INOFENSIVO");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_alejandro);
                    System.out.println("ATAQUE " + ataque_alejandro);
                    System.out.println("DEFENSA " + defensa_alejandro);
                    System.out.println("VELOCIDAD " + velocidad_alejandro);
                    System.out.println("REGENERACION " + vida_alejandro / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_alejandro);
                    ataque2 = (ataque_alejandro / 2);
                    defensa2 = (defensa_alejandro / 1.7);
                    velocidad2 = (velocidad_alejandro);
                    vida2 = (vida_alejandro);
                    porcentaje = probabilidad_critico_alejandro;
                    regeneracion2 = vida_alejandro / 10;
                    nombre2 = "BABOBUBA";


                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. OJOS VERDES");
                    System.out.println("LOS OJOS VERDES DE BABOBUBA PUEDEN DISTRAER AL CONTRICANTE, HAY UNA POSIBILIDAD DEL 50% DE QUE EL RIVAL NO PUEDA MOVERSE, 3 TURNOS DE RECARGA");
                    System.out.println("2. ENTRENAMIENTO");
                    System.out.println("BABOBUBA HA IDO MUCHO A ENTRENAR Y SUS GEMELOS HAN CRECIDO, AUMENTA SU VELOCIDAD A 150 PERMANENTEMENTE(SOLO SE PUEDE USAR UNA VEZ )");
                    System.out.println("3. LIGAR CON LA PRIMA DE SUS AMIGOS");
                    System.out.println("BABOBUBA SE BESA CON LA PRIMA DEL ESQUIROL, POR CADA BESO RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA) ");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:

                        case 2:
                            velocidad_alejandro = 150;
                        case 3:
                            if (recarga_habilidad1 > 3) {
                                vida_alejandro = vida_alejandro + 40;
                            }


                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }
                    break;
                case 2:
                    System.out.println("HAS ELEGIDO A CABEZON");
                    System.out.println("EL CABEZON (ELOY) ES UN CHICO DE PUEBLO CON UN DIAMETRO CRANEAL DESMESURADO, LO CUAL LE RESTA VELOCIDAD, PERO LO COMPENSA CON SU GRAN FUERZA DE MOZO ALBACETEÑO");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_eloy);
                    System.out.println("ATAQUE " + ataque_eloy);
                    System.out.println("DEFENSA " + defensa_eloy);
                    System.out.println("VELOCIDAD " + velocidad_eloy);
                    System.out.println("REGENERACION " + vida_eloy / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_eloy);

                    ataque2 = (ataque_eloy / 2);
                    defensa2 = (defensa_eloy / 1.7);
                    velocidad2 = (velocidad_eloy);
                    vida2 = (vida_eloy);
                    porcentaje = probabilidad_critico_eloy;
                    regeneracion2 = vida_eloy / 10;
                    nombre2 = "CABEZON";


                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. CABEZAZO");
                    System.out.println("EL CABEZON USA SU CABEZA PARA ATACAR, AUMENTANDO SU ATAQUE POR 1,5 EN SU PROXIMO TURNO(2 TURNOS DE RECARGA)");
                    System.out.println("2. FIESTA DE PUEBLO");
                    System.out.println("EN EL PUEBLO DE EL CABEZON SE RUMOREA QUE EN LAS FIESTAS HAY UNA GRAN CANTIDAD DE PASTILLAS(Y NO DE LAS DE LA FARMACIA), AUMENTA SU VELOCIDAD AL MAXIMO");
                    System.out.println("3. HOMBRO FUERA");
                    System.out.println("EL CABEZON PUEDE SACARSE EL HOMBRO PARA DESPISTAR AL RIVAL, PERO NO PUEDE ATACAR CON LA MISMA FUERZA, 70% DE POSIBILIDAD DE EVITAR EL SIGUIENTE ATAQUE,-20 PUNTOS DE ATAQUE(SOLO SI EL CABEZON ES MAS VELOZ QUE SU RIVAL)");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 3:
                    System.out.println("HAS ELEGIDO A DOMI");
                    System.out.println("CON UN PELO QUE PARECE UN ARBUSTO , DOMI (ALEX) ES UN SER PECULIAR, CON MUCHAS MANIAS Y MUY MAJO, HERMANO DE GUSTAVO");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_alex);
                    System.out.println("ATAQUE " + ataque_alex);
                    System.out.println("DEFENSA " + defensa_alex);
                    System.out.println("VELOCIDAD " + velocidad_alex);
                    System.out.println("REGENERACION " + vida_alex / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_alex);

                    ataque2 = (ataque_alex / 2);
                    defensa2 = (defensa_alex / 1.7);
                    velocidad2 = (velocidad_alex);
                    vida2 = (vida_alex);
                    porcentaje = probabilidad_critico_alex;
                    regeneracion2 = vida_alex / 10;
                    nombre2 = "DOMI";

                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. IR A LA DERECHA");
                    System.out.println("DOMI SIEMPRE TIENE QUE IR EN UN ASIENTO DE LA DERECHA EN EL COCHE, LO CUAL DESQUICICIA A SUS RIVALES, LA DEFENSA DE SU RIVAL BAJA 30 PUNTOS(4 TURNOS DE RECARGA)");
                    System.out.println("2. JOSE CARLOS");
                    System.out.println("UN DIA EL CABEZON Y DOMI ADOPTARON A JOSE CARLOS, UNA BOTELLA DE RON DE 5 EUROS, CADA TRAGO DE ESE RON AUMENTA 20 PUNTOS DE ATAQUE, PERO BAJA 20 DE VIDA(2 TURNOS DE RECARGA)");
                    System.out.println("3. DEJARLE DE HABLAR");
                    System.out.println("'LO SIENTO, VOY A EMPEZAR MEDICINA' LE DIJERON A DOMI ANTES DE QUE LE DEJARAN DE HABLAR, CADA VEZ QUE SE ACUERDA, SU ATAQUE Y SU DEFENSA SUBEN 20 PUNTOS, PERO SU VELOCIDAD Y VIDA BAJAN 20 (2 TURNOS DE RECARGA)");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 4:
                    System.out.println("HAS ELEGIDO AL PARSE");
                    System.out.println("COLOMBIANO DE NACIMIENTO, EL PARSE (SIMON) TIENE UNA PERILLA CON HABILIDADES ESPECIALES, ¡LA CUAL LE PERMITE ESCOGER 3 HABILIDADES");

                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_parse);
                    System.out.println("ATAQUE " + ataque_parse);
                    System.out.println("DEFENSA " + defensa_parse);
                    System.out.println("VELOCIDAD " + velocidad_parse);
                    System.out.println("REGENERACION " + vida_parse / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_parse);

                    ataque2 = (ataque_parse / 2);
                    defensa2 = (defensa_parse / 1.7);
                    velocidad2 = (velocidad_parse);
                    vida2 = (vida_parse);
                    porcentaje = probabilidad_critico_parse;
                    regeneracion2 = vida_parse / 10;
                    nombre2 = "EL PARSE";


                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 3 HABILIDADES");
                    System.out.println("1. SUPERPERILLA");
                    System.out.println("LA PERILLA DEL PARSE ES TAN FRONDOSA QUE AL RIVAL LE CUESTA ATRAVESARLA, AUMENTA 30 PUNTOS LA DEFENSA(3 TURNOS DE RECARGA)");
                    System.out.println("2. PORRO");
                    System.out.println("EN LOS VIEJOS TIEMPOS, GUSTAVO Y EL PARSE LE DABAN A LA LECHUGA DEL DIABLO, CUANDO SE FUMA SE AUMENTA SU POSIBILIDAD DE CRITICO A 33%, PERO SE REDUCE SU VELOCIDAD 30 PUNTOS");
                    System.out.println("3. LIGAR CON LAS PRIMAS DE SUS AMIGOS");
                    System.out.println("EL PARSE SE BESA CON LA PRIMA DE DOMI Y GUSTAVO, POR CADA BESO RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA) ");
                    System.out.println("4. MECANICO");
                    System.out.println("EL PARSE ESTUDIA PARA SER MECANICO, Y HA INVENTADO UN APARATO QUE REGENERA SU VIDA, POR CADA TURNO QUE PASA RECUPERA 8 PUNTOS DE VIDA ");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 5:
                    System.out.println("HAS ELEGIDO A GUSTAVO");
                    System.out.println("A SUS 16 AÑOS DE EDAD, PARECE EL MAS ADULTO DEL GRUPO. HERMANO DE DOMI. ES EL REY DE LOS GUSTAVOS,AUNQUE REALMENTE SE LLAMA LUIS");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_gustavo);
                    System.out.println("ATAQUE " + ataque_gustavo);
                    System.out.println("DEFENSA " + defensa_gustavo);
                    System.out.println("VELOCIDAD " + velocidad_gustavo);
                    System.out.println("REGENERACION " + vida_gustavo / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_gustavo);


                    ataque2 = (ataque_gustavo / 2);
                    defensa2 = (defensa_gustavo / 1.7);
                    velocidad2 = (velocidad_gustavo);
                    vida2 = (vida_gustavo);
                    porcentaje = probabilidad_critico_gustavo;
                    regeneracion2 = vida_gustavo / 10;
                    nombre2 = "GUSTAVO";
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. RAPARSE");
                    System.out.println("UN DIA GUSTAVO DIJO 'RAPARME' Y EN LOS BANCOS LE CORTAMOS EL PELO, CON SU NUEVO CORTE, GUSTAVO OBTIENE 30 PUNTOS MAS DE VELOCIDAD(SOLO SE PUEDE USAR UNA VEZ)");
                    System.out.println("2. PELUSA");
                    System.out.println("UN DIA GUSTAVO SE MIRO SU OMBLIGO, DEL CUAL SACÓ UNA PELUSA, ESTA PELUSA INFLINGE UN GOLPE DE 150 PUNTOS(4 TURNOS DE RECARGA)");
                    System.out.println("3. PROBLEMA DE HIPERTROFIA");
                    System.out.println("GUSTAVO ESTÁ EXCESIVAMENTE FUERTE, LO CUAL LE SUBE EL ATAQUE Y LA DEFENSA 18 PUNTOS, PERO LE BAJA LA VELOIDAD 35 PUNTOS(SOLO SE PUEDE USAR UNA VEZ)");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 6:
                    System.out.println("HAS ELEGIDO AL NADADOR");
                    System.out.println("TODO UN COMPETIDOR AL VOLANTE, SE BEBE LOS CHUPITOS COMO LE ECHA GASOLINA AL COCHE");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_izan);
                    System.out.println("ATAQUE " + ataque_izan);
                    System.out.println("DEFENSA " + defensa_izan);
                    System.out.println("VELOCIDAD " + velocidad_izan);
                    System.out.println("REGENERACION " + vida_izan / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_izan);
                    nombre2 = "EL NADADOR";

                    ataque2 = (ataque_izan / 2);
                    defensa2 = (defensa_izan / 1.7);
                    velocidad2 = (velocidad_izan);
                    vida2 = (vida_izan);
                    porcentaje = probabilidad_critico_izan;
                    regeneracion2 = vida_izan / 10;
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. CAMINO A BARCELONA");
                    System.out.println("JUNTO A GUSTAVO, DOMI Y EL PARSE, UNA NOCHE APARENTEMENTE NORMAL EN EL ARENAL TERMINO SIENDO UN VIAJE EL EL COCHE DEL NADADOR A LA SAGRADA FAMILIA, A VELOCIDAD MEDIA DE 187KM/H, AUMENTA LA VELOCIDAD AL MAXIMO ");
                    System.out.println("2. CONDUCCION TEMERARIA");
                    System.out.println("CON LA REALIDAD ALTERADA, EL NADADOR ATROPELLA A SU RIVAL CREYENDO QUE ESTÁ EN LOS COCHE DE CHOQUE, EL GOLPE INFLINGE 105 PUNTOS(3 TURNOS DE RECARGA)");
                    System.out.println("3. LIGAR CON LA MEJOR AMIGA DE SUS AMIGOS");
                    System.out.println("MIENTRAS DOMI ESTABA EN SU PUEBLO, EL NADADOR SE LIO CON LA (AHORA EX)MEJOR AMIGA DE DOMI, CADA BESO DE ELLA RECUPERA 40 PUNTOS DE VIDA (3 TURNOS DE RECARGA)");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 7:
                    System.out.println("HAS ELEGIDO A EL ESQUIROL");
                    System.out.println("EL ESQUIROL (JOAN) JUGABA EN EL CLUB WATERPOLO CASTELLO, HASTA QUE EL CHAQUETERO SE PASÓ AL GODELLA, POR LO DEMAS UN TIO DE 10");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_joan);
                    System.out.println("ATAQUE " + ataque_joan);
                    System.out.println("DEFENSA " + defensa_joan);
                    System.out.println("VELOCIDAD " + velocidad_joan);
                    System.out.println("REGENERACION " + vida_joan / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_joan);

                    ataque2 = (ataque_eloy / 2);
                    defensa2 = (defensa_eloy / 1.7);
                    velocidad2 = (velocidad_eloy);
                    vida2 = (vida_eloy);
                    porcentaje = probabilidad_critico_eloy;
                    regeneracion2 = vida_eloy / 10;
                    nombre2 = "EL ESQUIROL";


                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. ENCANTO");
                    System.out.println("EL ESQUIROL TIENE UN ATRACTIVO INNEGABLE, EL CUAL PUEDE DISTRAER A SU RIVAL, TIENE UN 50% DE QUE SU RIVAL NO PUEDA MOVERSE EL SIGUIENTE TURNO");
                    System.out.println("2. BIOQUIMICA");
                    System.out.println("EN UNA PRACTICA DE LABORATORIA A DESCUBIERTO UN COMPUESTO QUE ES EFECTIVO PARA TODO. AUMENTA 30 PUNTOS EN EL ATRIBUTO QUE SE ELIJA (SOLO SE PUEDE USAR UNA VEZ)");
                    System.out.println("3. SER EL MAS PEQUEÑO");
                    System.out.println("EL ESQUIROL ES DE LO MAS PEQUEÑOS DEL GRUPO, PERO SIEMPRE SE HA DICHO QUE LOS ULTIMOS ALGUN DIA SERÁN LOS PRIMEROS, ACTUA SIEMPRE EL PRIMERO");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

                case 8:
                    System.out.println("HAS ELEGIDO AL RUMANO");
                    System.out.println("MAS FRIO QUE UNA NOCHE EN EL CASTILLO DE SU ABUELO EL CONDE DRACULA, EL RUMANO LLEGO A ESPAÑA HACE AÑOS, VIGILA QUE TUS TUBERIAS NO SEAN DE COBRE");
                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("E S T A D I S T I C A S ");
                    System.out.println("VIDA " + vida_joan);
                    System.out.println("ATAQUE " + ataque_rumano);
                    System.out.println("DEFENSA " + defensa_rumano);
                    System.out.println("VELOCIDAD " + velocidad_rumano);
                    System.out.println("REGENERACION " + vida_rumano / 15);
                    System.out.println("PROBABILIDAD DE CRITICO " + probabilidad_critico_rumano);

                    ataque2 = (ataque_rumano / 2);
                    defensa2 = (defensa_rumano / 1.7);
                    velocidad2 = (velocidad_rumano);
                    vida2 = (vida_rumano);
                    porcentaje = probabilidad_critico_rumano;
                    regeneracion2 = vida_rumano / 10;
                    nombre2 = "RUMANO";

                    System.out.println(".........................................................................................................................................................................................................................");
                    System.out.println("H A B I L I D A D E S");
                    System.out.println("TAN SOLO PUEDES ESCOGER 2 HABILIDADES");
                    System.out.println("1. ROBAR COBRE");
                    System.out.println("EL RUMANO SE PAGA LA UNIVERSIDAD A BASE DE VENDER COBRE, EL CUAL ROBA A SUS RIVALES. LE ROBA 30 PUNTOS DE VIDA A SU RIVAL Y RESTAURA CON ELLOS SU VIDA(3 TURNOS DE RECARGA)");
                    System.out.println("2. LIGAR CON LAS PRIMAS DE SUS AMIGOS");
                    System.out.println("EL RUMANO TIENE UNA RELACION DE 3 AÑOS CON LA PRIMA DE BABOBUBA, CADA BESO RECUPERA 40 PUNTOS DE VIDA");
                    System.out.println("3. VER ILLOJUAN");
                    System.out.println("EL RUMANO ES UN GRAN FAN DEL STREAMER ILLOJUAN, CUANDO SE PASA SU TURNO VIENDO SI STREAM, AUMENTA 20 PUNTOS SU ATAQUE, DEFENSA Y VELOCIDAD(4 TURNOS DE RECARGA)");
                    eleccion1_jugador2 = in.nextInt();
                    eleccion2_jugador2 = in.nextInt();
                    switch (eleccion1_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    switch (eleccion2_jugador2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }

                    break;

            }
        }
            System.out.println(".........................................................................................................................................................................................................................");
            System.out.println("ATRIBUTOS DE " + nombre1);
            System.out.println("VIDA : " + vida1);
            System.out.println("ATAQUE : " + ataque1);
            System.out.println("DEFENSA : " + defensa1);
            System.out.println("VELOCIDAD : " + velocidad1);
            System.out.println("PROBABILIDAD DE CRÍTICO : " + porcentaje + "%");
            System.out.println("REGENERACION : " + regeneracion1);
            System.out.println(".........................................................................................................................................................................................................................");
            System.out.println("ATRIBUTOS DE " + nombre2);
            System.out.println("VIDA : " + vida2);
            System.out.println("ATAQUE : " + ataque2);
            System.out.println("DEFENSA : " + defensa2);
            System.out.println("VELOCIDAD : " + velocidad2);
            System.out.println("PROBABILIDAD DE CRÍTICO : " + porcentaje + "%");
            System.out.println("REGENERACION : " + regeneracion2);


            //NOMBRES


            //JUGADOR UNO


            int accion = 0;
            double golpe = 0;
            int ronda = 0;
            boolean ganador = true;
            boolean vivo = true;
            vida1=vida1+defensa1/2;
            vida2=vida2+defensa2/2;
            ataque1=ataque1+velocidad1/2;
            ataque2=ataque2+velocidad2/2;
            //RONDA
            System.out.println(".........................................................................................................................................................................................................................");
            while (vivo == true) {
                ronda = ronda++;

                if (velocidad1 > velocidad2) {
                    ronda++;
                    System.out.println("RONDA " + ronda);
                    System.out.println("¿Que quiere hacer " + nombre1 + " ?");
                    System.out.println("1. ATAQUE");
                    System.out.println("2. REGENERACION");
                    accion = in.nextInt();
                    switch (accion) {
                        case 1:
                            int numero_critico = pof.nextInt(5);
                            int numero_critico2 = pof.nextInt(5);
                            golpe = ataque1 - (defensa2 % ataque1);
                            vida2 = vida2 - golpe;
                            if (numero_critico == numero_critico2) {
                                golpe = golpe * 2;
                                System.out.println("GOLPE CRITICO!!");
                            }
                            if (vida2 <= 0) {
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
                    if (vivo == true) {
                        System.out.println("");

                        System.out.println("");
                        System.out.println("¿Que quiere hacer " + nombre2 + "?");
                        System.out.println("1. ATAQUE");
                        System.out.println("2. REGENERACION");
                        accion = in.nextInt();
                        switch (accion) {
                            case 1:
                                int numero_critico = pof.nextInt(5);
                                int numero_critico2 = pof.nextInt(5);
                                golpe = ataque2 - (defensa1% ataque2);
                                if (numero_critico == numero_critico2) {
                                    golpe = golpe * 2;
                                    System.out.println("GOLPE CRITICO!!");
                                }
                                vida1 = vida1 - golpe;
                                System.out.println("Daño inflingido : " + golpe);
                                System.out.println("Vida jugador 1 : " + vida1);
                                if (vida1 <= 0) {
                                    vivo = false;
                                }
                                break;


                            case 2:
                                vida2 = vida2 + regeneracion2;
                                System.out.println("Vida jugador 2: " + vida1);
                                break;
                        }


                    }


                } if(velocidad1<=velocidad2) {
                    ronda++;
                    System.out.println("RONDA " + ronda);
                    System.out.println("¿Que quiere hacer " + nombre2 + "?");
                    System.out.println("1. ATAQUE");
                    System.out.println("2. REGENERACION");
                    accion = in.nextInt();
                    switch (accion) {
                        case 1:
                            int numero_critico = pof.nextInt(5);
                            int numero_critico2 = pof.nextInt(5);
                            golpe = ataque2 - (defensa1 % ataque2);
                            if (numero_critico == numero_critico2) {
                                golpe = golpe * 2;
                                System.out.println("GOLPE CRITICO!!");
                            }
                            vida1 = vida1 - golpe;
                            System.out.println("Daño inflingido : " + golpe);
                            System.out.println("Vida jugador 2 : " + vida1);
                            if (vida1 <= 0) {
                                vivo = false;
                            }
                            break;

                        case 2:
                            vida2 = vida2 + regeneracion2;
                            System.out.println("Vida jugador 2: " + vida2);
                            break;
                    }
                    if (vivo == true) {

                        System.out.println("");

                        System.out.println("");
                        System.out.println("¿Que quiere hacer " + nombre1 + "?");
                        System.out.println("1. ATAQUE");
                        System.out.println("2. REGENERACION");
                        accion = in.nextInt();
                        switch (accion) {
                            case 1:
                                int numero_critico = pof.nextInt(5);
                                int numero_critico2 = pof.nextInt(5);
                                golpe = ataque1 - (defensa2 % ataque1);
                                if (numero_critico == numero_critico2) {
                                    golpe = golpe * 2;
                                    System.out.println("GOLPE CRITICO!!");
                                }
                                vida2 = vida2 - golpe;
                                System.out.println("Daño inflingido : " + golpe);
                                System.out.println("Vida jugador 1 : " + vida1);
                                if (vida2 <= 0) {
                                    vivo = false;
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
            }
            if (vida2 < 0) {
                ganador_jugador1 = true;
            } if (vida1<0) {
                ganador_jugador2 = true;
            }
            if (ganador_jugador1 == true) {
                System.out.println("****EL GANADOR DEL COMBATE ES  " +nombre1+"****");
            }
            if (ganador_jugador2==true) {
                System.out.println("****EL GANDOR DEL COMBATE ES "+nombre2+"****");
            }
    }
 }
