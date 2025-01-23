package TEMA4;

import java.util.Scanner;

public class Reloj{
     int horas=0;
     int minutos=0;
     int segundos=0;
     boolean pm;

    public int getHoras() {
        System.out.println("Introduce las horas");
        Scanner in=new Scanner(System.in);
        int hora=in.nextInt();
        return horas;
    }

    public int getMinutos() {
        System.out.println("Introduce los minutos");
        Scanner in =new Scanner(System.in);
        int minutos=in.nextInt();
        return minutos;
    }

    public int getSegundos() {
        System.out.println("Introduce los segundos");
        Scanner in=new Scanner(System.in);
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;

    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    public Reloj(){
        getHoras();
        getMinutos();
        getSegundos();

     }

    public static void main(String[] args) {

         Reloj reloj=new Reloj();
         System.out.println(reloj);

    }
}