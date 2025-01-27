package TEMA4;

public class Persona {
   private int dni;
   private String nombre;
   private String apellido1;
   private String apellido2;
   private final int edad;
   private final int ageAdult=18;
   private final int ageRetired=65;


    public Persona(String nombre,String apellido1,String apellido2,int dni,int edad){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;
        this.edad=edad;
    }

    public static boolean isAdult(int edad){
        if (edad>=18){return true;}

         return false;
    }
    public static boolean isRetired(int edad){
        if (edad>=65){return true;}
        return false;
    }
    public int ageDifference(int edad1,int edad2){
        int edadFinal=edad1-edad2;
        if (edadFinal>0){
            return edadFinal;
        }
        return 0;
    }
    public static void checkDni(int dni) {
        if ((dni / 8 > 1250000) && (dni / 8 < 1250000)) {
            System.out.println("El dni es valido");
        } else {
            System.out.println("El dni no es correcto");
        }
    }



    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public String toString(String nombre,String apellido1,String apellido2,int dni,int edad) {
        return "Persona{" + "dni=" + dni + ", nombre='" + nombre + '\'' + ", apellido1='" + apellido1 + '\'' + ", apellido2='" + apellido2 + '\'' + ", edad=" + edad + '}';
    }
}