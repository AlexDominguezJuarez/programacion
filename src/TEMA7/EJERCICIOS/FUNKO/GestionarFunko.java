package TEMA7.EJERCICIOS.FUNKO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GestionarFunko {

    public static void menu(){
        System.out.println("SELECCIONE LA OPCION QUE QUIERAS EJECUTAR\n");
        System.out.println("1. Añadir Funko");
        System.out.println("2. Borrar Funko");
        System.out.println("3. Mostrar todos los funkos");
        System.out.println("4. Mostrar el funko mas caro");
        System.out.println("5. Mostrar la media de precio de los funkos");
        System.out.println("6. Mostrar los funkos agrupados por modelos");
        System.out.println("7. Mostrar los funkos del año 2023");


    }

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        List<Funko> funkos = new ArrayList<>();
        String modelo="";

        try (BufferedReader br = new BufferedReader(new FileReader("/home/aledomjua/Baixades/funkos.csv"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] funko = linea.split(COMMA_DELIMITER);

                String code= funko[0];
                String nombre= funko[1];
                 modelo= funko[2];
                String precio= funko[3];
                String fecha= funko[4];

                Funko funko1=new Funko(code,nombre,modelo,precio,fecha);




                funkos.add(funko1);
            }



        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Hubo un error al leer el archivo.");
            e.printStackTrace();
        }

        menu();
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("Introduce el codigo del funko");
                in.nextLine();
                String code=in.nextLine();
                System.out.println("Introduce el nombre del funko");
                String nombre=in.nextLine();
                System.out.println("Introduce el modelo del funko");
                modelo=in.nextLine();
                System.out.println("Introduce el precio del funko");
                String precio=in.nextLine();
                System.out.println("Introduce la fecha en la que añades al funko");
                String fecha=in.nextLine();
                String funkoString[] =new String[5];
                funkoString[0]=code;
                funkoString[1]=nombre;
                funkoString[2]=modelo;
                funkoString[3]=(precio);
                funkoString[4]=fecha;

                Funko funko=new Funko(code,nombre,modelo,precio,fecha);

                funkos.add(funko);

                break;
            case 2:
                System.out.println("Introduce el codigo del funko a buscar: ");
                String codigoABorrar=in.nextLine();
                for (Funko funkoLista: funkos){
                    String codigoFunko=funkoLista.getCodigo();

                    if (codigoFunko.equals(codigoABorrar)){

                        funkos.remove(funkoLista);
                        System.out.println("Funko eliminado de la lista correctamente");
                    }
                }



                break;
            case 3:
                for (Funko funkoLista : funkos) {
                    System.out.println(funkoLista);
                }
                break;
            case 4:
                double precioMaximo=0;
                for (int i=1;i<funkos.size();i++){


                    String precioFunkoStr=(funkos.get(i).getPrecio());
                    double precioFunko=Double.parseDouble(precioFunkoStr);

                    if (precioMaximo<precioFunko){
                        precioMaximo=precioFunko;
                    }
                }
                System.out.println("El funko mas caro es: "+precioMaximo);
                break;
            case 5:
                int contador=0;
                double precioMedia=0;
                double precioFunko=0;

                for (int i=1;i<funkos.size();i++){
                    contador++;

                     String precioFunkoStr=(funkos.get(i).getPrecio());
                     precioFunko=Double.parseDouble(precioFunkoStr);

                     precioMedia=precioMedia+precioFunko;
            }
                precioMedia=precioMedia/contador;
            System.out.println("La media de los funkos es: "+precioMedia);
                break;
            case 6:
                Map<String, List<Funko>> agrupadosPorModelo = new HashMap<>();

                for (Funko f : funkos) {
                    String modeloFunko = f.getModelo(); // Suponiendo que tienes getModelo()
                    agrupadosPorModelo.putIfAbsent(modeloFunko, new ArrayList<>());
                    agrupadosPorModelo.get(modeloFunko).add(f);
                }

                // Mostrar funkos agrupados
                for (String modelo : agrupadosPorModelo.keySet()) {
                    System.out.println("MODELO: " + modelo);
                    for (Funko f : agrupadosPorModelo.get(modelo)) {
                        System.out.println("  - " + f);
                    }
                }

               break;
            case 7:
                for (Funko funkoLista: funkos){
                String año=funkoLista.getFechaLanzamiento();
                año=año.substring(0,4);
                if (año.equals("2023")){
                    System.out.println(funkoLista.toString());
                }
            }
                break;
        }

    }
}
