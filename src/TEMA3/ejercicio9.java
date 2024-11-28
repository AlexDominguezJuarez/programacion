package TEMA3;

import java.util.Scanner;
import java.util.WeakHashMap;

public class ejercicio9 {

    public static void piramide_de_letras(char letra, int numero_de_filas){
            for(int i=numero_de_filas;i>=1;i--) {
                System.out.println(letra);
            }


        }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("PIRAMIDE DE LETRAS");
        System.out.println("INTRODUCE LA LETRA DE LA QUE ESTARÁ HECHA LA PIRAMIDE");
        String palabra=in.nextLine();
        char letra=palabra.charAt(0);




        System.out.println("INTRODUCE LA CANTIDAD DE FILAS QUE VA A TENER LA PIRAMIDE");
        int numero_de_filas=in.nextInt();

        piramide_de_letras(letra, numero_de_filas);



    }
}
