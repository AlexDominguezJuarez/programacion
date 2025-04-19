package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

public class Excepciones {

    // Excepción para errores de validación
    public static class NotaInvalidaException extends Exception {
        public NotaInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    // Excepción para errores de base de datos
    public static class JuegoNoEncontradoException extends Exception {
        public JuegoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }


}
