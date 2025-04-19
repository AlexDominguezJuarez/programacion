package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

import java.util.ArrayList;
import java.util.List;

public class Validadores {

    private List<String> juegos = new ArrayList<>();


    public void validarNumero(int numero) throws Excepciones.NotaInvalidaException{
        if (numero < 1 || numero > 10) {
            throw new Excepciones.NotaInvalidaException("El número debe estar entre 1 y 10. Ingresaste: " + numero);
        }
    }
    public void mostrarJuego(String nombre) throws Excepciones.JuegoNoEncontradoException {
        if (!juegos.contains(nombre)) {
            throw new Excepciones.JuegoNoEncontradoException("Juego no encontrado: " + nombre);
        }
        System.out.println("Mostrando juego: " + nombre);
    }

    public void eliminarJuego(String nombre) throws Excepciones.JuegoNoEncontradoException {
        if (!juegos.remove(nombre)) {
            throw new Excepciones.JuegoNoEncontradoException("No se puede eliminar. Juego no encontrado: " + nombre);
        }
        System.out.println("Juego eliminado: " + nombre);
    }
}
