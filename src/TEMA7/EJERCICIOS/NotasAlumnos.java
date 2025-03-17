package TEMA7.EJERCICIOS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NotasAlumnos {
    public static void main(String[] args) {
        String fileName = "Documentos/alumnos_notas.txt";
        List<String[]> alumnos = new ArrayList<>();

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

                // Agregar nombre y nota al listado
                alumnos.add(new String[]{nombreCompleto, String.valueOf(notaMedia)});
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Archivo no encontrado: " + fileName, e);
        } catch (IOException e) {
            throw new RuntimeException("Error de lectura en el archivo: " + fileName, e);
        }

        // Ordenar por nota media de mayor a menor
        alumnos.sort((a1, a2) -> Double.compare(Double.parseDouble(a2[1]), Double.parseDouble(a1[1])));

        // Imprimir los resultados ordenados
        System.out.println("Notas de los alumnos:");
        for (String[] alumno : alumnos) {
            System.out.println(alumno[0] + " - Nota media: " + alumno[1]);
        }

        // Encontrar la nota más alta y el alumno correspondiente
        if (!alumnos.isEmpty()) {
            String mejorAlumno = alumnos.get(0)[0];
            double notaMaxima = Double.parseDouble(alumnos.get(0)[1]);
            System.out.println("\nEl alumno con la mejor nota es " + mejorAlumno + " con " + notaMaxima);
        }
    }
}