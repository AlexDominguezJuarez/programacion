package condicionales;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("introduce 2 numeros");
        Scanner in=new Scanner(System.in);
        double numero1= in.nextDouble();
        double numero2=in.nextDouble();
        if (numero1>numero2){
            double numero_final=(numero1-numero2);

        }else{
            double numero_final=(numero2-numero1);
            System.out.println("el resultado de restar el numero mas pequeño al mas mayor es "+numero_final);
        }
    }
}
