package TEMA3;

import java.util.Scanner;

public class MyMath {
    public static double squarePerimetre(double lado_cuadrado){
        double perimetro=lado_cuadrado*4;
        return perimetro;
    }
    public static double squareArea(double lado_cuadrado){
        double area=lado_cuadrado*2;
        return area;
    }
    public static double rectanglePerimeter(double lado_triangulo){
        double perimetro=lado_triangulo*3;
        return perimetro;
    }
    public static double rectangeArea(double base, double altura){
        double area=base*altura;
        return area;
    }
    public static double circlePerimetre(double radio){
        double perimetro=2*3.1416*radio;
        return perimetro;
    }
    public static double circleArea(double radio){
        double area=(radio*radio)*3.1416;
        return area;
    }
    public static boolean es_primo(int numero){
        Scanner in=new Scanner(System.in);
        int numero_introducido=in.nextInt();
        boolean primo = true;
        int numero2 = numero - 1;


        for (int i = numero; numero2 >= 2; numero2--) {


            if (i%numero2 == 0) {

                primo = false;
                i = 2;

            }

        }
        return primo;
    }
    public static boolean no_es_primo(int numero){
        boolean es_primo=es_primo(numero);
        if (es_primo==true){
            return false;

        }else {
            return true;
        }

    }


}
