package BUCLES;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("introduce la nota de tus alumnos y te diremos cuantos han suspendido,el programa terminara cuando introduzcas un numero negativo");
        Scanner in = new Scanner(System.in);
        double nota = in.nextDouble();
        int suspenso = 0;
        while (nota > 0) {

                if (nota < 5) {
                    suspenso = suspenso + 1;
                    nota = in.nextDouble();
                }
                if (nota >= 5) {
                    nota = in.nextDouble();
                }


        }
        System.out.println("han  suspendido " + suspenso + " alumnos");
    }
}


