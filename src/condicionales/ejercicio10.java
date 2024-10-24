package condicionales;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        System.out.println("introduce 3 numeros y te diremos si estan ordenados de menos a mayor o no");
        Scanner in=new Scanner(System.in);
        double numero1=in.nextDouble();
        double numero2=in.nextDouble();
        double numero3=in.nextDouble();
        if (numero1< numero2 && numero2<numero3){
            System.out.println("los numeros están ordenados de menor a mayor");

        }else {
            System.out.println("los numeros no están ordenados de menor a mayor");
        }




    }
}
