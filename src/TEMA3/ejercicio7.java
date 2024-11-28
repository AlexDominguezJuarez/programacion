package TEMA3;

import java.util.Scanner;

public class ejercicio7 {
    public static boolean calcular_numero_primo(int numero) {
        boolean primo = true;
        int numero2 = numero - 1;


        for (int i = numero; numero2 >= 2; numero2--) {


            if (i%numero2 == 0) {

                primo = false;
                i = 2;

            }

        }
       return primo;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        int numero_introducido=1;

        while (numero_introducido!=0 && numero_introducido>0){
            System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SI ES PRIMO O NO, EL PROGRAMA TERMINARA CUANDO INTRODUZCAS EL NUMERO 0");
            numero_introducido=in.nextInt();
            boolean primo=calcular_numero_primo(numero_introducido);
            if (primo==true){
                System.out.println("EL NUMERO INTRODUCIDO ES PRIMO");
            }
            if (primo==false){
                System.out.println("EL NUMERO INTRODUCIDO NO ES PRIMO");
            }



        }

    }
}