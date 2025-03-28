package TEMA7.EJERCICIOS;

public class PersonaMain {
    public static void main(String[] args) {

        Persona nuevaPersona=new Persona("Manolo",22);

        PersonaOutput escritura=new PersonaOutput();

        try {
            escritura.abrir();
            escritura.escribir(nuevaPersona);
            escritura.cerrar();

        }catch(Exception e){

        }


    }
}
