package mtb;

public class Bicicleta2 {
    public int velocidad;

    public Bicicleta2(int velocidadIni) {
        velocidad = velocidadIni;
    }

    public void frenar(int decremento) { //aplicar freno
        velocidad -= decremento;
    }

    public void acelerar(int incremento) {  //acelerar
        velocidad += incremento;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
