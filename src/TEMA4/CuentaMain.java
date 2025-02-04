package TEMA4;

import javax.swing.*;
import java.util.Scanner;

public class CuentaMain {
    public static void main(String[] args) {
        System.out.println("MENU DE BANCO");
        System.out.println("\nPulse 0 para salir del programa\n");
        System.out.println("1. Crear una nueva persona registrada en el banco");
        System.out.println("2. Crear una nueva cuenta de banco");
        System.out.println("3. Mostrar datos de una persona");
        System.out.println("4. Recibir tu nomina mensual");
        System.out.println("5. Recibir un pago");
        System.out.println("6. Realizar una transferencia");
        System.out.println("7. Mostrar lista de morosos");
        Scanner in =new Scanner(System.in);

        int eleccion=in.nextInt();
        while (eleccion!=0){

            switch (eleccion) {
                case 1:
                    System.out.println("Porfavor,introduce ");
                    Persona persona1=new Persona()

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
            }
        }
    }
}
