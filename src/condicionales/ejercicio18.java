package condicionales;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
    System.out.println("introduce un numero");
    Scanner in= new Scanner(System.in);
    double numero1= in.nextDouble();
    double raiz_cuadrada=Math.sqrt(numero1);
    if (numero1<0){
        System.out.println("no se admiten numeros negaitvos");
    }else{
        System.out.println("la raiz cuadrada del numero es"+raiz_cuadrada);
    }


    }
}
