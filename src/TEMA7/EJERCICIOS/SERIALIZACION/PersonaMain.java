package TEMA7.EJERCICIOS.SERIALIZACION;

import java.io.IOException;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {

        System.out.println("Pulse 1 si quiere añadir una persona al archivo persona");
        System.out.println("Pulse 2 si quiere leer el archivo persona");

        Scanner in =new Scanner(System.in);
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                Persona nuevaPersona=new Persona("Manolo",22);

                PersonaOutput escritura=new PersonaOutput();

                try {
                    escritura.abrir();
                    escritura.escribir(nuevaPersona);
                    escritura.cerrar();

                }catch(Exception e){

                }

                Persona persona;
                PersonaInput entrada;

                entrada = new PersonaInput();
                try {
                    entrada.abrir();
                    do{
                        persona = entrada.leer();

                    }while ((persona!=null));
                    entrada.cerrar();
                }catch (Exception e) {
            }
                break;
            case 2:
                PersonaInput leer=new PersonaInput();
                try {
                    leer.abrir();
                    Persona persona1=leer.leer();
                    leer.cerrar();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
}
