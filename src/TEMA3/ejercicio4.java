package TEMA3;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class ejercicio4 {
    public static void showMenu(int eleccion){
        Scanner in=new Scanner(System.in);

        double dinero;
        double euro=0;
        double dolar=0;
        switch (eleccion){

            case 1:
                System.out.println("DE EUROS A DOLARES");
                System.out.println("INTRODUCE LA CANTIDAD DE DINERO A COVERTIR");
                dinero=in.nextInt();
                dolar= (dinero *1.05);
                System.out.println("SON "+dolar+" DOLARES");
                break;





            case 2:
                System.out.println("DE DOLARES A EUROS");
                System.out.println("INTRODUCE LA CANTIDAD DE DINERO A COVERTIR");
                dinero=in.nextInt();
                euro=(dinero*0.96);
                System.out.println("SON "+euro+" EUROS");
                break;



        }
    }

    public static void main(String[] args) {
        System.out.println("CONVERTIDOR DE EUROS A DOLARES Y DE DOLARES A EUROS");
        System.out.println("1. DE EUROS A DOLARES");
        System.out.println("2, DE DOLARES A EUROS");
        Scanner in=new Scanner(System.in);
        int eleccion=in.nextInt();
        while (eleccion>2 | eleccion<0){
            System.out.println("OPCION INCORRECTA, ELIJA DE NUEVO");
            eleccion=in.nextInt();

        }
        System.out.println("-------------------------------------------------------");


        showMenu(eleccion);
    }

}