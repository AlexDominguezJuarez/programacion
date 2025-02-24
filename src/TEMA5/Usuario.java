package TEMA5;

public class Usuario {
    private String nombre="";
    private int edad=0;
    private String dni="";
    public Usuario(String nombreUsuario,String dni,int edad){
        this.nombre=nombreUsuario;
        this.edad=edad;
        this.dni=dni;
    }

    public void mostrarDatos(){
        System.out.print("Nombre: "+this.nombre);
        System.out.print("  DNI: "+this.dni);
        System.out.print("  Edad: "+this.edad);
    }

    public String getNombreUsuario() {
        return nombre;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombre = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
