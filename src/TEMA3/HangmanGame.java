package TEMA3;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        System.out.println("Juego del ahorcado\nIntroduce una palabra\n");
        Scanner in=new Scanner(System.in);
        char letraIntroducida;
        int eleccionDeCasilla=0;
        int intentos=6;
        int aciertos=0;
        int numeroDeErrores=0;
        String palabraAAdivinar=in.nextLine();
        char []arrayPalabra=new char[palabraAAdivinar.length()];
        for (int i=0;i<arrayPalabra.length;i++){
            arrayPalabra[i]=palabraAAdivinar.charAt(i);
        }
        char[]arrayOculta=new char[palabraAAdivinar.length()];
        for (int i=0;i<palabraAAdivinar.length();i++){
            arrayOculta[i]='_';
        }
        for (int i=0;i<palabraAAdivinar.length();i++){
            arrayPalabra[i]=palabraAAdivinar.charAt(i);
        }
        System.out.println("Adivina la palabra");
        while ((numeroDeErrores<6)&&(aciertos<arrayPalabra.length)) {
            System.out.println("Introduce en que posicion quires introducir la letra\n");
            eleccionDeCasilla=in.nextInt()-1;
            String basura=in.nextLine();
            System.out.println("Introduce una letra que creas que forma parte de la palabra,tienes " + intentos + " intentos");
            String palabraIntroducida=in.nextLine();

            letraIntroducida=palabraIntroducida.charAt(0);
            if (arrayPalabra[eleccionDeCasilla]==letraIntroducida){
                System.out.println("¡¡Felicidades,has acertado!!");
                aciertos++;
                arrayOculta[eleccionDeCasilla]=letraIntroducida;
            }else {
                System.out.println("Lo siento, has fallado");
                numeroDeErrores++;
            }

            for (int j=0;j<arrayOculta.length;j++){
                System.out.print (arrayOculta[j]);
            }
            System.out.println();
            System.out.println();
            switch (numeroDeErrores) {
                case 1:
                    System.out.println(" o");
                    break;
                case 2:
                    System.out.println("    o");
                    System.out.println(" /");
                    break;
                case 3:
                    System.out.println(" o");
                    System.out.println(" / |");
                    break;
                case 4:

                    System.out.println(" o");
                    System.out.println(" / | \\");
                    break;
                case 5:
                    System.out.println(" o");
                    System.out.println(" / | \\");
                    System.out.println(" /");
                    break;
                case 6:

                    System.out.println(" o");
                    System.out.println(" / | \\");
                    System.out.println(" / \\");
                    break;

            }System.out.println();

        }

    }
}
