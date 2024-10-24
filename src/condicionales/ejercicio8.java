package condicionales;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("introduce el dinero que quieres pasar a dolares");
        Scanner in=new Scanner(System.in);
        double euros= in.nextDouble();
        double dolares=(euros*1.08);
        System.out.println(euros+" euros son "+dolares+" dolares");
    }
}
