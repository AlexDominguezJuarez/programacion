package BUCLES;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("El programa sacará la media de los numeros introducidos, en el  momento que se introduzca un numero negativo acabará el programa");
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        int numero_de_numeros=0;
        int numero_total=0;
        while(numero>=0){
            numero_total=numero+numero_total;
            numero_de_numeros=numero_de_numeros+1;
            numero=in.nextInt();

        }
        double numero_dividido=numero_total/numero_de_numeros;
        System.out.println("la media de los numeros introducidos es "+numero_dividido);

    }
}
