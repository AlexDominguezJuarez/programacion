package TEMA8;
import java.sql.*;
public class EjemploJDBC {
    public static void main(String[] args){

        String sentenciaSQL = "SELECT * FROM personas";
        //opcion 2: PreparedStatement
        try(Connection con2 = DriverManager.getConnection("jdbc:postgresql://adpostgre.c3hikjl98h8r.us-east-1.rds.amazonaws.com:5432/adpostgres",
                "postgre",// tu usuario
                "12345678");  // tu contraseña
            PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)){

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String dni = resultados.getString("dni");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + dni + ", " + nombre);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}