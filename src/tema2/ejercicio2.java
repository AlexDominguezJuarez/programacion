package tema2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("introduce la base del triangulo");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        System.out.println("introduce la altura del traingulo");
        double altura= in.nextDouble();
        double superficie= (base*altura)/2;
        System.out.println("la superficie del triangulo es " +superficie);

        double perimetro= base*3;
        System.out.println("el perimetro del triangulo es " +perimetro);
    }
}
