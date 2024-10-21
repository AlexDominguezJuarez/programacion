package tema2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("introduce la base del triangulo");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        System.out.println("introduce la altura del traingulo");
        int altura= in.nextInt();
        double superficie= (base*altura)/2;
        System.out.println("la superficie del triangulo es " +superficie);
    }
}
