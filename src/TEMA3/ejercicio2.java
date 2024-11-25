package TEMA3;

import java.util.Scanner;


import static TEMA3.ejercicio1.numberSign;

public class ejercicio2 {

    public static boolean isAdult(int edad){
        boolean mayor_de_edad=true;



        if(edad<18){
            mayor_de_edad= false;
        }
        return mayor_de_edad;

    }
     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("INTRODUCE TU EDAD");
        int numero_edad;
        numero_edad=in.nextInt();
        boolean mayor_de_edad=isAdult(numero_edad);
        if (mayor_de_edad==true){
            System.out.println("ERES MAYOR DE EDAD");
        }else {
            System.out.println("ERES MENOR DE EDAD");
        }

         Scanner in= new Scanner(System.in);
         System.out.println("INTRODUCE UN NUMERO");
         int numero_introducido_main= in.nextInt();

         int resultado=numberSign(numero_introducido_main);
         System.out.println("EL SIGNO DEL NUMERO ES: "+ resultado);
    }


}
