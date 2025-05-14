package TEMA8.EJERCICIOS;

import com.sun.source.doctree.SeeTree;
import java.sql.*;
import java.util.Scanner;

public class Operaciones {

    public void listadoAsignaturasBDD () throws SQLException {
    Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

    String sentenciaSQL = "SELECT nombre_asignatura FROM Asignaturas;";
    PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

    ResultSet resultados = sentencia.executeQuery();

    while (resultados.next()) {
        String nombreAsignatura = resultados.getString("nombre_asignatura");
        System.out.println("Asignatura: " + nombreAsignatura);
    }

}

    public void estudiantesCasa () throws SQLException {

        String nombreCasa = in.nextLine();

        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        String sentenciaSQL = "SELECT nombre,apellido FROM Estudiante INNER JOIN Casa ON Estudiante.id_casa=Casa.id_casa WHERE Casa.nombre_casa='" + nombreCasa + "';";
        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        ResultSet resultados = sentencia.executeQuery();

        while (resultados.next()) {
            String apellido = resultados.getString("apellido");
            String nombre = resultados.getString("nombre");
            System.out.println("Estudiante: " + nombre + " " + apellido);
        }
    }

    public void mascotaEstudiante () throws SQLException {
        String nombreEstudiante = in.nextLine();
        in.nextLine();
        String apellidoEstudiante = in.nextLine();


        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        sentenciaSQL = "SELECT nombre_mascota FROM Mascota INNER JOIN Estudiante ON Estudiante.id_estudiante=Mascota.id_estudiante WHERE Estudiante.nombre='" + nombreEstudiante + "' AND Estudiante.apellido='" + apellidoEstudiante +
                "';";
        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        ResultSet resultados = sentencia.executeQuery();

        while (resultados.next()) {
            String nombre = resultados.getString("nombre_mascota");
            System.out.println("Mascota: " + nombre);
        }
    }


    public void numeroEstudiantesCasa () throws SQLException {
        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        sentenciaSQL = "SELECT Casa.nombre AS nombre_casa, COUNT(Estudiante.id_estudiante) AS numero_estudiantes\n" +
                "FROM Casa " +
                "LEFT JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa " +
                "GROUP BY Casa.id_casa, Casa.nombre " +
                "ORDER BY Casa.nombre;";

        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        ResultSet resultados = sentencia.executeQuery();

        while (resultados.next()) {
            String numeroAlumnos = resultados.getString("numero_estudiantes");
            String nombreCasa = resultados.getString("nombre_casa");
            System.out.println("Nombre de la casa: " + nombreCasa + "   Numero de alumnos: " + numeroAlumnos);
        }
    }

    public void insertarNuevoAlumno () throws SQLException {
        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        sentenciaSQL = "INSERT INTO Asignatura (nombre_asignatura,aula,obligatoria) VALUES('Programacion','aula 1',true);";

        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        int filasAfectadas = sentencia.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Se inserto el alumno con exito");
        }
    }

    public void actualizarAula () throws SQLException {
        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        System.out.print("Ingrese el ID de la asignatura: ");
        int idAula = in.nextInt();
        in.nextLine();

        System.out.print("Ingrese el nuevo nombre del aula: ");
        String nuevaAula = in.nextLine();

        sentenciaSQL = "UPDATE Asignatura SET aula='" + nuevaAula + "' WHERE id_asignatura=" + idAula + ";";

        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        int filasAfectadas = sentencia.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Se actualizó el aula con exito");
        }

        sentencia.close();
        con2.close();
    }

    public void eliminarAsignatura () throws SQLException {
        Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos", "postgres", "12345678");

        sentenciaSQL = "DELETE FROM Asignatura WHERE nombre_asignatura='Programacion';";

        PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL);

        int filasAfectadas = sentencia.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Se eliminó el alumno con exito");
        }
        sentencia.close();
        con2.close();
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String sentenciaSQL = "";




    }





}
