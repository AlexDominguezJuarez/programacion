package condicionales;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("introduce el dinero que quieres pasar a euros");
        Scanner in=new Scanner(System.in);
        double dolar= in.nextDouble();
        double euros=(dolar*0.93);
        System.out.println(dolar+" dolares son "+euros+" euros");
    }
}
