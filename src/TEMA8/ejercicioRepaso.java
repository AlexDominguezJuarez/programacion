package TEMA8;


import java.sql.*;
import java.util.Scanner;

public class ejercicioRepaso {
    public static void menu(){

        System.out.println("PULSE:");
        System.out.println("1. Seleccionar los nombres y apellidos de todos los profesores.");
        System.out.println("2. Seleccionar los nombres y apellidos de los estudiantes nacidos después del 1 de enero de 1980");
        System.out.println("3. Para Muestra los nombres y apellidos de los estudiantes, ordenados por su fecha de nacimiento de " + "forma ascendente.");
        System.out.println("4. Para Muestra cuántos estudiantes hay en cada casa, mostrando el nombre de la casa y el número de estudiantes.");
        System.out.println("5. Calcula la calificación media y la calificación máxima en la asignatura \"Pociones\".");
        System.out.println("6. Muestra todos los años de curso sin duplicados.");
        System.out.println("7. Selecciona los nombres de los estudiantes cuyo apellido empieza con la letra \"P\".");
        System.out.println("8. Muestra los nombres y apellidos de los estudiantes que están en su 4º o 5º año.");
        System.out.println("9. Selecciona los nombres y apellidos de los estudiantes que están en el 5º año y pertenecen a las casas Gryffindor o Slytherin.");
        System.out.println("10. Muestra los nombres y apellidos de los estudiantes que están en su 4º o 5º año.");
        System.out.println("11. Muestra los primeros 5 estudiantes ordenados por su fecha de nacimiento.");
        System.out.println("12. Inserta un nuevo estudiante llamado \"Nymphadora Tonks\" en la casa Slytherin (id_casa = 4) en el 7º año, con fecha de nacimiento '1973-11-25'.");
        System.out.println("13. Cambia el jefe de la casa Hufflepuff a Pomona Sprout.");
        System.out.println("14. Elimina al estudiante con nombre \"Tom Riddle\".");
        System.out.println("15. Selecciona los nombres y apellidos de los estudiantes junto con el nombre de su casa.");
        System.out.println("16. Muestra los nombres de los estudiantes junto con los nombres de las mascotas y las asignaturas que cursan. Incluye a los estudiantes que no tienen mascota");
        System.out.println("17. Muestra los nombres de los estudiantes que tienen una calificación superior al promedio en la asignatura \"Encantamientos\"");
        System.out.println("18. Muestra los nombres de las casas que tienen un número promedio de calificaciones superior a 7 en las asignaturas de los estudiantes de esa casa");

    }

    public static void main(String[] args) throws SQLException {
        Scanner in =new Scanner(System.in);

        String sentenciaSQL="";

        try {
            Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres","12345678");


        menu();
            int eleccion=in.nextInt();

        switch (eleccion){
            case 1:
                sentenciaSQL="SELECT * FROM Profesor;";

                PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

                ResultSet resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Profesor: " + nombre + " "+apellido);
                }

                break;
            case 2:
                sentenciaSQL="SELECT * FROM Estudiante WHERE fecha_nacimiento > '1/1/1980';";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 3:
                sentenciaSQL="SELECT * FROM Estudiante ORDER BY fecha_nacimiento ASC ;";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 4:

                break;
            case 5:
                sentenciaSQL="SELECT AVG(calificacion) AS media,MAX(calificacion) AS maxima FROM Estudiante_Asignatura WHERE id_asignatura=2;";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String media = resultados.getString("media");
                    String maxima = resultados.getString("maxima");
                    System.out.println("Nota media: " + media + " / Nota maxima: "+maxima);
                }
                break;
            case 6:

                break;
            case 7:
                sentenciaSQL="SELECT * FROM Estudiante WHERE apellido LIKE 'P%';";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 8:
                sentenciaSQL="SELECT * FROM Estudiante WHERE anyo_curso IN (4,5);";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 9:
                sentenciaSQL="SELECT * FROM Estudiante WHERE anyo_curso IN (4,5) AND id_casa IN (1,4);";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 10:
                sentenciaSQL="SELECT * FROM Estudiante WHERE fecha_nacimiento > '1/1/1980' LIMIT 5;";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 11:
                sentenciaSQL="SELECT * FROM Estudiante WHERE fecha_nacimiento > '1/1/1980';";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                while(resultados.next()){
                    String apellido = resultados.getString("apellido");
                    String nombre = resultados.getString("nombre");
                    System.out.println("Estudiante: " + nombre + " "+apellido);
                }
                break;
            case 12:
                break;
            case 13:
                sentenciaSQL="UPDATE Casa SET ";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                System.out.println("Estudiante eliminado");
                break;
            case 14:
                sentenciaSQL="DELETE FROM Estudiante WHERE nombre='Tom' and apellido'Riddle';";

                sentencia = con2.prepareStatement(sentenciaSQL);

                resultados = sentencia.executeQuery();

                System.out.println("Estudiante eliminado");

                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
        }
    }catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}
