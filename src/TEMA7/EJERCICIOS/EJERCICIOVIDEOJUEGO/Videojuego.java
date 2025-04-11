package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

import java.io.Serializable;

abstract class Videojuego implements Serializable {

    public String nombre;
    public String plataforma;
    public int nota;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }
}

