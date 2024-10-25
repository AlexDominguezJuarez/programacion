package condicionales;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        System.out.println("introduce el año en el que estás ");
        Scanner in= new Scanner(System.in);
        int year=in.nextInt();
        System.out.println("introduce el mes del cual quieras saber cuantos dias tiene");
        String mes= in.next();
        switch (mes ){
        case "enero":
            System.out.println("el mes tiene 31 dias");
            return;
        case "marzo":
            System.out.println("el mes tiene 31 dias");
            return;
        case "mayo":
            System.out.println("el mes tiene 31 dias");
            return;
        case "julio":
            System.out.println("el mes tiene 31 dias");
            return;
        case "agosto":
            System.out.println("el mes tiene 31 dias");
            return;
        case "octubre":
            System.out.println("el mes tiene 31 dias");
            return;
        case "diciembre":
            System.out.println("el mes tiene 31 dias");
            return;
        case "abril":
           System.out.println("el mes tiene 30 dias");
            return;
        case "junio":
            System.out.println("el mes tiene 30 dias");
            return;
        case "septiembre":
            System.out.println("el mes tiene 30 dias");
            return;
        case "noviembre":
            System.out.println("el mes tiene 30 dias");
            return;
        case "febrero":
            if ((year == 2000) || (year == 2004)||(year == 2008)||(year == 2012)||(year == 2016)||(year == 2020||(year == 2024)||(year == 2028)||(year == 2032)||(year == 2036)||(year == 2040)||(year == 2044)||(year == 2048)||(year == 2052)||(year == 2056)||(year == 2060)||(year == 2064)||(year == 2068)||(year == 2072)||(year == 2076)||(year == 2080)||(year == 2084)||(year == 2088)||(year == 2092)||(year == 2096))){
                System.out.println("el mes tiene 29 dias");
                return;
            } else {
                System.out.println("el mes tiene 28 dias");
            }
        }
    }
}