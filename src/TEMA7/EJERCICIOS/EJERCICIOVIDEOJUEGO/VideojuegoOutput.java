package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class VideojuegoOutput implements Serializable {
    private FileOutputStream file;
    private ObjectOutputStream output;

    //Abrir fichero
    public void abrir() throws IOException {

        file = new FileOutputStream("/home/aledomjua/IdeaProjects/programacion/src/TEMA7/FICHEROS_EJERCICIOS/ranking.dat");
        output = new ObjectOutputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(output!=null)
            output.close();
    }

    //Escribir en el fichero
    public void escribir(Videojuego videojuego) throws IOException{
        if(output!=null) {
            output.writeObject(videojuego);
            System.out.println("Videojuego escrito correctamente");
        }
    }
}
