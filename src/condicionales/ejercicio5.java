package condicionales;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        System.out.println("introduce 3 numeros distintos entre si");
        Scanner in= new Scanner(System.in);
        int numero1=in.nextInt();
        int numero2= in.nextInt();
        int numero3=in.nextInt();
        double media=(numero1+numero2+numero3)/3;
        double media_sin=Math.ceil(media);

        System.out.println("el resultado con decimales es "+media_sin "" );

    }


}
