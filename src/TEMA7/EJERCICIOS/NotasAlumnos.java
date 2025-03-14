package TEMA7.EJERCICIOS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class NotasAlumnos {
    public static void main(String[] args) {
        String fileName = "Documentos/alumnos_notas.txt";

        List<String[]> alumnos = new ArrayList<>();


        int numero;
        int numeroMedia=0;


       // try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] partes = line.split(" ");
                    String nombreCompleto = partes[0] + " " + partes[1];
                    int sumaNotas = 0;
                    int cantidadNotas = partes.length - 2;

                    for (int i = 2; i < partes.length; i++) {
                        sumaNotas += Integer.parseInt(partes[i]);
                    }
                    double notaMedia = (double) sumaNotas / cantidadNotas;
                    alumnos.add(new String[]{nombreCompleto, String.valueOf(notaMedia)});

                }




                    // numero=Integer.parseInt(line);
                    // numeroMedia=numero;
                } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        for (String[] alumno : alumnos) {
            System.out.println(alumno[0] + " - Nota media: " + alumno[1]);
        }
    }






    }
