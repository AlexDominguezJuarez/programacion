package TEMA3;

import java.util.Scanner;

import static TEMA3.MyMath.*;


public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int numero;
        int eleccion_menu = 0;
        System.out.println("PULSE 1 SI QUIERE CALCULAR EL AREA O PERIMETRO DE ALGUNA FIGURA");
        System.out.println("PULSE 2 SI QUIERE SABER SI UN NUMERO ES PRIMO O NO");
        System.out.println("PULSE 3 SI QUIERE SABER EL NUMEROS DE DIGITOS DE UN NUMERO");
        System.out.println("PULSE 4 SI QUIERE SABER LOS NUMEROS PARES DENTRO DE UN NUMERO");
        System.out.println("PULSE 5 SI QUEIRE SABER LOS NUMEROS IMPARES DENTRO DE UN NUMERO");
        System.out.println("PULSE 6 SI QUIERE SABER EL FACTORIAL DE UN NUMERO");
        System.out.println("PULSE 7 SI QUIERE SABER CUANTAS SOLUCIONES TIENE UNA ECUACION DE SEGUNDO GRADO A INTRODUCIR");
        System.out.println("PULSE 8 SI QUIERE SABER LA SUMA DE LOS DIGITOS DE UN NUMERO");
        eleccion_menu=scanner.nextInt();
        switch (eleccion_menu) {
            case 1:

                int eleccion_menu2;
                System.out.println("HAS SELECCIONADO CALCULADORA DE AREA O PERIMETRO");
                System.out.println("PULSE 1 PARA CALCULAR EL PERIMETRO DE UN CUADRADO");
                System.out.println("PULSE 2 PARA CALCULAR EL AREA DE UN CUADRADO");
                System.out.println("PULSE 3 PARA CALCULAR EL AREA DE UN RECTANGULO");
                System.out.println("PULSE 4 PARA CALCULAR EL PERIMETRO DE UN RECTANGULO");
                System.out.println("PULSE 5 PARA CALUCULAR EL AREA DE UN CIRCULO");
                System.out.println("PULSE 6 PARA CALCULAR EL PERIMETRO DE UN CICRCULO");
                eleccion_menu2 = scanner.nextInt();


                switch (eleccion_menu2) {
                    case 1:
                        double lado;

                        System.out.println("INTRODUCE EL LADO DEL CUADRADO");
                        lado = scanner.nextDouble();
                        double perimetro = squarePerimetre(lado);
                        System.out.println("EL PERIMETRO ES " + perimetro);

                        break;
                    case 2:


                        System.out.println("INTRODUCE EL LADO DEL CUADRADO");
                        lado = scanner.nextDouble();
                        double area = squareArea(lado);
                        System.out.println("EL AREA ES " + area);

                        break;
                    case 3:

                        System.out.println("INTRODUCE UN LADO DEL RECTANGULO");
                        lado = scanner.nextDouble();
                        System.out.println("INTRODUCE EL OTRO LADO DEL TRIANGULO");
                        double lado2 = scanner.nextDouble();
                        area = rectangleArea(lado, lado2);
                        System.out.println("EL AREA ES " + area);


                        break;
                    case 4:
                        System.out.println("INTRODUCE LA BASE DEL RECTANGULO");
                        lado = scanner.nextDouble();
                        System.out.println("INTRODUCE LA ALTURA DEL TRIANGULO");
                        lado2 = scanner.nextDouble();
                        perimetro = rectanglePerimeter(lado, lado2);
                        System.out.println("EL PERIMETRO ES " + perimetro);


                        break;
                    case 5:
                        System.out.println("INTRODUCE EL RADIO DEL CIRCULO");
                        double radio = scanner.nextDouble();
                        area = circleArea(radio);
                        System.out.println("EL AREA ES " + area);

                        break;
                    case 6:
                        System.out.println("INTRODUCE EL RADIO DEL CIRCULO");
                        radio = scanner.nextDouble();
                        perimetro = circlePerimetre(radio);
                        System.out.println("EL AREA ES " + perimetro);

                        break;

                }
                break;

            case 2:
                System.out.println("HAS SELECCIONADO SABER SI UN NUMERO ES PRIMO O NO");
                System.out.println("INTRODUCE EL NUMERO A CALCULAR");
                numero = scanner.nextInt();
                boolean primo = es_primo(numero);
                if (primo == true) {
                    System.out.println("EL NUMERO ES PRIMO");
                } else {
                    System.out.println("EL NUMERO NO ES PRIMO");
                }
                break;


            case 3:
                System.out.println("HAS SELECCIONADO SABER CUANTOS DIGITOS TIENE UN NUMERO");
                System.out.println("INTRODUCE EL NUMERO A CALCULAR");
                numero=scanner.nextInt();
                int numero_digitos=digitos_de_un_numero(numero);
                System.out.println("EL NUMERO DE DIGITOS DEL NUMERO ES: "+numero_digitos);


                break;

            case 4:
                System.out.println("HAS SELECCIONADO SABER LOS NUMEROS PARES DENTRO DE UN NUMERO");
                System.out.println("INTRODUCE EL NUMERO");
                numero=scanner.nextInt();
                int numeros_pares=digitos_pares(numero);
                System.out.println("LA SUMA DE LOS DIGITOS PARES ES: "+numeros_pares);


                break;

            case 5:
                System.out.println("HAS SELECCIONADO SABER LOS NUMEROS IMPARES DENTRO DE UN NUMERO");
                System.out.println("INTRODUCE EL NUMERO A CALCULAR");
                numero=scanner.nextInt();
                int numeros_impares=digitos_impares(numero);
                System.out.println("LA SUMA DE LOS DIGITOS IMPARES ES: "+numeros_impares);

                break;

            case 6:
                System.out.println("HAS SELECCIONADO CALCULAR EL FACTORIAL DE UN NUMERO");



                factorial_recursivo();


                break;

            case 7:
                System.out.println("HAS SELECCINADO CALCULAR CUANTOS RESULTADOS TIENE UNA ECUACION DE SEGUNDO GRADO");
                System.out.println("INTRODUCE EL NUMERO CON INCOGNITA ELEVADO A 2");
                int numero2=scanner.nextInt();
                System.out.println("INTRODUCE EL NUMERO CON INCOGNITA ELEVADA A 1");
                int numero1=scanner.nextInt();
                System.out.println("INTRODUCE EL NUMERO SIN INCOGNITA");
                int numero0=scanner.nextInt();
                int numero_resultados=resultados_ecuacion_segundo_grado(numero2,numero1,numero0);
                System.out.println("LA ECUACION INTRODUCIDA TIENE "+numero_resultados+" RESULTADOS POSIBLES");
                break;

            case 8:
                System.out.println("HAS SELECCIONADO CALCULAR LA SUMA DE LOS DIGITOS DE UN NUMERO");
                System.out.println("INTRODUCE UN NUMERO");
                numero=scanner.nextInt();
                int resultado=digitos_de_un_numero(numero);
                System.out.println("EL RESULTADO ES: "+resultado);

                break;

        }

    }
}