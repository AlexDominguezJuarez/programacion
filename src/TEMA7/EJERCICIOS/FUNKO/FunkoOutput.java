package TEMA7.EJERCICIOS.FUNKO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;


public class FunkoOutput {
    private FileOutputStream file;
    private ObjectOutputStream output;


    public void abrir() throws IOException{

        file = new FileOutputStream("/home/aledomjua/Documents/CURSO/PROGRAMACION/funkosGuardados.csv");
        output = new ObjectOutputStream(file);
    }


    public void cerrar() throws IOException{
        if(output!=null)
            output.close();
    }


    public void escribir(Funko funko) throws IOException{
        if(output!=null) {
            output.writeObject(funko);
            System.out.println("Funkos guardados correctamente");
        }
    }

}