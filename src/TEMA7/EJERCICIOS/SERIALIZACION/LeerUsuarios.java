package TEMA7.EJERCICIOS.SERIALIZACION;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerUsuarios {
    public static void main(String[] args) {

        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Documents\\CURSO\\PROGRAMACION\\ARCHIVOS_EJEMPLO\\Usuarios.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

