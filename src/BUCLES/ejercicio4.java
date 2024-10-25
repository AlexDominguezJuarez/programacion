package BUCLES;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("introduce un numero entero");
        Scanner in=new Scanner(System.in);
        int numero=in.nextInt();
        int contador=1;
        while(numero>10){
            numero=numero/10;

            contador=contador+1;
        }
        System.out.println("el numero introducido tiene "+contador+" digitos");
    }
}
