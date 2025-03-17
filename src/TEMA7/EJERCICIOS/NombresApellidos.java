package TEMA7.EJERCICIOS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NombresApellidos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nombreArchivo1 = "Documentos/usa_nombres.txt";
        String nombreArchivo2 = "Documentos/usa_apellidos.txt";
        String nombrePersona;
        String apellidoPersona;

        String nombreYApellido;

        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();

        System.out.println("Cuantos usuarios quieres introducir");
        int usuariosAIntroducir = in.nextInt();



        for (int i = 0; i < usuariosAIntroducir; i++) {

            try (BufferedReader br1 = new BufferedReader(new FileReader(nombreArchivo1))) {
                String line;

                while ((line = br1.readLine()) != null) {



                    nombres.add(line);

                }

                Random random=new Random();
                int numeroAleatorio=random.nextInt(nombres.size());
                nombrePersona= nombres.get(numeroAleatorio);


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            try (BufferedReader br2 = new BufferedReader(new FileReader(nombreArchivo2))) {
                String line;

                while ((line = br2.readLine()) != null) {

                    int contador=0;

                    apellidos.add(line);

                }

                Random random=new Random();

                int numeroAleatorio=random.nextInt(apellidos.size());
                apellidoPersona=apellidos.get(numeroAleatorio);


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nombrePersona+" "+apellidoPersona);

        }
    }
}
