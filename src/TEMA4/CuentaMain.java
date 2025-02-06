package TEMA4;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
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

        int [] arrayDefecto=new int[0];

        PersonaBanco personaPorDefecto=new PersonaBanco(arrayDefecto, "",0,true);


        List<PersonaBanco> personasRegistradas=new ArrayList<>();
        List<Cuenta> cuentasRegistradas=new ArrayList<>();


        int eleccion=in.nextInt();
        while (eleccion!=0){

            switch (eleccion) {
                case 1:
                    int []cuentaBancarias=new int[]{0,0,0};
                    int numeroDeCuentas=0;
                    boolean morosoNo=false;

                    System.out.println("Introduce tu dni");
                    String dni=in.nextLine();

                    PersonaBanco persona1=new PersonaBanco(cuentaBancarias,dni,numeroDeCuentas,false);
                    System.out.println("\nPersona registrada con exito");
                    personasRegistradas.add(persona1);


                    break;
                case 2:
                    PersonaBanco personaEncontrada = personaPorDefecto;
                    System.out.println("Introduzca su nuevo numero de cuenta");
                    int numeroDeCuenta=in.nextInt();
                    System.out.println("Introduce tu dni");
                    dni=in.nextLine();
                    int dineroDeCuenta=0;
                    for (PersonaBanco persona : personasRegistradas) {
                        if (persona.getDni().equals(dni)){
                            personaEncontrada=persona;

                        }
                    }
                    Cuenta cuenta1=new Cuenta(numeroDeCuenta,dineroDeCuenta,personaEncontrada.getDni());
                    System.out.println("Cuenta creada con exito");
                    cuentasRegistradas.add(cuenta1);

                    break;
                case 3:
                    System.out.println("Introduce tu dni para saber tus datos personales");
                    personaEncontrada=personaPorDefecto;
                    dni=in.nextLine();
                    for (PersonaBanco personaRecorrer:personasRegistradas) {
                        if (personaRecorrer.getDni().equals(dni)){
                            personaEncontrada=personaRecorrer;
                        }
                    }personaEncontrada.mostrarDatos();

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Lista de MOROSOS");
                    List<PersonaBanco>personasMorosas=new ArrayList<>();
                    for (PersonaBanco recorrerLista:personasRegistradas){
                        if (recorrerLista.)
                    }
                    break;
            }
        }
    }
}
