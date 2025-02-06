package TEMA4;

import java.util.Scanner;

public class PersonaBanco {
    private String dni="";
    private int [] cuentasBancarias;
    private int numeroDeCuentas=0;
    private boolean moroso=false;

    public PersonaBanco(int []cuentasBancarias,String dni,int numeroDeCuentas,boolean moroso){
        this.cuentasBancarias=cuentasBancarias;
        this.dni=dni;
        this.numeroDeCuentas=numeroDeCuentas;
        this.moroso=moroso;
    }
    public void crearCuentaBancaria(){
        Scanner in =new Scanner(System.in);
        if (this.numeroDeCuentas>3){
            System.out.println("Lo siento, no puedes crear mas cuentas");
        }else{
            this.numeroDeCuentas++;
            System.out.println("Introduce el nuevo numero de cuenta");
            int nuevaCuenta=in.nextInt();
            switch (this.numeroDeCuentas){
                case 0:
                    this.cuentasBancarias[0]=nuevaCuenta;
                    break;
                case 1:
                    this.cuentasBancarias[1]=nuevaCuenta;

                    break;
                case 2:
                    this.cuentasBancarias[2]=nuevaCuenta;

                    break;
            }

        }

    }
    public void morosidad(int []cuentasBancarias,boolean moroso){
        for (int i=0;i<cuentasBancarias.length;i++){
            if (cuentasBancarias[i]<0){
                System.out.println("Tu saldo es negativo, has entrado en la lista de  M O R O S O S");
                this.moroso=true;
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("DNI: "+this.dni+"\nNumero de cuentas: "+this.numeroDeCuentas);
        if (this.moroso==true){
            System.out.println("MOROSO: Si");
        }else {
            System.out.println("MOROSO: No");
        }for (int i =0;i<this.numeroDeCuentas;i++){
            System.out.print(cuentasBancarias[i]);
        }
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public int getNumeroDeCuentas() {
        return numeroDeCuentas;
    }

    public void setNumeroDeCuentas(int numeroDeCuentas) {
        this.numeroDeCuentas = numeroDeCuentas;
    }

    public int[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(int[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
