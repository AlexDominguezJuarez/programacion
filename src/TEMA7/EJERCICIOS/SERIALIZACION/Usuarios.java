package TEMA7.EJERCICIOS.SERIALIZACION;

import java.io.*;
import java.util.Scanner;

public class Usuarios {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String rutaCarpeta="C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos";

        File dir = new File("Usuarios.txt");

        try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\Documents\\CURSO\\PROGRAMACION\\ARCHIVOS_EJEMPLO\\Usuarios.txt",true)) {
            String line;
            String freaseNombre="Nombre:";
            String fraseEdad="Edad:";
            BufferedWriter bw = new BufferedWriter(file);
            System.out.println("Introduce tu nombre:");
            line=in.nextLine();
            freaseNombre+=line;
            bw.write(freaseNombre);
            bw.newLine();
            System.out.println("Introduce tu edad:");
            line=in.nextLine();
            fraseEdad+=line;


            bw.write(fraseEdad);
            bw.newLine();
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
