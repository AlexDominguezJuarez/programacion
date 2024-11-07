package BUCLES;

import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        boolean salir=true;
        int numero_salir=1;
        while (salir ==true){
            System.out.println("bienvenido a la calculadora, introduzca el primer numero, el signo de la operacion a realizar y el segundo numero");
            int numero1= in.nextInt();
            String operacion=in.next();
            int numero2=in.nextInt();

            switch (operacion) {
                case "+":
                    System.out.println(numero1 + numero2);
                    System.out.println("Pulsa '1' si quieres salir de la calculadora, si no introduce cualquier otro numero");
                    numero_salir= in.nextInt();
                    if (numero_salir==1){
                        salir=false;
                    }
                    break;

                case "-":
                    System.out.println(numero1-numero2);
                    System.out.println("Pulsa '1' si quieres salir de la calculadora, si no introduce cualquier otro numero");
                    numero_salir= in.nextInt();
                    if (numero_salir==1){
                        salir=false;
                    }
                    break;

                case "*":
                    System.out.println(numero1 * numero2);
                    System.out.println("Pulsa '1' si quieres salir de la calculadora, si no introduce cualquier otro numero");
                    numero_salir= in.nextInt();
                    if (numero_salir==1){
                        salir=false;
                    }
                    break;

                case "/":
                    System.out.println(numero1/numero2);
                    System.out.println("Pulsa '1' si quieres salir de la calculadora, si no introduce cualquier otro numero");
                    numero_salir= in.nextInt();
                    if (numero_salir==1){
                        salir=false;
                    }
                    break;

                case "%":
                    System.out.println(numero1%numero2);
                    System.out.println("Pulsa '1' si quieres salir de la calculadora, si no introduce cualquier otro numero");
                    numero_salir= in.nextInt();
                    if (numero_salir==1){
                        salir=false;
                    }
                    break;
            }

        }
    }
}
