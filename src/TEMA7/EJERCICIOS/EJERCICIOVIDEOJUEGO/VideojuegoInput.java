package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VideojuegoInput implements Serializable {
    private FileInputStream file;
    private ObjectInputStream input;

    //Abrir fichero
    public void abrir() throws IOException {

        file = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\src\\TEMA7\\EJERCICIOS\\EJERCICIOVIDEOJUEGO\\ranking.ser");
        input = new ObjectInputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(input!=null)
            input.close();
    }

    public Videojuego leer() throws IOException, ClassNotFoundException{
        Videojuego videojuego = null;
        if(input!=null){
            try{
                videojuego = (Videojuego) input.readObject();
                System.out.println("contacto leido correctamente");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return videojuego;
    }
}