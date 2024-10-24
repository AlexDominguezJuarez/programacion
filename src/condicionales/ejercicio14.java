package condicionales;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("¿cuantas personas vienen al camping?");
        Scanner in= new Scanner(System.in);
        int personas= in.nextInt();
        System.out.println("¿cuatos dias?");
        int dias= in.nextInt();
        double precio=(personas*15*dias);
        if (personas>5){
            precio=(precio*75/100);


        }
        System.out.println("el precio total es "+precio);

    }
}
