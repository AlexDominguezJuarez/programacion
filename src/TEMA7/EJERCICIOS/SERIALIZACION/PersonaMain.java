package TEMA7.EJERCICIOS.SERIALIZACION;

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

        Persona persona;
        PersonaInput entrada;

        entrada = new PersonaInput();
        try {
            entrada.abrir();
            do{
                persona = entrada.leer();

            }while ((persona!=null));
            entrada.cerrar();
        }catch (Exception e){

        }
    }
}
