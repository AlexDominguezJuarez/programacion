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
    public static double rectanglePerimeter(double lado_rectangulo, double lado_rectangulo2){
        double perimetro=lado_rectangulo*2+lado_rectangulo2*2;
        return perimetro;
    }
    public static double rectangleArea(double base, double altura){
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

    public static int digitos_de_un_numero(int numero){
        int contador=1;
        while (numero>10){
            contador++;
            numero=numero/10;
        }
        return contador;
    }

    public static int digitos_pares(int numero) {

        int variable;
        int contador = -1;
        int cifra = 0;
        int cifra_final = 0;
        int cantidad_bucle = numero;
        int cantidad = 1;
        int veces_a_dividir = digitos_de_un_numero(numero);
        while (veces_a_dividir >= 1) {
            cantidad = cantidad * 10;
            veces_a_dividir--;
        }
        while (numero > 0) {
            cantidad_bucle = numero / cantidad;
            cifra = Math.round(cantidad_bucle);
            cifra_final = cifra_final + cifra;
            variable = cifra * cantidad;
            numero = numero - variable;
            numero = Math.round(numero);
            cantidad_bucle=numero;
            cantidad = cantidad / 10;
            if (cifra%2==0) {
                contador++;

            }

        }
        return contador;

    }

    public static int digitos_impares(int numero){
        int variable;
        int contador = 0;
        int cifra = 0;
        int cifra_final = 0;
        int cantidad_bucle = numero;
        int cantidad = 1;
        int veces_a_dividir = digitos_de_un_numero(numero);
        while (veces_a_dividir >= 1) {
            cantidad = cantidad * 10;
            veces_a_dividir--;
        }
        while (numero > 0) {
            cantidad_bucle = numero / cantidad;
            cifra = Math.round(cantidad_bucle);
            cifra_final = cifra_final + cifra;
            variable = cifra * cantidad;
            numero = numero - variable;
            numero = Math.round(numero);
            cantidad = cantidad / 10;
            if (cifra%2==1) {
                contador++;

            }

        }



        return contador;

    }

    public static int factorial(int numero){
        int resultado=1;
        for (int i =numero;numero>1;numero--){
            resultado = numero*resultado;
        }
        return resultado;
    }

    public static void factorial_recursivo (){
        Scanner in=new Scanner(System.in);
       ;
       int numero;
        int eleccion=1;


        while (eleccion==1) {   System.out.println("INTRODUCE EL NUMERO DEL CUAL QUIERES SABER SU FACTORIAL");
        numero=in.nextInt();
            int resultado=1;
            for (int i = numero; numero> 1; numero--) {
                resultado = numero * resultado;
            }
            System.out.println("EL RESULTADO DEL FACTORIAL ES: " + resultado);
            System.out.println("PULSE 1 SI QUIERE CALCULAR EL FACTORIAL DE OTRO NUMERO, PULSE 2 SI QUIERE SALIR");
            eleccion = in.nextInt();
        }

    }

    public static int resultados_ecuacion_segundo_grado(int numero_exponente2,int numero_exponente1, int numero_exponente0){
        int numero_resultados=0;
        int a=numero_exponente2;
        int b=numero_exponente1;
        int c=numero_exponente0;
        double discriminante=b*2 - 4*a*c;
        if (discriminante<0){
            numero_resultados=0;
        }
        if (discriminante>0){
            numero_resultados=2;
        }
        if (discriminante==0){
            numero_resultados=1;
        }
        return numero_resultados;
    }
    public static int suma_de_digitos(int numero){
        int variable;
        int cifra=0;
        int cifra_final=0;
        int cantidad_bucle=numero;
        int cantidad=1;
        int veces_a_dividir=digitos_de_un_numero(numero);
        while (veces_a_dividir >= 1){
            cantidad=cantidad*10;
            veces_a_dividir--;
        }
        while (numero>10){
            cantidad_bucle=numero/cantidad;
            cifra=Math.round(cantidad_bucle);
            cifra_final=cifra_final+cifra;
            variable=cifra*cantidad;
            numero=numero-variable;
            numero=Math.round(numero);
            cantidad=cantidad/10;


        }
        cifra_final=cifra_final+numero;

        return cifra_final;
    }
}