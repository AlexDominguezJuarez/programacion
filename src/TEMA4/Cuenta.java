package TEMA4;

import java.util.Scanner;

public class Cuenta {
    private int numeroDeCuenta=0;
    private int saldoCuenta=0;

    public Cuenta(int numeroDeCuenta,int saldoCuenta){

        this.numeroDeCuenta=numeroDeCuenta;
        this.saldoCuenta=saldoCuenta;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void consultarSaldo(int saldoCuenta){
        System.out.println("El saldo de la cuenta que tienes es "+this.getSaldoCuenta()+"€");
    }
    public void pagarRecibo(int dni2,int numeroDeCuenta2,int saldoCuenta2,int dni,int numeroDeCuenta,int saldoCuenta){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce el dinero a pagar");
        int importeAPagar=in.nextInt();
        this.saldoCuenta-=importeAPagar;
        saldoCuenta2+=importeAPagar;
    }
    public void recibirNominas(PersonaBanco persona,int dinero){

        this.saldoCuenta=+dinero;
    }
    public void pagar(PersonaBanco persona,int dineroAPagar){
        this.saldoCuenta=-dineroAPagar;
    }

    public void transferencia(PersonaBanco personaPaga,PersonaBanco personaRecibe,int dineros,Cuenta cuentaPaga){
        this.saldoCuenta=+dineros;
        cuentaPaga.saldoCuenta=-dineros;


    }
}
