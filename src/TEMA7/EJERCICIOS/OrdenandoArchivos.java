package TEMA7.EJERCICIOS;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoArchivos {
    public static void main(String[] args) {
        String archivoLectura="Documentos/usa_personas.txt";

        List<String> nombres=new ArrayList<>();

        Scanner in=new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo a leer");
        in.nextLine();
        System.out.println("Introduce el nombre del archivo a reescribir");
        in.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoLectura))) {
            String line;
            while ((line = br.readLine()) != null) {
                nombres.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(nombres);

        try (FileWriter file=new FileWriter("Documentos/usa_personas_sort.txt")){
            BufferedWriter bw=new BufferedWriter(file);
            for (String nombre:nombres){
                bw.write(nombre);
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("Documentos/usa_personas_sort.txt"))) {
            String line;
            System.out.println("bufferedReader");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {

    } catch (IOException e) {
        e.printStackTrace();
    }


    }
}
