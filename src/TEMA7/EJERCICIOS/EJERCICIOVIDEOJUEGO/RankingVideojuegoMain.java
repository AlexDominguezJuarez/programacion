package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

import java.io.*;
import java.lang.runtime.SwitchBootstraps;
import java.util.*;

public class RankingVideojuegoMain {

    public static void mostrarRanking(List<Videojuego> listaVideojuegos) throws IOException, ClassNotFoundException {
        for (Videojuego juego : listaVideojuegos) {
            System.out.println(juego.getNombre());
        }
    }


        public static void menu () {
            System.out.println("\nMENU DE RANKING DE VIDEOJUEGOS");
            System.out.println("PULSE 0 PARA SALIR\n");
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Mostrar ranking completo");
            System.out.println("3. Eliminar videojuego");
            System.out.println("4. Guardar ranking en fichero");
            System.out.println("5. Cargar ranking desde fichero");
            System.out.println("6. Exportar ranking a texto");
        }

        public static void main (String[] args)  {
            //FUNCIONES Y VARIABLES
            Scanner in = new Scanner(System.in);

            double pesoJuego;

            int eleccion = 1;
            int eleccion2;
            int eleccion3;
            int notaJuego;
            String tiendaFisica;
            String tiendaDigital;
            String nombreJuego = "";
            String plaformaJuego;
            String estadoJuego;
            String buscarNombre;

            VideojuegoFisico.UsoJuego desgasteJuego = VideojuegoFisico.UsoJuego.Nuevo;

            //ARRAYLIST Y MAP
            Map<String, Videojuego> mapVideojuegos = new HashMap<>();

            List<Videojuego> listaVideojuegos = new ArrayList<>();
            List<Videojuego> listaImportada = new ArrayList<>();


            while (eleccion != 0) {
                menu();
                eleccion = in.nextInt();
                switch (eleccion) {


                    case 1:
                        System.out.println("¿Cual es el nombre del videojuego?");
                        in.nextLine();

                        nombreJuego = in.nextLine();
                        System.out.println("¿En que plataforma lo juegas?");
                        plaformaJuego = in.nextLine();
                        System.out.println("¿Que calificacion le das al juego?");
                        notaJuego = in.nextInt();
                        System.out.println("Pulse 1 si el juego es fisico\nPulse 2 si el juego es digital");
                        eleccion2 = in.nextInt();
                        switch (eleccion2) {
                            case 1:
                                System.out.println("¿En que tienda has comprado el juego?");
                                in.nextLine();
                                tiendaFisica = in.nextLine();
                                System.out.println("¿En que estado se encuentra el juego?\n1. En buen estado\n2. Desgastado");
                                eleccion3 = in.nextInt();
                                switch (eleccion3) {
                                    case 1:
                                        desgasteJuego = VideojuegoFisico.UsoJuego.Nuevo;
                                        break;
                                    case 2:
                                        desgasteJuego = VideojuegoFisico.UsoJuego.Usado;
                                        break;
                                }
                                VideojuegoFisico nuevoVideojuegoFisico = new VideojuegoFisico(desgasteJuego, tiendaFisica, notaJuego, nombreJuego, plaformaJuego);
                                listaVideojuegos.add(nuevoVideojuegoFisico);
                                break;
                            case 2:
                                System.out.println("¿En que tienda has comprado el juego?");
                                tiendaDigital = in.nextLine();
                                System.out.println("¿Cuanto pesa (en GB) el videojuego?");
                                pesoJuego = in.nextDouble();
                                VideojuegoDigital nuevoVideojuegoDigital = new VideojuegoDigital(tiendaDigital, pesoJuego, nombreJuego, plaformaJuego, notaJuego);
                                listaVideojuegos.add(nuevoVideojuegoDigital);
                                break;
                        }
                        break;
                    case 2:
                        Collections.sort(listaVideojuegos, new Comparator<Videojuego>() {
                            @Override
                            public int compare(Videojuego o1, Videojuego o2) {
                                return Integer.compare(o2.getNota(), o1.getNota());
                            }
                        });

                        for (Videojuego recorrerArraylist : listaVideojuegos) {
                            System.out.println("Nota: " + recorrerArraylist.getNota() + " Titulo: " + recorrerArraylist.getNombre());
                        }

                        break;
                    case 3:
                        System.out.println("Introduce el nombre del videojuego");
                        in.nextLine();
                        buscarNombre = in.nextLine();

                        for (Videojuego buscarVideojuego : listaVideojuegos) {
                            if (buscarVideojuego.getNombre().equals(buscarNombre)) {
                                listaVideojuegos.remove(buscarVideojuego);
                                System.out.println("Videojuego eliminado del ranking con exito");
                            }
                        }
                        break;
                    case 4:
                        VideojuegoOutput guardarVideojuego = new VideojuegoOutput();
                        try {
                            guardarVideojuego.abrir();
                            for (Videojuego recorrerArray : listaVideojuegos) {
                                guardarVideojuego.escribir(recorrerArray);
                            }
                            guardarVideojuego.cerrar();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        break;
                    case 5:
                        VideojuegoInput importarRanking = new VideojuegoInput();
                        Videojuego nuevoVideojuego=null;

                        try {
                            importarRanking.abrir();
                            while ((nuevoVideojuego = importarRanking.leer()) != null) {
                                listaVideojuegos.add(nuevoVideojuego);
                            }
                            importarRanking.cerrar();

                        }
                        catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }

                        break;
                    case 6:

                        try {
                            FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\src\\TEMA7\\EJERCICIOS\\EJERCICIOVIDEOJUEGO\\ranking.txt");

                            BufferedWriter output = new BufferedWriter(file);
                            for (Videojuego recorrerArraylist : listaVideojuegos) {
                                output.write(recorrerArraylist.toString());
                                output.newLine();
                            }
                            System.out.println("Ranking escrito con exito\n");
                            output.close();

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;

                }
            }
        }
    }

