package TEMA3;

import java.util.Scanner;

public class RouterHabitacion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("SISTEMA DE INSTALACION DE ROUTER");
        System.out.println();
        System.out.println("¿EN QUE HABITACION QUIERE INSTALAR EL ROUTER? HAY HABITACIONES PARA ELEGIR DEL 1 AL 20");
        int numeroHabitacion=in.nextInt()-1;
        while ((numeroHabitacion<0)||(numeroHabitacion>20)){
            System.out.println("HABITACION NO DISPONIBLE, INTRODUZCA LA HABITACION DE NUEVO");
            numeroHabitacion=in.nextInt();
        }
        System.out.println("ELIJA LA POTENCIA DE LA CONEXION DE LA RED (DEL 1 AL 6)");
        int potenciaDeWifi=in.nextInt();

        while (potenciaDeWifi<1 && potenciaDeWifi>6){
            System.out.println("POTENCIA NO VALIDA, INTRODUZCALA DE NUEVO");
            potenciaDeWifi=in.nextInt();
        }
        int numeroHabitacion2=numeroHabitacion;
        int [] hotel=new int[20];
        hotel[numeroHabitacion]=potenciaDeWifi;
        int numeroDePotenciaWifi=potenciaDeWifi;


        while ((potenciaDeWifi>0)&&(numeroHabitacion!=19)){
            potenciaDeWifi--;
            numeroHabitacion++;
            hotel[numeroHabitacion]=potenciaDeWifi;
        }

        potenciaDeWifi=numeroDePotenciaWifi;
        numeroHabitacion=numeroHabitacion2;

        while ((potenciaDeWifi>0)&&(numeroHabitacion!=0)){
            numeroHabitacion--;
            potenciaDeWifi--;
            hotel[numeroHabitacion]=potenciaDeWifi;
        }

        int habitacion=0;
        numeroHabitacion=0;
        while (habitacion<20){
            habitacion++;
            System.out.println(" POTENCIA HABITACION Nº"+habitacion+": "+hotel[numeroHabitacion]);
            numeroHabitacion++;
        }
    }
}