package TEMA6;

public class Animal {

    private int altura;
    private String nombre;

    public Animal(String nombre,int altura){
        this.altura=altura;
        this.nombre=nombre;
    }
    public void comer(){
        System.out.println("Ñam,ñam,ñam");
    }
    public void dormir(){
        System.out.println("Zzzzz,zzzzz,zzzzz");
    }
    public void hacerRuido(){
        System.out.println("*Golpes en el suelo*");
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public class Perro extends Animal{

        public enum razaPerro{
            PASTOR_ALEMAN,HUSKI_SIBERIANO,BULLDOG,CHIHUAHUA
        }
        private razaPerro tipoDeRaza;
        private String color;

        public Perro(String nombre, int altura,razaPerro tipoDeRaza,String color) {
            super(nombre, altura);
            this.tipoDeRaza=tipoDeRaza;
            this.color=color;
        }

        public void ladrar(){
            System.out.println("GUAU,GUAU,GUAU");
        }

        public razaPerro getTipoDeRaza() {
            return tipoDeRaza;
        }

        public void setTipoDeRaza(razaPerro tipoDeRaza) {
            this.tipoDeRaza = tipoDeRaza;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    public class Gato extends Animal {

        enum razaGato {
            PERSA, AZUL_RUSO, SIAMES, SIBERIANO, BENGALÍ
        }

        private razaGato tipoGato;
        private String colorDeOjos;

        public Gato(String nombre, int altura, razaGato tipoGato, String colorDeOjos) {
            super(nombre, altura);
            this.tipoGato = tipoGato;
            this.colorDeOjos = colorDeOjos;
        }

        public void maullar(){
            System.out.println("Miau,miau,miau");
        }

        public razaGato getTipoGato() {
            return tipoGato;
        }

        public void setTipoGato(razaGato tipoGato) {
            this.tipoGato = tipoGato;
        }

        public String getColorDeOjos() {
            return colorDeOjos;
        }

        public void setColorDeOjos(String colorDeOjos) {
            this.colorDeOjos = colorDeOjos;
        }
    }

        public class Caballo extends Animal{

            private String latgariaCola;
            private int numeroDePotros;

            public Caballo(String nombre, int altura, String latgariaCola,int numeroDePotros) {
                super(nombre, altura);
                this.latgariaCola = latgariaCola;
                this.numeroDePotros=numeroDePotros;
            }


            public void relinchar(){
                System.out.println("Hiiii,hiiii,hiiii");
            }

            public String getLatgariaCola() {
                return latgariaCola;
            }

            public void setLatgariaCola(String latgariaCola) {
                this.latgariaCola = latgariaCola;
            }

            public int getNumeroDePotros() {
                return numeroDePotros;
            }

            public void setNumeroDePotros(int numeroDePotros) {
                this.numeroDePotros = numeroDePotros;
            }
        }

        public class Cabra extends Animal{

            private int numeroDeCabritillos;
            private String color;

            public Cabra(String nombre, int altura, int numeroDeCabritillos,String color) {
                super(nombre, altura);
                this.numeroDeCabritillos = numeroDeCabritillos;
                this.color=color;
            }

            public int getNumeroDeCabritillos() {
                return numeroDeCabritillos;
            }

            public void setNumeroDeCabritillos(int numeroDeCabritillos) {
                this.numeroDeCabritillos = numeroDeCabritillos;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }

        public class Gallina extends Animal{

        private int mediaHuevosMes;

            public Gallina(String nombre, int altura, int mediaHuevosMes) {
                super(nombre, altura);
                this.mediaHuevosMes = mediaHuevosMes;
            }
            public void cacareo(){
                System.out.println("Co,co,co");
            }

            public int getMediaHuevosMes() {
                return mediaHuevosMes;
            }

            public void setMediaHuevosMes(int mediaHuevosMes) {
                this.mediaHuevosMes = mediaHuevosMes;
            }
        }
}
