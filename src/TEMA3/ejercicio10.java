package TEMA3;

import java.util.Scanner;


import static TEMA3.ejercicio1.numberSign;
import static TEMA3.ejercicio2.isAdult;
import static TEMA3.ejercicio3.calculate_circle_area;
import static TEMA3.ejercicio3.calculate_circle_perimetre;
import static TEMA3.ejercicio5.tabla_de_multiplicar;
import static TEMA3.ejercicio7.calcular_numero_primo;
import static TEMA3.ejercicio8.comprobacion_dia_y_mes;
import static TEMA3.ejercicio4.showMenu;
import static TEMA3.ejercicio9.piramide;



public class ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("SELECCIONA LA OPCION QUE QUIERES USAR");
        System.out.println("1. Muestra el signo de un número introducido por el usuario.");
        System.out.println("2. Indica si el usuario es mayor de edad o no.");
        System.out.println("3. Calcula el área y perímetro de un círculo.");
        System.out.println("4. Conversor de euros a dólares y de dólares a euros.");
        System.out.println("5. Mostrar tabla de multiplicar de un número.");
        System.out.println("6. Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("7. Comprobador de números primos.");
        System.out.println("8. Comprobador de fechas");
        System.out.println("9. Dibujar triángulos.");
        int eleccion = in.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SI ES POSITIVO(SE MOSTRARA +1), NEGATIVO(SE MOSTRARA -1) O NUEUTRO (SE MOSTRARA 0)");
                int numero_introducido = in.nextInt();
                int devuelto = numberSign(numero_introducido);
                System.out.println("SIGNO-> " + devuelto);
                break;


            case 2:
                System.out.println("INTRODUCE TU EDAD");
                int edad = in.nextInt();
                boolean mayor_de_edad = isAdult(edad);
                if (mayor_de_edad == true) {
                    System.out.println("ERES MAYOR DE EDAD");
                } else {
                    System.out.println("ERES MENOR DE EDAD");
                }
                break;


            case 3:
                System.out.println("INTRODUCE EL RADIO DEL CIRCULO");
                double radio = in.nextDouble();
                double perimetro = calculate_circle_perimetre(radio);
                double area = calculate_circle_area(radio);
                System.out.println("EL PERIMETRO DEL CIRCULO ES: " + perimetro + "/ EL AREA DEL CIRCULO ES: " + area);

                break;


            case 4:
                System.out.println("PULSE 1 SI QUIERE CONVERTIR EUROS A DOLARES");
                System.out.println("PULSE 2 SI QUIERE CONVERTIR DOLARES A EUROS");
                eleccion=in.nextInt();
                System.out.println("INTRODUCE LA CANTIDAD DE DINERO A CONVERTIR");

                showMenu(eleccion);
                break;


            case 5:

                System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SU TABLA DE MULTIPLICAR");
                int numero;
                numero = in.nextInt();
                tabla_de_multiplicar(numero);
                break;


            case 6:

                numero = 0;
                while (numero < 20) {
                    numero++;
                    tabla_de_multiplicar(numero);
                }
                break;


            case 7:
                System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SI ES PRIMO O NO, EL PROGRAMA TERMINARA CUANDO INTRODUZCAS EL NUMERO 0");
                numero_introducido = in.nextInt();
                boolean primo = calcular_numero_primo(numero_introducido);
                if (primo == true) {
                    System.out.println("EL NUMERO INTRODUCIDO ES PRIMO");
                }
                if (primo == false) {
                    System.out.println("EL NUMERO INTRODUCIDO NO ES PRIMO");
                }
                break;

            case 8:

                System.out.println("INTRODUCE EL DIA DE LA FECHA A CALCULAR");
                int dia = in.nextInt();
                System.out.println("INTRODUCE EL MES DE LA FECHA A CALCULAR");
                int mes = in.nextInt();
                boolean fecha_adecuada = comprobacion_dia_y_mes(dia, mes);
                if (fecha_adecuada == true) {
                    System.out.println("LA FECHA INTRODUCIDA ES VALIDA");

                }
                if (fecha_adecuada == false) {
                    System.out.println("LA FECHA INTRODUCIDA NO ES VALIDA");
                }
                break;

            case 9:
                System.out.println("INTRODUCE LA LETRA LA CUAL FORMARA LA PIRAMIDE" );
                Scanner in_= new Scanner(System.in);
                String palabra= in_.nextLine();

                char letra=palabra.charAt(0);
                System.out.println("INTRODUCE LAS FILAS DE LA PIRAMIDE");
                int linea= in_.nextInt();

                piramide(letra, linea);
                break;

        }


    }

}