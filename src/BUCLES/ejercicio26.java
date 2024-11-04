package BUCLES;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        System.out.println("introduce un numero y te diremos si es primo o no");

        Scanner in = new Scanner(System.in);
        int numero1 = in.nextInt();
        int numero2 = numero1;
        numero1 = numero1 - 1;
        int numero3 = 1;
        for (int i = numero1; i >= 2; i--) {
            if (numero2 % i == 0) {
                numero3 = numero2 % i;
                i = 2;
            }
        }
            if (numero3 == 0) {
                System.out.println("el numero no es primo");

            } else {
                System.out.println("el numero  es primo");
            }



    }
}
