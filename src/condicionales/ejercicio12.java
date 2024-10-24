package condicionales;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println("introduce 3 numeros");
        Scanner in= new Scanner(System.in);
        int numero1= in.nextInt();
        int numero2=in.nextInt();
        int numero3=in.nextInt();
        if (numero1>numero2&&numero2>numero3){
            System.out.println(numero1+" " + numero2 +" "+ numero3);
        }
        if (numero1>numero2&&numero2<numero3) {
            System.out.println(numero1 + " " + numero3 + " " + numero2);
        }
        if (numero2>numero1&&numero1>numero3){
            System.out.println(numero2+" " + numero1 +" "+ numero3);
        }
        if (numero2 > numero3 && numero1 < numero3) {
            System.out.println(numero2+" " + numero3 +" "+ numero1);
        }
        if (numero3>numero2&&numero2<numero1){
            System.out.println(numero3+" " + numero1 +" "+ numero2);
        }
        if(numero3>numero2&&numero2>numero1){
            System.out.println(numero3+" " + numero2 +" "+ numero1);
        }
    }
}
