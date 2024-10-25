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
        case "marzo":
        case "mayo":
        case "julio":
        case "agosto":
        case "octubre":
        case "diciembre":
            System.out.println("el mes tiene 31 dias");
            break;
        case "abril":
        case "junio":
        case "septiembre":
        case "noviembre":
            System.out.println("el mes tiene 30 dias");
            break;
        case "febrero":
            if ((year % 4== 0 && year%100!=0) || (year%400 ==0)){
                System.out.println("el mes tiene 29 dias");
                break;
            }else {
                System.out.println("el mes tiene  28 meeses");
                break;
            }
        }
    }
}