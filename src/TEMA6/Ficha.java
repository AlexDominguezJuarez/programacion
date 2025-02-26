package TEMA6;

abstract class Ficha {

    private String titulo;
    private int numero;
    public Ficha(String titulo,int numero){
        this.titulo=titulo;
        this.numero=numero;
    }
    public void caracteristicas(){

    }


    public class Libro extends Ficha{
        private String autor;
        private String editorial;

        public Libro(String titulo, int numero,String autor,String editorial) {
            super(titulo, numero);
            this.autor=autor;
            this.editorial=editorial;
        }

        @Override
        public void caracteristicas(){
            System.out.println("Autor: "+this.autor+"/ Titulo: "+titulo+"/ Editorial: "+this.editorial);
        }
    }

    public class Revista extends Ficha{
        private int numeroPublicacion;
        private int añoPublicacion;

        public Revista(String titulo, int numero, int numeroPublicacion,int añoPublicacion) {
            super(titulo, numero);
            this.numeroPublicacion = numeroPublicacion;
            this.añoPublicacion=añoPublicacion;
        }
        @Override
        public void caracteristicas(){
            System.out.println("Titulo: "+titulo+"/ Numero de publicacion: "+this.numeroPublicacion+"/ Año de publicacion"+this.añoPublicacion);

        }
    }

    public class Dvd extends Ficha{

        enum tipoPelicula{
            ANMACION,ACCION,CIENCIA_FICCION,COMEDIA,TERROR
        }
        private String director;
        private int añoPublicacion;
        private tipoPelicula genero;

        public Dvd(String titulo, int numero, String director,int añoPublicacion,tipoPelicula genero) {
            super(titulo, numero);
            this.director = director;
            this.añoPublicacion=añoPublicacion;
            this.director=director;
            this.genero=genero;
        }
        @Override
        public void caracteristicas(){
            System.out.println("Titulo: "+titulo+"Director: "+this.director+"/ Año de publicacion"+this.añoPublicacion+"/ Genero: "+this.genero);

        }

    }

}
