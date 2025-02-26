package TEMA6;

public class Vehiculo {
    private String color;
    private String marca;
    private int ruedas;

    public Vehiculo(String marca, String color, int ruedas) {
        this.color = "";
        this.ruedas = 0;
        this.marca = "";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public class Turismo extends Vehiculo {

        enum TipoVehiculo {
            PROFESIONAL, PARTICULAR
        }

        private int numeroPlazas;
        private TipoVehiculo particularOProfesional;

        public Turismo(String marca, String color, int ruedas, int numeroPlazas, TipoVehiculo particularOProfesional) {
            super(marca, color, ruedas);
            this.numeroPlazas = 5;
            this.particularOProfesional = particularOProfesional;
        }

        public int getNumeroPlazas() {
            return numeroPlazas;
        }

        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }

        public TipoVehiculo getParticularOProfesional() {
            return particularOProfesional;
        }

        public void setParticularOProfesional(TipoVehiculo particularOProfesional) {
            this.particularOProfesional = particularOProfesional;
        }

    }

    public class Camion extends Vehiculo {

        enum Mercancia {
            MERCANCIA_PELIGROSA, MERCANCIA_NO_PELIGROSA
        }

        private Mercancia tipoMercancia;
        private int pesoMaximo;


        public Camion(String marca, String color, int ruedas, int pesoMaximo, Mercancia tipoMercancia) {
            super(marca, color, ruedas);
            this.pesoMaximo = pesoMaximo;
            this.tipoMercancia = tipoMercancia;
        }

        public Mercancia getTipoMercancia() {
            return tipoMercancia;
        }

        public void setTipoMercancia(Mercancia tipoMercancia) {
            this.tipoMercancia = tipoMercancia;
        }

        public int getPesoMaximo() {
            return pesoMaximo;
        }

        public void setPesoMaximo(int pesoMaximo) {
            this.pesoMaximo = pesoMaximo;
        }

    }

    public class CicloMotor extends Vehiculo{

        enum Carnet{
            NECESITA_CARNET,NO_NECESITA_CARNET
        }

        private int cilindradaMotor;
        private Carnet necesitaCarnet;


        public CicloMotor(String marca, String color, int ruedas,int cilindradaMotor,Carnet necesitaCarnet) {
            super(marca, color, ruedas);
            this.cilindradaMotor=cilindradaMotor;
            this.necesitaCarnet=necesitaCarnet;

        }

        public int getCilindradaMotor() {
            return cilindradaMotor;
        }

        public void setCilindradaMotor(int cilindradaMotor) {
            this.cilindradaMotor = cilindradaMotor;
        }

        public Carnet getNecesitaCarnet() {
            return necesitaCarnet;
        }

        public void setNecesitaCarnet(Carnet necesitaCarnet) {
            this.necesitaCarnet = necesitaCarnet;
        }
    }
}
