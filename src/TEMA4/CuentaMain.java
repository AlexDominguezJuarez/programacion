package TEMA4;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CuentaMain {
    public static void menu(){
        System.out.println("\nMENU DE BANCO");
        System.out.println("\nPulse 0 para salir del programa\n");
        System.out.println("1. Crear una nueva persona registrada en el banco");
        System.out.println("2. Crear una nueva cuenta de banco");
        System.out.println("3. Mostrar datos de una persona");
        System.out.println("4. Recibir tu nomina mensual");
        System.out.println("5. Recibir un pago");
        System.out.println("6. Realizar una transferencia");
        System.out.println("7. Mostrar lista de morosos");
    }
    public static void main(String[] args) {
        menu();

        Scanner in =new Scanner(System.in);

        int [] arrayDefecto=new int[0];

        PersonaBanco personaPorDefecto=new PersonaBanco(arrayDefecto, "",0,true);


        List<PersonaBanco> personasRegistradas=new ArrayList<>();
        List<Cuenta> cuentasRegistradas=new ArrayList<>();


        int eleccion=in.nextInt();
        String basura=in.nextLine();
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
                    PersonaBanco personaEncontrada = null;
                    System.out.println("Introduzca su nuevo numero de cuenta");
                    int numeroDeCuenta=in.nextInt();
                    System.out.println("Introduce tu dni");
                    basura=in.nextLine();
                    dni=in.nextLine();

                    int dineroDeCuenta=0;
                    for (PersonaBanco persona : personasRegistradas) {
                        if (persona.getDni().equals(dni)){
                            personaEncontrada=persona;

                        }
                    }
                    if (personaEncontrada!=null){
                        Cuenta cuenta1=new Cuenta(numeroDeCuenta,dineroDeCuenta);
                        cuentasRegistradas.add(cuenta1);
                        personaEncontrada.crearCuentaBancaria(cuenta1);
                    }else {
                        System.out.println("Persona no encontrada");
                    }



                    break;
                case 3:
                    personaEncontrada=null;
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
                    personaEncontrada=null;
                    Cuenta cuentaEncontrada=null;
                    System.out.println("Porfavor introduzca su dni");
                    dni=in.nextLine();
                    System.out.println("Porfavor introduzca su numero de cuenta\n");

                    numeroDeCuenta=in.nextInt();
                    int nomina=1200;
                    for (PersonaBanco personaABuscar:personasRegistradas){
                        if (personaABuscar.getDni().equals(dni)){
                            personaEncontrada=personaABuscar;

                        }
                    }
                    for (Cuenta recorrerCuentas:cuentasRegistradas){
                        if (recorrerCuentas.getNumeroDeCuenta()==numeroDeCuenta){
                            cuentaEncontrada=recorrerCuentas;
                        }
                    }
                    if ((personaEncontrada!=null)&&(cuentaEncontrada!=null)){
                        cuentaEncontrada.recibirNominas(personaEncontrada,nomina);
                        System.out.println("Nomina recibida con exito");
                    }else {
                        System.out.println("No se ha podido completar la operacion");
                    }

                    break;
                case 5:
                    personaEncontrada=null;
                    cuentaEncontrada=null;
                    System.out.println("Porfavor introduzca su dni");
                    dni=in.nextLine();
                    System.out.println("Porfavor introduzca su numero de cuenta\n");
                    numeroDeCuenta=in.nextInt();
                    for (PersonaBanco personaABuscar:personasRegistradas){
                        if (personaABuscar.getDni().equals(dni)){
                            personaEncontrada=personaABuscar;

                        }
                    }
                    for (Cuenta recorrerCuentas:cuentasRegistradas){
                        if (recorrerCuentas.getNumeroDeCuenta()==numeroDeCuenta){
                            cuentaEncontrada=recorrerCuentas;
                        }
                    }
                    System.out.println("Introduzca el pago que va a realizar");
                    int dineroAPagar=in.nextInt();
                    if ((cuentaEncontrada!=null)&&(personaEncontrada!=null)){
                        cuentaEncontrada.pagar(personaEncontrada,dineroAPagar);
                    }



                    break;
                case 6:
                    personaEncontrada=null;
                    cuentaEncontrada=null;
                    System.out.println("PERSONA QUE PAGA");
                    System.out.println("Porfavor introduzca su dni");
                    dni=in.nextLine();
                    System.out.println("Porfavor introduzca su numero de cuenta\n");
                    numeroDeCuenta=in.nextInt();
                    System.out.println("PERSONA QUE COBRA");
                    PersonaBanco personaEcontrada2=null;
                    Cuenta cuentaEncontrada2=null;
                    System.out.println("Porfavor introduzca su numero de cuenta\n");
                    int numeroDeCuenta2=in.nextInt();
                    for (PersonaBanco personaABuscar:personasRegistradas){
                        if (personaABuscar.getDni().equals(dni)){
                            personaEncontrada=personaABuscar;

                        }
                    }
                    for (Cuenta recorrerCuentas:cuentasRegistradas){
                        if (recorrerCuentas.getNumeroDeCuenta()==numeroDeCuenta){
                            cuentaEncontrada=recorrerCuentas;
                        }
                    }
                    for (Cuenta recorrerCuentas:cuentasRegistradas){
                        if (recorrerCuentas.getNumeroDeCuenta()==numeroDeCuenta){
                            cuentaEncontrada2=recorrerCuentas;
                        }
                    }
                    System.out.println("Introduzca la cantidada de la transferencia");
                    dineroAPagar=in.nextInt();
                    if ((cuentaEncontrada!=null)&&(cuentaEncontrada2!=null)&&(personaEncontrada!=null)){
                        cuentaEncontrada.transferencia(personaEncontrada,personaEcontrada2,dineroAPagar,cuentaEncontrada2);
                    }


                    break;
                case 7:
                    System.out.println("Lista de MOROSOS");
                    List<PersonaBanco>personasMorosas=new ArrayList<>();
                    for (PersonaBanco recorrerLista:personasRegistradas){
                        if (recorrerLista.isMoroso()==true){
                            personasMorosas.add(recorrerLista);
                        }
                    }
                     System.out.println(personasMorosas);
                    break;
            }
            menu();
            eleccion=in.nextInt();
            in.nextLine();
        }
    }
}
