package BUCLES;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("introduce la nota de tus alumnos y te diremos cuantos han suspendido,el programa terminara cuando introduzcas un numero negativo o un numero mayor que 10");
        Scanner in = new Scanner(System.in);
        double nota = in.nextDouble();
        int suspenso = 0;
        int personas=0;
        while (nota > 0 && nota<=10) {

                if (nota < 5) {
                    suspenso = suspenso + 1;
                    nota = in.nextDouble();
                    personas++;
                }
                if (nota >= 5) {
                    nota = in.nextDouble();
                    personas++;
                }
        }
        System.out.println("han  suspendido " + suspenso + " alumnos, han aprobado "+ (personas-suspenso) +" alumnos ");
    }
}


