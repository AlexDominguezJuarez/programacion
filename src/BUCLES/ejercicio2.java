package BUCLES;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("introduce 2 numeros");
        Scanner in= new Scanner(System.in);
        int numero1= in.nextInt();
        int numero2=in.nextInt();
        if (numero2>numero1) {
            if (numero1 % 2 != 1) {
                numero1=numero1+1;
                while (numero1<numero2){
                    System.out.println(numero1);
                    numero1=numero1+2;
                }
            }else{
                while (numero1<numero2){
                    System.out.println(numero1);
                    numero1=numero1+2;
                }
            }
        }
    }
}
