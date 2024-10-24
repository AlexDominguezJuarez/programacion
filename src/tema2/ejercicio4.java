package tema2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
    System.out.println("introduce 3 numeros distintos entre si");
    Scanner in= new Scanner(System.in);
    int numero1=in.nextInt();
    int numero2= in.nextInt();
    int numero3=in.nextInt();

    if (numero2>numero1) {
        numero1 = numero2;
    }
    if (numero3>numero1){
        numero1=numero3;
    }
    System.out.println("el numero mas alto es " +numero1);

    }
}