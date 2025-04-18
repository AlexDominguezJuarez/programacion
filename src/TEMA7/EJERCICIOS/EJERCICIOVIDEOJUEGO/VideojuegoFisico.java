package TEMA7.EJERCICIOS.EJERCICIOVIDEOJUEGO;

public class VideojuegoFisico extends  Videojuego{

    enum UsoJuego{Nuevo,Usado}

    public UsoJuego estadoJuego;
    public String tiendaCompra;

    public VideojuegoFisico(UsoJuego estadoJuego,String tiendaCompra,int nota,String nombre,String plataforma) {
        this.plataforma=plataforma;
        this.nota=nota;
        this.nombre=nombre;
        this.estadoJuego = estadoJuego;
        this.tiendaCompra=tiendaCompra;
    }

    public UsoJuego getEstadoJuego() {
        return estadoJuego;
    }

    public void setEstadoJuego(UsoJuego estadoJuego) {
        this.estadoJuego = estadoJuego;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }


}
