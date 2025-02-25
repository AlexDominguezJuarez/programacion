package TEMA5.ARRAYLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEspera {
    public static void menu(List listaDeEspera) {
        System.out.println("\n¿Que quiere hacer?\n");
        System.out.println("0. Salir de la aplicacion");
        System.out.println("1. Apuntarse a la lista de espera");
        System.out.println("2. Quitarse de la lista de espera");
        System.out.println("3. Ya me han llamado");
    }

    public static void imprimirLista(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("\nLa lista de espera está vacía.");
        } else {
            System.out.println("\nUsuarios en la lista de espera:");
            for (Usuario usuario : usuarios) {
                System.out.println("Nombre: " + usuario.getNombreUsuario()+usuario.getEdad());
            }
        }
    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Usuario usuarioDefecto=new Usuario("","",0);
        Usuario nuevoUsuario = null;

        boolean comprobacion=true;
        List<Usuario>usuariosEnEspera=new ArrayList<>();
        menu(usuariosEnEspera);
        int eleccion=in.nextInt();
        while (eleccion!=0) {
            switch (eleccion) {

                case 1:
                    System.out.println("Introduce tu nombre");
                    in.nextLine();
                    String nombreUsuario = in.nextLine();
                    System.out.println("Introduce tu DNI");
                    String dni = in.nextLine();
                    System.out.println("Introduce tu edad");
                    int edad = in.nextInt();
                    for (Usuario recorrerLista : usuariosEnEspera) {
                        if (nombreUsuario.equals(recorrerLista.getDni())) {
                            comprobacion=false;
                        }


                    }
                    if (comprobacion==true){
                        nuevoUsuario = new Usuario(nombreUsuario, dni, edad);
                        usuariosEnEspera.add(nuevoUsuario);
                        System.out.println("Persona añadida correctamente");
                    }else {
                        System.out.println("Usuario ya añadido");
                    }


                    imprimirLista(usuariosEnEspera);
                    menu(usuariosEnEspera);
                    eleccion=in.nextInt();
                    break;
                case 2:
                    System.out.println("Introduce tu dni");
                    in.nextLine();
                    dni = in.nextLine();
                    for (Usuario recorrerLista : usuariosEnEspera) {
                        if (dni.equals(recorrerLista.getDni())) {
                            usuariosEnEspera.remove(recorrerLista);
                            System.out.println("Persona borrada de la lista");
                        } else {
                            System.out.println("Persona no encontrada");
                        }
                    }

                    imprimirLista(usuariosEnEspera);
                    menu(usuariosEnEspera);
                    eleccion=in.nextInt();
                    break;
                case 3:
                    usuariosEnEspera.remove(0);
                    System.out.println("Persona borrada de la lista");
                    imprimirLista(usuariosEnEspera);
                    menu(usuariosEnEspera);
                    eleccion=in.nextInt();
                    break;
            }

        }
    }
}
