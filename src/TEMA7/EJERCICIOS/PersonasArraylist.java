package TEMA7.EJERCICIOS;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasArraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Persona> listaPersonas=new ArrayList<>();

        System.out.println("¿Cuantas personas quieres añadir?");
        int numeroPersonas= in.nextInt();

        for (int i=0;i>=numeroPersonas;numeroPersonas--){
            System.out.println("Introduce el nombre de la persona");
            String nombre= in.nextLine();
            System.out.println("Introduce la edad de la persona");
            int edad=in.nextInt();
            Persona persona=new Persona(nombre,edad);



        }

    }
}
