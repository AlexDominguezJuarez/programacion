package TEMA5;

import java.util.Scanner;

public class Gimnasio {
    public static void menu(){
        System.out.println("Gimnasio almazora");
        System.out.println("¿Que gestion quiere realizar?");
        System.out.println("1. Darse de alta en el gimnasio");
        System.out.println("2. Darse de baja en el gimnasio");
        System.out.println("3. Mostrar tus datos de usuario");
        System.out.println("4. Modificar usuarios");



    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        menu();
        int eleccion=in.nextInt();

        switch (eleccion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }
}
