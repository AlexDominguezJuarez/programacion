package TEMA3;

import java.util.Scanner;

public class caesarCifrer {


    public static char switchMinusculaEncriptar(char letra){
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
    public static char letraMayuscula(char letraMinuscula){
        return switchMinusculaEncriptar();
    }


    public static char switchMinusculaDesencriptar(char letra){
        switch (letra){
            case 'b':
                letra='a';
                break;
            case 'c':
                letra='b';

                break;
            case 'd':
                letra='c';

                break;
            case 'e':
                letra='d';

                break;
            case 'f':
                letra='e';

                break;
            case 'g':
                letra='f';

                break;
            case 'h':
                letra='g';

                break;
            case 'i':
                letra='h';

                break;
            case 'j':
                letra='i';

                break;
            case 'k':
                letra='j';

                break;
            case 'l':
                letra='k';

                break;
            case 'm':
                letra='l';

                break;
            case 'n':
                letra='m';

                break;
            case 'o':
                letra='n';

                break;
            case 'p':
                letra='n';

                break;
            case 'q':
                letra='p';

                break;
            case 'r':
                letra='q';

                break;
            case 's':
                letra='r';

                break;
            case 't':
                letra='s';

                break;
            case 'u':
                letra='t';

                break;
            case 'v':
                letra='u';

                break;
            case 'w':
                letra='v';

                break;
            case 'x':
                letra='w';

                break;
            case 'y':
                letra='x';

                break;

            case 'z':
                letra='y';

                break;
            case 'a':
                letra='z';

                break;

        }return letra;

    }

    public static char switchMayuscula(char letra){
        letra=switchMinusculaEncriptar(letra);
        String palabra=String.valueOf(letra);
        palabra.toUpperCase();
        letra=palabra.charAt(0);
        return letra;

    }

    public static char[] encriptacion(String cadena){
        char[] cadenaEncriptada=new char[cadena.length()];
        for (int i=0;i<cadena.length();i++){
            char letra=cadena.charAt(i);
            letra=switchMinusculaEncriptar(letra);
            cadenaEncriptada[i]=letra;


        }
        return cadenaEncriptada;
    }
    public static char[] desencriptacion(String cadenaEncriptada){
        char[] cadenaDesncriptada=new char[cadenaEncriptada.length()];
        for (int i=0;i<cadenaEncriptada.length();i++){
            char letra=cadenaEncriptada.charAt(i);
            letra=switchMinusculaEncriptar(letra);
            cadenaDesncriptada[i]=letra;


        }
        return cadenaDesncriptada;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("PULSE 1 PARA ENCRIPTAR UNA PALARA\nPULSE 2 PARA DESCENCRIPTAR UNA PALABRA");
        int eleccion=in.nextInt();
        System.out.println("INTRODUZCA LA PALABRA A ENCRIPTAR");
        String basura=in.nextLine();
        String cadena=in.nextLine();
        switch (eleccion){
            case 1: char[] palabraEncriptada=encriptacion(cadena);
                System.out.println(palabraEncriptada);
                break;
            case 2:char[] palabraDesencriptada=desencriptacion(cadena);
            System.out.println(palabraDesencriptada);
                break;
        }




    }
}
