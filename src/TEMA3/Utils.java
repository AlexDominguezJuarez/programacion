package TEMA3;

import java.util.Date;
import java.util.Scanner;

public class Utils {
    public static double miles2kilometers(double distancia) {



        double kilometros = distancia * 1.0609;
        return kilometros;
    }

    public static double kilometers2miles(double distancia){
        double millas=distancia*0.621371;
        return millas;

    }

    public static double getTaxes(double cantidad, int porcentaje) {
        double dinero_final = (cantidad * porcentaje) / 100;
        dinero_final = Math.round(dinero_final * 100) / 100.0;
        return dinero_final;
    }

    public static double getNetPrice(double dinero, int porcentaje) {
        double dinero_final = dinero + ((dinero * porcentaje) / 100);
        dinero_final = Math.round(dinero_final * 100) / 100;
        return dinero_final;
    }

    public static double getCoins(double dinero) {
        int dinero_final = 0;
        dinero = dinero * 100;
        int euro2 = 0;
        int euro1 = 0;
        int cent50 = 0;
        int cent20 = 0;
        int cent10 = 0;
        int cent5 = 0;
        int cent2 = 0;
        int cent1 = 0;
        while (dinero > 200) {
            euro2++;
            dinero = dinero - 200;
        }
        dinero_final=euro2*10000000+dinero_final;

        while (dinero > 100) {

            euro1++;
            dinero = dinero - 100;

        }

        dinero_final=euro1*1000000+dinero_final;
        while (dinero > 50) {

            cent50++;
            dinero = dinero - 50;

        }
        dinero_final=cent50*100000+dinero_final;
        while (dinero > 20) {

            cent20++;
            dinero = dinero - 20;

        }

        dinero_final=cent20*10000+dinero_final;

        while (dinero > 10) {

            cent10++;
            dinero = dinero - 10;
        }
        dinero_final=cent10*1000+dinero_final;

        while (dinero < 5) {

            cent5++;
            dinero = dinero - 5;
        }
        dinero_final=cent10*100+dinero_final;

        while (dinero > 2) {

            cent2++;
            dinero = dinero - 2;
        }
        dinero_final=cent10*10+dinero_final;

        while (dinero > 1) {

            cent1++;
            dinero = dinero - 1;
        }
        dinero_final=cent10*1+dinero_final;

        return dinero_final;
    }

    public static String getNif(int dni) {
        String letra = "e";
        int resto = dni % 23;
        switch (resto) {
            case 0:
                letra = "T";
                break;

            case 1:
                letra = "R";
                break;

            case 2:
                letra = "W";
                break;

            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;

            case 5:
                letra = "M";
                break;

            case 6:
                letra = "Y";
                break;

            case 7:
                letra = "F";
                break;

            case 8:
                letra = "P";
                break;

            case 9:
                letra = "D";
                break;

            case 10:
                letra = "X";
                break;

            case 11:
                letra = "B";
                break;

            case 12:
                letra = "N";
                break;

            case 13:
                letra = "J";
                break;

            case 14:
                letra = "Z";
                break;

            case 15:
                letra = "S";
                break;

            case 16:
                letra = "Q";
                break;

            case 17:
                letra = "V";
                break;

            case 18:
                letra = "H";
                break;

            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;

            case 21:
                letra = "K";
                break;

            case 22:
                letra = "E";
                break;

        }


        return letra;
    }

    public static boolean isValidNif(int dni, String letra_dni) {
        String letra_funcion = getNif(dni);
        if (letra_funcion == letra_dni) {
            return true;
        } else {
            return false;
        }


    }
    public static double calculateIRPF(double dinero){
        double cantidad_a_pagar =0;
        while (dinero<12450) {
            cantidad_a_pagar = dinero * 19 / 100;
        }
        while (dinero>12450 && dinero<20199) {
            cantidad_a_pagar = dinero * 24 / 100;
        }
        while (dinero>20200 && dinero<35199) {
            cantidad_a_pagar = dinero * 30/ 100;
        }
        while (dinero>35200 && dinero<59999) {
            cantidad_a_pagar = dinero * 37 / 100;
        }
        while (dinero>60000 && dinero<299999) {
            cantidad_a_pagar = dinero * 45 / 100;
        }
        while (dinero>300000) {
            cantidad_a_pagar = dinero * 47/ 100;
        }

    return cantidad_a_pagar;}
}

