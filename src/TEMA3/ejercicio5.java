package TEMA3;
import java.util.Scanner;

public class ejercicio5 {

    public static void   tabla_de_multiplicar(int numero){
       for (int i=1;i<10;i++) {
           System.out.println(numero + "*" + i + "=" + numero * 1);

           System.out.println("-------------------------------------------------------");
       }
    }
    public static void main(String[] args) {
        System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SU TABLA DE MULTIPLICAR");
        int numero;
        Scanner in=new Scanner(System.in);
        numero=in.nextInt();
        tabla_de_multiplicar(numero);


    }
}