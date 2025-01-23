package TEMA3;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class caesarCifrer {
    public static String palabraAEncriptar(){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la palabra a encriptar");
        String palabra=in.nextLine();
        return palabra;
    }

    public static String palabraADesencriptar(){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la palabra a desencriptar");
        String palabra=in.nextLine();
        return palabra;
    }
    public static char switchMinuscula(char letra){
        switch (letra){
            case 'a':
                letra='b';
                break;
            case 'b':
                letra='c';

                break;
            case 'c':
                letra='d';

                break;
            case 'd':
                letra='e';

                break;
            case 'e':
                letra='f';

                break;
            case 'f':
                letra='g';

                break;
            case 'g':
                letra='h';

                break;
            case 'h':
                letra='i';

                break;
            case 'i':
                letra='j';

                break;
            case 'j':
                letra='k';

                break;
            case 'k':
                letra='l';

                break;
            case 'l':
                letra='m';

                break;
            case 'm':
                letra='n';

                break;
            case 'n':
                letra='o';

                break;
            case 'o':
                letra='p';

                break;
            case 'p':
                letra='q';

                break;
            case 'q':
                letra='q';

                break;
            case 'r':
                letra='s';

                break;
            case 's':
                letra='t';

                break;
            case 't':
                letra='u';

                break;
            case 'u':
                letra='v';

                break;
            case 'v':
                letra='w';

                break;
            case 'w':
                letra='x';

                break;
            case 'x':
                letra='y';

                break;

            case 'y':
                letra='z';

                break;
            case 'z':
                letra='a';

                break;

        }return letra;

    }
    public static char switchMayuscula(char letra){
        letra=switchMinuscula(letra);
        String palabra=String.valueOf(letra);
        palabra.toUpperCase();
        letra=palabra.charAt(0);
        return letra;

    }

    public static String encriptacion(String cadena){
        for (int i=0;i<cadena.length();i++){

        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Pulse 1 para encriptar una palabra\nPulse 2 para desencriptar una palabra");
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                String palabraEncripada=palabraAEncriptar();


                break;

            case 2:

                break;
        }



    }
}
