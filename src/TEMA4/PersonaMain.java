package TEMA4;

import com.sun.source.doctree.SerialDataTree;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=in.nextLine();
        System.out.println("Introduce tu primer apellido");
        String primerApellido=in.nextLine();
        System.out.println("Introduce tu segundo apellido");
        String segundoApellido=in.nextLine();
        System.out.println("Introduce tu edad");
        int edad=in.nextInt();
        System.out.println("Introduce tu dni");
        int dni=in.nextInt();
        Persona persona1=new Persona(nombre,primerApellido,segundoApellido,dni,edad);
        boolean mayorDeEdad=persona1.isAdult(edad);
        if (mayorDeEdad==true){
            System.out.println(nombre+" es mayor de edad");
        } else {
            System.out.println(nombre+" es menor de edad");
        }
        System.out.println();
        boolean retirado=persona1.isRetired(edad);
        if (retirado==true){
            System.out.println(nombre+" no tiene edad suficiente oara retirarse");
        } else {
            System.out.println(nombre+" tiene edad suficiente para retirarse");
        }
        System.out.println(persona1.toString(nombre,primerApellido,segundoApellido,dni,edad));




    }

}
