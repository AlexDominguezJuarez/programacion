package TEMA4;

import java.util.Scanner;

public class Reloj{
    private int horas;
    private int minutos;
    private int segundos;
    private  boolean amOPm;

    public Reloj(){
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
        this.amOPm=true;
    }

    public Reloj(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.amOPm=amOPm;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isAmOPm() {
        return amOPm;
    }

    public void setAmOPm(boolean amOPm) {
        this.amOPm = amOPm;
    }
    public String toString(int horas,int minutos,int segundos,boolean amOPm){
        if(amOPm=true){
            if (horas>12){
                horas=horas-12;
                return (horas+":"+minutos+":"+segundos);
            }
        }else{
            return (horas+":"+minutos+":"+segundos);

        }

        return "";
    }
}