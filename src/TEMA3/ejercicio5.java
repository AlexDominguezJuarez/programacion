package TEMA3;
import java.util.Scanner;

public class ejercicio5 {

    public static void   tabla_de_multiplicar(int numero){
        System.out.println(numero+"*1="+numero*1);
        System.out.println(numero+"*2="+numero*2);
        System.out.println(numero+"*3="+numero*3);
        System.out.println(numero+"*4="+numero*4);
        System.out.println(numero+"*5="+numero*5);
        System.out.println(numero+"*6="+numero*6);
        System.out.println(numero+"*7="+numero*7);
        System.out.println(numero+"*8="+numero*8);
        System.out.println(numero+"*9="+numero*9);
        System.out.println(numero+"*10="+numero*10);
        System.out.println("-------------------------------------------------------");
    }
    public static void main(String[] args) {
        System.out.println("INTRODUCE UN NUMERO Y TE DIREMOS SU TABLA DE MULTIPLICAR");
        int numero;
        Scanner in=new Scanner(System.in);
        numero=in.nextInt();
        tabla_de_multiplicar(numero);


    }
}