package condicionales;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println("introduce 3 numeros");
        Scanner in= new Scanner(System.in);
        double numero1= in.nextDouble();
        double numero2= in.nextDouble();
        double numero3= in.nextDouble();
        if (numero2==numero1+1 && numero3==numero2+1){
            System.out.println("los numeros introducidos son consecutivos");

        }else {
            System.out.println("los numeros introducidos no son consecutivos");
        }

    }
}
