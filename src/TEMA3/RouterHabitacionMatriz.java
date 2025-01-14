package TEMA3;

import java.util.Scanner;

public class RouterHabitacionMatriz {

    public static void imprimirMatriz(int [][]matriz){
        int numeroDeNumeros= matriz.length;
        for (int i=0;i<numeroDeNumeros;i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }

    }

    public static boolean comprobadorPiso(int piso){
        if ((piso>12)||(piso<1)){
            return false;
        }return true;
    }

    public static boolean comprobadorHabitacion(int habitaciones){
        if ((habitaciones>5)||(habitaciones<0)){
            return false;
        }return true;
    }

    public static boolean comprobacionRouter(int router){
        if ((router>3)||(router<0)){
            return false;
        }return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("SISTEMA DE INSTALACION DE ROUTER");
        System.out.println();
        System.out.println("¿EN QUE PISO QUIERES INSTALAR EL ROUTER? (PLANTAS DEL 1 AL 12)");
        int piso=in.nextInt();
        boolean comprobacion=comprobadorPiso(piso);
        while (comprobacion==false){
            System.out.println("INTRODUZCA DE NUEVO EL PISO");
            piso=in.nextInt();
            comprobacion=comprobadorPiso(piso);
        }
        System.out.println();
        System.out.println("¿EN QUE HABITACION QUIERE INSTALAR EL ROUTER? HAY HABITACIONES PARA ELEGIR DEL 1 AL 5");
        int habitacion=in.nextInt()-1;

        while (comprobacion==false) {
            System.out.println("INTRODUZCA DE NUEVO LA HABITACION");
            habitacion=in.nextInt()-1;
            comprobacion=comprobadorHabitacion(habitacion);
        }
        System.out.println();
        System.out.println("¿QUE POTENCIA DEL WIFI DESEAS?(DEL 1-3)");
        int potenciaWifi=in.nextInt();
        comprobacion=comprobacionRouter(potenciaWifi);
        if (comprobacion==false){
            System.out.println("INTRODUZCA DE NUEVO LA POTENCIA");
            potenciaWifi=in.nextInt();
            comprobacion=comprobacionRouter(potenciaWifi);
        }

        int potenciaWifiX=potenciaWifi;
        int potenciaWifiY=potenciaWifi;
        int pisoX=piso;
        int pisoY=piso;
        int contadorAbajo=0;
        int contadorArriba=0;
        int contadorDerecha=0;
        int contadorIzquierda=0;


        int [][] matrizWifi=new int [12][5];
        matrizWifi[pisoX][habitacion]=potenciaWifi;
        int numeroDeNumeros= matrizWifi.length;
        while ((potenciaWifiX>0)&&(habitacion+contadorDerecha>5)&&(habitacion+contadorIzquierda>0)){
            potenciaWifiX--;

            contadorDerecha++;
            contadorIzquierda--;

            if (contadorDerecha<5){
                contadorDerecha--;
            }

            if (contadorIzquierda<0){
                contadorIzquierda++;
            }



            matrizWifi[piso][habitacion+contadorDerecha]=potenciaWifiX;
            matrizWifi[piso][habitacion+contadorIzquierda]=potenciaWifiX;


        }
        numeroDeNumeros=matrizWifi.length;
        while ((potenciaWifiY>0)&&(piso+contadorArriba>12)&&(piso+contadorAbajo>0)){
            potenciaWifiY--;
            contadorArriba++;
            contadorAbajo--;


            matrizWifi[piso+contadorArriba][habitacion]=potenciaWifiY;
            matrizWifi[piso+contadorAbajo][habitacion]=potenciaWifiY;


        }

        imprimirMatriz(matrizWifi);







    }
}