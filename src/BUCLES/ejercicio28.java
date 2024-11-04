package BUCLES;

import java.util.Random;
import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        System.out.println("introduce tu numero de boleto");
        Scanner in=new Scanner(System.in);
        Random Random= new Random();
        int numero_premiado_primero= Random.nextInt(9);
        int numero_premiado_segundo= Random.nextInt(9);
        int numero_premiado_tercero= Random.nextInt(9);
        int numero_premiado_cuarto= Random.nextInt(9);
        int numero_premiado_quinto= Random.nextInt(9);
        boolean acierto=false;
        int primer_numero=in.nextInt();
        if (primer_numero==numero_premiado_primero){
            System.out.println("has acertado el primer numero");

        }else{
            System.out.println("has errado el primer numero");
        }
        int segundo_numero=in.nextInt();
        if (segundo_numero==numero_premiado_segundo){
            System.out.println("has acertado el segundo numero");
        }else{
            System.out.println("has errado el segundo numero");
        }

        int tercer_numero=in.nextInt();
        if (tercer_numero==numero_premiado_tercero){
            System.out.println("has acertado el tercer numero");
        }else{
            System.out.println("has errado el tercer numero");

        }
        int cuarto_numero=in.nextInt();
        if (cuarto_numero==numero_premiado_cuarto){
            System.out.println("has acertado el primer numero");
        }else{
            System.out.println("has errado el primer numero");
        }

        int quinto_numero=in.nextInt();
        if (quinto_numero==numero_premiado_quinto){
            System.out.println("has acertado el primer numero");
        }else{
            System.out.println("has errado el primer numero");
        }


    }
}
