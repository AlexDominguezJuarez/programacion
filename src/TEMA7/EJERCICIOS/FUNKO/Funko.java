package TEMA7.EJERCICIOS.FUNKO;

import java.io.Serializable;

public class Funko implements Serializable {

    private String codigo;
    private String modelo;
    private String nombre;
    private String precio;
    private String fechaLanzamiento;


    public Funko(String codigo, String nombre, String modelo, String precio, String fechaLanzamiento) {
        this.codigo = codigo;
        this.modelo=modelo;
        this.nombre=nombre;
        this.precio=precio;
        this.fechaLanzamiento=fechaLanzamiento;
    }


    @Override
    public String toString() {
        return
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                ", fecha de lanzamiento='" + fechaLanzamiento + '\'';
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
