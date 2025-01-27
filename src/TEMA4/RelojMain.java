package TEMA4;

import java.util.Scanner;



public class RelojMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora=in.nextInt();
        System.out.println("Introduce los minutos");
        int minutos= in.nextInt();
        System.out.println("Introduce los segundos");
        int segundos=in.nextInt();
        boolean pm=false;
        if (hora>12) pm=true;

        Reloj reloj3Variables=new Reloj(hora,minutos,segundos);
        reloj3Variables.setHoras(hora);
        reloj3Variables.setMinutos(minutos);
        reloj3Variables.setSegundos(segundos);

        String printear=reloj3Variables.toString(hora,minutos,segundos,pm);
        System.out.println(printear);



    }
}
