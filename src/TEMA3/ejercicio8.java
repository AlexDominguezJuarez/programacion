package TEMA3;

import java.util.Scanner;

public class ejercicio8 {

    public static boolean comprobacion_dia_y_mes(int dia,int mes){
        boolean comprobacion = true;

        if (mes<1|mes>12 | dia <1) {
            comprobacion=false;
        }


        if ((mes == 1) || (mes == 3) || (mes ==5) || (mes==7) ||(mes== 8) ||(mes== 10) ||(mes==12)) {
            if (dia < 1 | dia > 31) {
                comprobacion = false;
            }
        }

        if ((mes == 4) || (mes == 6) || (mes ==9) || (mes==11)) {
            if (dia < 1 | dia > 30) {
                comprobacion = false;
            }
        }

        if (mes == 2) {
            if (dia < 1 | dia > 28) {
                comprobacion = false;
            }
        }

        return comprobacion;
    }




    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("INTRODUCE EL DIA DE LA FECHA A CALCULAR");
        int dia=in.nextInt();
        System.out.println("INTRODUCE EL MES DE LA FECHA A CALCULAR");
        int mes=in.nextInt();
        boolean fecha_adecuada=comprobacion_dia_y_mes(dia,mes);
        if (fecha_adecuada==true){
            System.out.println("LA FECHA INTRODUCIDA ES VALIDA");

        }
        if (fecha_adecuada==false){
            System.out.println("LA FECHA INTRODUCIDA NO ES VALIDA");
        }
    }
}
