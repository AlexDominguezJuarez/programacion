package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

public class VideojuegoDigital extends Videojuego {

    public String tiendaDigital;
    public double tamañoGB;

    public VideojuegoDigital(String tiendaDigital,double tamañoGB,String nombre,String plataforma,int nota) {
        this.plataforma=plataforma;
        this.nota=nota;
        this.nombre=nombre;
        this.tamañoGB=tamañoGB;
        this.tiendaDigital = tiendaDigital;
    }

    public String getTiendaDigital() {
        return tiendaDigital;
    }

    public void setTiendaDigital(String tiendaDigital) {
        this.tiendaDigital = tiendaDigital;
    }

    public double getTamañoGB() {
        return tamañoGB;
    }

    public void setTamañoGB(double tamañoGB) {
        this.tamañoGB = tamañoGB;
    }
}
