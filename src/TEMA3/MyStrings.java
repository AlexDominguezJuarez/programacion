package TEMA3;

import java.util.Scanner;

public class MyStrings {
    public static void menu(){
        System.out.println("ELIJA QUE OPCION QUIERE REALIZAR");
        System.out.println();
        System.out.println("1. INVERTIR PALABRA");
        System.out.println("2. MOSTRAR NUMERO DE VOCALES.");
        System.out.println("3. MOSTRAR LA PALABRA DE MAYOR TAMAÑO");
        System.out.println("4. NUMERO DE VECES QUE UNA ORACION ESTÁ INCLUIDA EN OTRA");
        System.out.println("5. CONTAR PALABRAS DE UNA FRASE");
        System.out.println("6. CONVERTIR NUMERO DE TELEFONO");
        System.out.println("7. VECES QUE SE REPITE CADA VCCAL EN UNA ORACION");

    }

    public static String definitPalabra(){
        Scanner in=new Scanner(System.in);
        System.out.println("INTRODUZCA LA PALABRA O ORACION CON LA QUE VA A TRABAJAR EL PROGRAMA");
        String palabra=in.nextLine();
        return palabra;


    }

    public static void invertirCadena(String palabra){
        int numeroDeLetras=palabra.length()-1;
        while (numeroDeLetras>-1){
            System.out.println(palabra.charAt(numeroDeLetras));

            numeroDeLetras--;
        }

    }

    public static int contarVocales (String cadena){
        int numeroDeLetras=cadena.length()-1;
        while (numeroDeLetras>-1){
            String vocal=cadena.substring(numeroDeLetras);
            if (vocal.equals("a"))

                numeroDeLetras--;
        }
        return 1;

    }
//por terminar
    public static String mayorPalabra(String cadena){
        int posicion=cadena.indexOf(" ");
        String palabra=cadena.substring(0,posicion);
        int nuevaPosicion=cadena.indexOf(" ",posicion);
        String palabra2=cadena.substring(posicion,nuevaPosicion) ;
        return "";
    }

    public static int numeroDePalabras(String cadena){
        cadena.trim();
        int posicion=0;
        int contador=1;
        boolean comprobacion=true;
        for (int i=0;i<cadena.length();i++){
            if ((cadena.charAt(posicion)== ' ')&&(cadena.charAt(posicion-1))!= ' ' ){
                contador++;
                posicion++;

            }else {
                posicion++;
            }
        }
        return contador;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String cadena1=definitPalabra();


        menu();
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                invertirCadena(cadena1);
                break;
            case 2:
                int numeroDeVocales=contarVocales(cadena1);
                System.out.println("LA PALABRA INTRODUCIDA TIENE "+numeroDeVocales+" VOCALES");
                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                int contadorDePalabras=numeroDePalabras(cadena1);
                System.out.println("HAY "+contadorDePalabras+" PALABRAS");
                break;
            case 6:
                break;
            case 7:
                break;
        }

    }
}