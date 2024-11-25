package TEMA3;

import java.util.Scanner;

public class ejercicio1 {

    public static int numberSign(int numero_introducido_funcion){

        int signo=0;

        if (numero_introducido_funcion <0){
            signo=-1;

        }
        if (numero_introducido_funcion>0){
            signo=+1;

        }
        if (numero_introducido_funcion==0){
            signo=0;

        }
        return signo;

    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO");
        int numero_introducido_main= in.nextInt();

        int resultado=numberSign(numero_introducido_main);
        System.out.println("EL SIGNO DEL NUMERO ES: "+ resultado);

    }

}
