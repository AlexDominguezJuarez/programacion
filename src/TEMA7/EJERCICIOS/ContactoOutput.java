package TEMA7.EJERCICIOS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ContactoOutput {

    private FileOutputStream archivo;
    private ObjectOutputStream output;

    public void abrir() throws IOException{

        archivo = new FileOutputStream("persona.dat");
        output = new ObjectOutputStream(archivo);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException {
        if(output!=null)
            output.close();
    }

    //Escribir en el fichero
    public void escribir(Persona persona) throws IOException{
        if(output!=null) {
            output.writeObject(persona);
            System.out.println("contacto escrito correctamente");
        }
    }

}
