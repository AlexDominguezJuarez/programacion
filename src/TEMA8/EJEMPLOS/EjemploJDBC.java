package TEMA8.EJEMPLOS;
import java.sql.*;
public class EjemploJDBC {
    public static void main(String[] args){

        String sentenciaSQL = "SELECT * FROM Estudiante";
        //opcion 2: PreparedStatement
        try(Connection con2 = DriverManager.getConnection("jdbc:postgresql://magos.ctieiwmm6bkr.us-east-1.rds.amazonaws.com:5432/magos",
                "postgres",// tu usuario
                "12345678");  // tu contraseña
            PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)){

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String apellido = resultados.getString("apellido");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + nombre + " "+apellido);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}