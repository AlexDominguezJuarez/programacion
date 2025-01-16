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
        if ((router>6)||(router<0)){
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
        int habitacion=in.nextInt();
        comprobacion=comprobadorHabitacion(habitacion);
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
        habitacion--;
        piso--;

        int potenciaWifiX=potenciaWifi;
        int potenciaWifiY=potenciaWifi;
        int pisoX=piso;
        int pisoY=piso;
        int contadorAbajo=0;
        int contadorArriba=0;
        int contadorDerecha=0;
        int contadorIzquierda=0;


        int [][] matrizWifi=new int [12][5];
        matrizWifi[piso][habitacion]=potenciaWifi;
        int numeroDeNumeros= matrizWifi.length;

        while ((potenciaWifiY>0)&&(piso+contadorArriba<=12)){
            potenciaWifiY--;
            contadorArriba++;
            if (contadorArriba+piso==12){
                contadorArriba--;
            }
            matrizWifi[piso+contadorArriba][habitacion]=potenciaWifiY;

        }
        potenciaWifiY=potenciaWifi;

        potenciaWifiY=potenciaWifi;
        while ((potenciaWifiY>0)&&(piso+contadorAbajo>0)){
            contadorAbajo--;
            potenciaWifiY--;
            matrizWifi[piso+contadorAbajo][habitacion]=potenciaWifiY;

        }

        while ((potenciaWifiX>0)&&(contadorIzquierda+habitacion>0)){
            potenciaWifiX--;
            contadorIzquierda--;

            matrizWifi[piso][habitacion+contadorIzquierda]=potenciaWifiX;

        }
        potenciaWifiX=potenciaWifi;

        while ((potenciaWifiX>0)&&(contadorDerecha+habitacion<5)){
            potenciaWifiX--;
            contadorDerecha++;
            if (contadorDerecha+habitacion==5){
                contadorDerecha--;
            }

            matrizWifi[piso][habitacion+contadorDerecha]=potenciaWifiX;
        }


         contadorAbajo=0;
         contadorArriba=0;
         contadorDerecha=0;
         contadorIzquierda=0;

         int potenciaWifiXY=potenciaWifi;
        while (comprobacion==true){

            contadorAbajo--;
            contadorIzquierda--;

            if (contadorAbajo+piso<0){
                contadorAbajo++;
            }
            if (contadorIzquierda+habitacion<0){
                contadorIzquierda++;
            }
            if (matrizWifi[piso + contadorAbajo][habitacion + contadorIzquierda] == 0) {
                comprobacion=false;

            }else {
                potenciaWifiXY=potenciaWifiXY-2;


                matrizWifi[piso+contadorAbajo][habitacion+contadorIzquierda]=potenciaWifiXY;

                if (potenciaWifiXY<1){
                    comprobacion=false;
                }
            }
        }
        comprobacion=true;
        contadorAbajo=0;
        contadorArriba=0;
        contadorDerecha=0;
        contadorIzquierda=0;


        while (comprobacion==true){

            contadorArriba++;
            contadorIzquierda--;

            if (contadorArriba+piso<0){
                contadorArriba--;
            }
            if (contadorIzquierda+habitacion<0){
                contadorIzquierda++;
            }
            if (matrizWifi[piso + contadorArriba][habitacion + contadorIzquierda] == 0) {
                comprobacion=false;

            }else {
                potenciaWifiXY=potenciaWifiXY-2;


                matrizWifi[piso+contadorArriba][habitacion+contadorIzquierda]=potenciaWifiXY;
                if (potenciaWifiXY<1){
                    comprobacion=false;
                }
            }
        }
        comprobacion=true;
        contadorAbajo=0;
        contadorArriba=0;
        contadorDerecha=0;
        contadorIzquierda=0;

        while (comprobacion==true){

            contadorAbajo--;
            contadorDerecha++;

            if (contadorAbajo+piso<0){
                contadorAbajo++;
            }
            if (contadorDerecha+habitacion>12){
                contadorDerecha--;
            }
            if (matrizWifi[piso + contadorAbajo][habitacion + contadorDerecha] == 0) {
                comprobacion=false;

            }else {
                potenciaWifiXY=potenciaWifiXY-2;


                matrizWifi[piso+contadorAbajo][habitacion+contadorDerecha]=potenciaWifiXY;

                if (potenciaWifiXY<1){

                    comprobacion=false;
                }
            }
        }
        comprobacion=true;
        contadorAbajo=0;
        contadorArriba=0;
        contadorDerecha=0;
        contadorIzquierda=0;

        while (comprobacion==true){

            contadorArriba++;
            contadorDerecha++;

            if (contadorAbajo+piso<0){
                contadorAbajo--;
            }
            if (contadorIzquierda+habitacion<0){
                contadorIzquierda--;
            }
            if (matrizWifi[piso + contadorArriba][habitacion + contadorDerecha] == 0) {
                comprobacion=false;

            }else {
                potenciaWifiXY=potenciaWifiXY-2;


                matrizWifi[piso+contadorArriba][habitacion+contadorDerecha]=potenciaWifiXY;

                if (potenciaWifiXY<1){
                    comprobacion=false;
                }
            }
        }




        imprimirMatriz(matrizWifi);







    }
}