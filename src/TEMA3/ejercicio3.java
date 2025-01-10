package TEMA3;

import java.util.Scanner;

public class ejercicio3 {
    public static boolean validRadius(double radio){
        boolean radio_correcto=true;
        if (radio>0){
            radio_correcto=false;
        }
        return radio_correcto;
    }
    public static double calculate_circle_area(double radio){
        double area=(radio*radio)*3.1416;
        return area;

    }
    public static double calculate_circle_perimetre(double radio){
        double perimetro=2*3.1416*radio;
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("INTRODUCE EL RADIO DEL CIRULO");
        double radio;
        radio=in.nextDouble();
        boolean validacion=validRadius(radio);
        while (validacion==true){
            System.out.println("RADIO INCORRECTO, INTRODUCELO DE NUEVO");
            radio=in.nextDouble();
            validacion=validRadius(radio);
        }
        System.out.println("¿QUE QUIERES CALCULAR?");
        System.out.println("1. AREA");
        System.out.println("2. PERIMETRO");
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                double area= calculate_circle_area(radio);
                System.out.println("EL AREA DEL CIRCULO ES: "+area);
                break;
            case 2:
                double perimetro=calculate_circle_perimetre(radio);
                System.out.println("EL PERIMETRO DEL CIRCULO ES: "+perimetro);
                break;
        }


    }
}
