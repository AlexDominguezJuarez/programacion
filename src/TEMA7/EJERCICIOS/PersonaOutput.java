package TEMA7.EJERCICIOS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonaOutput {

    private FileOutputStream file;
    private ObjectOutputStream output;

    public void abrir() throws IOException {

        file = new FileOutputStream("persona.dat");
        output = new ObjectOutputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(output!=null)
            output.close();
    }

    //Escribir en el fichero
    public void escribir(Persona persona) throws IOException{
        if(output!=null) {
            output.writeObject(persona);
            System.out.println("Persona registrada correctamente");
        }
    }

}
