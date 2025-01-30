package TEMA3;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        System.out.println("Juego del ahorcado\nIntroduce una palabra\n");
        Scanner in=new Scanner(System.in);
        char letraIntroducida;
        int intentos=6;
        int aciertos=0;
        String palabraAAdivinar=in.nextLine();
        char []arrayPalabra=new char[palabraAAdivinar.length()];
        char[]arrayOculta=new char[palabraAAdivinar.length()];
        for (int i=0;i<palabraAAdivinar.length();i++){
            arrayOculta[i]='_';
        }
        for (int i=0;i<palabraAAdivinar.length();i++){
            arrayPalabra[i]=palabraAAdivinar.charAt(i);
        }
        System.out.println("Adivina la palabra");
        while ((intentos>=0)&&(aciertos<arrayPalabra.length)) {
            System.out.println("Introduce una letra que creas que forma parte de la palabra,tienes " + intentos + " intentos");
            String palabraIntroducida=in.nextLine();
            letraIntroducida=palabraIntroducida.charAt(0);
            for (int i=0;i<arrayPalabra.length;i++){
                if (arrayPalabra[i]==letraIntroducida){
                    arrayOculta[i]=letraIntroducida;
                    System.out.println("¡¡Letra correcta!!");
                }else{
                    System.out.println("Letra incorrecta");

                }
                for (int j=0;j<arrayOculta.length;j++){
                    System.out.print (arrayOculta[j]);
                }
            }

        }

    }
}
