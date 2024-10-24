package condicionales;

import java.util.Scanner;

public class ejercico13 {
    public static void main(String[] args) {
        System.out.println("introduce las horas");
        Scanner in= new Scanner(System.in);
        int horas= in.nextInt();
        int minutos= in.nextInt();
        int segundos=in.nextInt();
        segundos=segundos+1;
        if (segundos==60){
            segundos=0;
            minutos=minutos+1;
            if (minutos==60){
                minutos=0;
                horas=(horas+1);

            }
        }
        System.out.println("La hora mas un segundo es "+horas +" "+ minutos+" "+segundos);
    }
}
