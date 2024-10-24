package condicionales;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println("introduce 3 numeros distintos entre si");
        Scanner in= new Scanner(System.in);
        double numero1=in.nextDouble();
        double numero2= in.nextDouble();
        double numero3=in.nextDouble();
        double media=(numero1+numero2+numero3)/3;
        double media_sin=Math.ceil(media);

        System.out.println("el resultado con decimales es "+media +"el resultado sin decimales es "+media_sin );

    }


}
