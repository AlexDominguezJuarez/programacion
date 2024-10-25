package condicionales;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Introduce la base de la figura");
        Scanner in= new Scanner(System.in);
        double base=in.nextDouble();
        System.out.println("introduce lam altura de ka figura");
        double altura=in.nextDouble();
        System.out.println("pulse 0 si la figura es un cuadrado,pulse 1 si la figura de un rectangulo, pulse 2 si la figura es un triangulo ");
        int numero=in.nextInt();
        if (numero != 0 || numero !=1 || numero !=2 ){
            System.out.println("opcion no valida");
        }
        switch (numero){
            case 0:
                double superficie = base * base;
                double perimetro = base*4;
                System.out.println("la superficie es " + superficie);
                System.out.println("el perimetro es " + perimetro);
                break;
            case 1:
                superficie = base * altura;
                perimetro = base*2+altura*2;
                System.out.println("la superficie es " + superficie);
                System.out.println("el perimetro es " + perimetro);
                return;
            case 2:
                 superficie= (base*altura)/2;
                System.out.println("la superficie del triangulo es " +superficie);
                 perimetro= base*3;
                System.out.println("el perimetro del triangulo es " +perimetro);
                return;



        }

    }
}
