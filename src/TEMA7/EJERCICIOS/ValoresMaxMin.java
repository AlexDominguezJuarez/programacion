package TEMA7.EJERCICIOS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ValoresMaxMin {
    public static void main(String[] args) {


        String fileName = "Documentos/numeros.txt";
        String leeLineas;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    int numeroTemporal=Integer.parseInt(line);
                    if (numeroTemporal>max){
                        max=numeroTemporal;
                    }
                    if (numeroTemporal<min){
                        min=numeroTemporal;

                    }


                }

            } System.out.println(min);
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
