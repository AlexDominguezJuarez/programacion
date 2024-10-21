package tema2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("introduce el lado del cuadrado");
        Scanner in = new Scanner(System.in);
        int lado = in.nextInt();
        int superficie = lado * lado;
        int perimetro = lado + lado + lado + lado;
        System.out.println("la superficie es " + superficie);
        System.out.println("el perimetro es " + perimetro);

    }
}