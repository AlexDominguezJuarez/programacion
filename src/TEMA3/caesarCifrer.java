package TEMA3;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class caesarCifrer {
    public static char[]palabraAEncriptar(){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la palabra a encriptar");
        String palabra=in.nextLine();
        char[]cadenaADevolver=new char[palabra.length()];
        for (int i=0;i<palabra.length();i++) {
            char letraCadena = palabra.charAt(i);

            cadenaADevolver[i]=switchMayuscula(letraCadena);
            cadenaADevolver[i]=switchMinuscula(letraCadena);
        }

        return cadenaADevolver;
    }

    public static String palabraADesencriptar(){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la palabra a desencriptar");
        String palabra=in.nextLine();

        return palabra;
    }
    public static char switchMinuscula(char letra){
        switch (letra){
            case 'A':
                letra='B';
                break;
            case 'B':
                letra='C';

                break;
            case 'C':
                letra='D';

                break;
            case 'D':
                letra='E';

                break;
            case 'E':
                letra='F';

                break;
            case 'F':
                letra='G';

                break;
            case 'G':
                letra='H';

                break;
            case 'H':
                letra='I';

                break;
            case 'I':
                letra='J';

                break;
            case 'J':
                letra='K';

                break;
            case 'K':
                letra='L';

                break;
            case 'L':
                letra='M';

                break;
            case 'M':
                letra='N';

                break;
            case 'N':
                letra='O';

                break;
            case 'O':
                letra='P';

                break;
            case 'P':
                letra='Q';

                break;
            case 'Q':
                letra='R';

                break;
            case 'R':
                letra='S';

                break;
            case 'S':
                letra='T';

                break;
            case 'T':
                letra='U';

                break;
            case 'U':
                letra='V';

                break;
            case 'V':
                letra='W';

                break;
            case 'W':
                letra='X';

                break;
            case 'X':
                letra='Y';

                break;

            case 'Y':
                letra='Z';

                break;
            case 'Z':
                letra='A';

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
        return "";
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Pulse 1 para encriptar una palabra\nPulse 2 para desencriptar una palabra");
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                char[]cadenaEncriptada=palabraAEncriptar();
                for (int i=0;i<cadenaEncriptada.length;i++){
                    System.out.print(cadenaEncriptada[i]);
                }


                break;

            case 2:

                break;
        }



    }
}
