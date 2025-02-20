package TEMA5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gimnasio {
    public static void menu(){
        System.out.println("\nGimnasio almazora\nPulse 0 para salir del menu");
        System.out.println("¿Que gestion quiere realizar?");
        System.out.println("1. Darse de alta en el gimnasio");
        System.out.println("2. Darse de baja en el gimnasio");
        System.out.println("3. Mostrar tus datos de usuario");
        System.out.println("4. Modificar usuarios");
    }
    public static void menuModificacion(){
        System.out.println("1. Modificar nombre");
        System.out.println("2. Modificar DNI");
        System.out.println("3. Modificar edad");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean usuarioExistente=false;
        menu();
        int numerito=0;
        int eleccion=in.nextInt();
        Usuario usuarioDefecto=new Usuario("","",0);
        List<Usuario>listaDeUsuarios=new ArrayList<Usuario>();
        listaDeUsuarios.add(usuarioDefecto);




        while(eleccion!=0) {


            switch (eleccion) {
                case 1:
                    System.out.println("Introduce tu nombre");
                    in.nextLine();
                    String nombreUsuario = in.nextLine();
                    System.out.println("Introduce tu dni");
                    String dniUsuario = in.nextLine();
                    System.out.println("Introduce tu edad");
                    int edadUsuario = in.nextInt();
                    for (Usuario recorrerLista : listaDeUsuarios) {
                        if ((dniUsuario.equals(recorrerLista.getDni())) && (edadUsuario == recorrerLista.getEdad())) {
                            System.out.println("Usuario ya creado");
                            usuarioExistente = true;
                        }
                    }
                    if (usuarioExistente == false) {
                        Usuario nuevoUsuario = new Usuario(nombreUsuario, dniUsuario, edadUsuario);
                        listaDeUsuarios.add(nuevoUsuario);
                        System.out.println("Usuario creado");
                    }
                    usuarioExistente=false;

                    menu();
                    eleccion = in.nextInt();

                    break;
                case 2:
                    System.out.println("Introduce tu nombre");
                    in.nextLine();
                    nombreUsuario = in.nextLine();
                    System.out.println("Introduce tu dni");
                    dniUsuario = in.nextLine();
                    System.out.println("Introduce tu edad");
                    edadUsuario = in.nextInt();
                    for (Usuario recorrerLista : listaDeUsuarios) {
                        if ((dniUsuario.equals(recorrerLista.getDni())) && (edadUsuario == recorrerLista.getEdad())) {
                            numerito=listaDeUsuarios.size();
                            usuarioExistente=false;
                        }
                    }
                    if (usuarioExistente ==true) {
                        System.out.println("Usuario no encontrado");
                    }else {
                        listaDeUsuarios.remove(numerito-1);
                        System.out.println("Usuario eliminado");
                    }
                    menu();
                    eleccion = in.nextInt();
                    usuarioExistente=true;
                    break;
                case 3:
                    System.out.println("Introduce tu nombre");
                    nombreUsuario = in.nextLine();
                    in.nextLine();

                    System.out.println("Introduce tu dni");
                    dniUsuario = in.nextLine();
                    System.out.println("Introduce tu edad");
                    edadUsuario = in.nextInt();
                    for (Usuario recorrerLista : listaDeUsuarios) {
                        if ((dniUsuario.equals(recorrerLista.getDni())) && (edadUsuario == recorrerLista.getEdad())) {
                            usuarioExistente = true;
                            numerito=listaDeUsuarios.size();
                        }
                        if (usuarioExistente==true){
                            recorrerLista.mostrarDatos();
                            usuarioExistente=false;
                        }
                    }


                    menu();
                    eleccion = in.nextInt();
                    break;
                case 4:
                    System.out.println("Introduce tu nombre");
                    nombreUsuario = in.nextLine();
                    in.nextLine();
                    System.out.println("Introduce tu dni");
                    dniUsuario = in.nextLine();
                    System.out.println("Introduce tu edad");
                    edadUsuario = in.nextInt();
                    for (Usuario recorrerLista : listaDeUsuarios) {
                        if ((dniUsuario.equals(recorrerLista.getDni())) && (edadUsuario == recorrerLista.getEdad())) {
                            System.out.println("¿Que dato quieres modificar?");
                            menuModificacion();
                            eleccion = in.nextInt();
                            switch (eleccion) {
                                case 1:
                                    System.out.println("Introduce el nuevo nombre");
                                    in.nextLine();
                                    String nuevoNombre = in.nextLine();
                                    recorrerLista.setNombreUsuario(nuevoNombre);
                                    break;
                                case 2:
                                    System.out.println("Introduce el nuevo dni");
                                    in.nextLine();
                                    String nuevoDni = in.nextLine();
                                    recorrerLista.setDni(nuevoDni);
                                    break;
                                case 3:
                                    System.out.println("Introduce la nueva edad");
                                    in.nextLine();
                                    int nuevaEdad = in.nextInt();
                                    recorrerLista.setEdad(nuevaEdad);
                                    break;
                            }
                        }
                    }
                    menu();
                    eleccion = in.nextInt();

                    break;
            }
        }
    }
}
