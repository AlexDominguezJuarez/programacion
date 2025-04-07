package TEMA7.EJERCICIOS.SERIALIZACION;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonaInput {
    private FileInputStream file;
    private ObjectInputStream input;

    //Abrir fichero
    public void abrir() throws IOException {

        file = new FileInputStream("persona.dat");
        input = new ObjectInputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(input!=null)
            input.close();
    }

    public Persona leer() throws IOException, ClassNotFoundException{
        Persona persona = null;
        if(input!=null){
            try{
                persona = (Persona) input.readObject();
                System.out.println("Persona leida correctamente");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return persona ;
    }
}
