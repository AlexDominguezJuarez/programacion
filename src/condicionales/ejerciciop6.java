package condicionales;

import java.util.Scanner;

public class ejerciciop6 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner in=new Scanner(System.in);
        double numero=in.nextDouble();
        if (numero<0) {
            System.out.println("eñ numero que has introducido es negativo");
        }if (numero>0){
            System.out.println("el numero es positivo");
        }
        if (numero == 0){
            System.out.println("el numero es 0");

        }


    }
}
