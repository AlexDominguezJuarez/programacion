package TEMA3;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class MyMatrix {

    /*  public static int [][] definirMatriz(){
          Scanner in=new Scanner(System.in);
          int filas;
          int columnas;
          System.out.println("¿CUANTAS FILAS QUIERES QUE TENGA LA MATRIZ?");
          filas=in.nextInt();
          System.out.println("¿CUANTAS COLUMNAS QUIERES QUE TENGA LA MATRIZ?");
          columnas=in.nextInt();
          return
      }
  */
    public static void menu(){
        System.out.println("FUNCIONES DE MATRIZ");
        System.out.println();
        System.out.println("1. IMPRIMIR MATRIZ");
        System.out.println("1. MAXIMO DE LA MATRIZ");
        System.out.println("3. MINIMO DE LA MATRIZ");
        System.out.println("4. MEDIA DE LA MATRIZ");
        System.out.println("5. COMPROBAR UN ELEMENTO DE LA MATRIZ");
        System.out.println("6. CUANTAS VECES SE REPITE UN NUMERO EN LA MATRIZ");
        System.out.println("7. SUMA DE DOS MATRICES");
        System.out.println("8. RESTA DE DOS MATRICES");
        System.out.println("9. COMPROBACION DE MATRIZ UNITARIA");
    }

    public static void imprimirMatriz(int[][] matriz){
        int recorrerFuncion=0;
        int numeroDenumeros= matriz.length;
        for (int i=0 ; numeroDenumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static int maximoMatriz(int [][]matriz){
        int recorrerFuncion=0;
        int numeroDeNumeros=matriz.length;
        int maximo=0;
        for (int i=0 ; numeroDeNumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                if (matriz[i][j]>maximo){
                    maximo=matriz[i][j];
                }
            }
            System.out.println();
        }
        return maximo;
    }

    public static int minimoMatriz(int [][]matriz){
        int recorrerFuncion=0;
        int numeroDeNumeros=matriz.length;
        int minimo=999999999;
        for (int i=0 ; numeroDeNumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                if (matriz[i][j]<minimo){
                    minimo=matriz[i][j];
                }
            }
            System.out.println();
        }
        return minimo;
    }

    public static int mediaMatriz(int [][]matriz){
        int recorrerFuncion=0;
        int numeroDeNumeros=matriz.length;
        int media=0;
        for (int i=0 ; numeroDeNumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                media=media+matriz[i][j];

            }
            System.out.println();
        }
        media=media/numeroDeNumeros;
        return media;
    }
    public static boolean comprobacionNumero(int [][] matriz, int numeroAComprobar){
        int recorrerFuncion=0;
        int numeroDeNumeros=matriz.length;
        int media=0;
        for (int i=0 ; numeroDeNumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                if (matriz[i][j]==numeroAComprobar) {
                    return true;
                }

            }
            System.out.println();
        }
        return false;
    }

    public static int repeticionDeNumerosMatriz(int [][]matriz, int numeroAComprobar){
        int recorrerFuncion=0;
        int numeroDeNumeros=matriz.length;
        int media=0;
        int contador=0;
        for (int i=0 ; numeroDeNumeros>i ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                if (matriz[i][j]==numeroAComprobar) {
                    contador++;
                }

            }
            System.out.println();
        }
        return contador;
    }

    public static int [][] sumaDeMatrices(int [][]matriz1, int [][]matriz2){
        int recorrerFuncion=0;
        int numeroDeNumeros1=matriz1.length;

        int media=0;
        int contador=0;
        int [][] matrizSumada=new int[][] {};
        for (int i=0 ; numeroDeNumeros1>i ; i++){
            for (int j=0 ; j<matriz1[i].length ; j++){
                matriz1[i][j]=matriz1[i][j]+matriz2[i][j];
            }
            System.out.println();
        }
        return matriz1;
    }

    public static int [][] restaDeMatrices(int [][] matriz1,int [][]matriz2){
        int recorrerFuncion=0;
        int numeroDeNumeros1=matriz1.length;

        int media=0;
        int contador=0;
        int [][] matrizSumada=new int[][] {};
        for (int i=0 ; numeroDeNumeros1>i ; i++){
            for (int j=0 ; j<matriz1[i].length ; j++){
                matriz1[i][j]=matriz1[i][j]-matriz2[i][j];
            }
            System.out.println();
        }
        return matriz1;
    }

    /* POR TERMINAR
     public static boolean matrizUnitaria(int  [][]matriz){
        int [][]matrizUnitaria=new int[][]{{},{},{}}
    }*/

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int eleccion;
        int [][] matriz1={{2,9,4},{1,9,3},{7,4,0}};
        int [][] matriz2={{1,6,2},{3,0,7,},{5,3,5}};
        int [][] matrizDefinida;

        menu();



        eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("IMPRIMIR MATRIZ");
                imprimirMatriz(matriz1);

                break;
            case 2:
                System.out.println("NUMERO MAXIMO");
                int numeroMaximoMatriz=maximoMatriz(matriz1);
                System.out.println("EL NUMERO MAXIMO ES: "+numeroMaximoMatriz);

                break;
            case 3:
                System.out.println("NUMERO MINIMO");
                int numeroMinimoMatriz=minimoMatriz(matriz1);
                System.out.println("EL NUMERO MINIMO ES: "+numeroMinimoMatriz);

                break;
            case 4:
                System.out.println("MEDIA MATRIZ");
                int numeroMediaMatriz=mediaMatriz(matriz1);
                System.out.println("LA MEDIA ES: "+numeroMediaMatriz);

                break;
            case 5:
                System.out.println("COMPROBAR UN ELEMENTO DE LA MATRIZ");
                System.out.println();
                System.out.println("INTRODUZCA EL NUMERO A COMPROBAR");
                int numeroComprobacion=in.nextInt();
                boolean comprobado=comprobacionNumero(matriz1, numeroComprobacion);
                if (comprobado==true){
                    System.out.println("EL NUMERO "+numeroComprobacion+" EXISTE EN LA MATRIZ");
                }else {
                    System.out.println("EL NUMERO "+numeroComprobacion+" NO EXISTE EN LA MATRIZ");
                }
                break;
            case 6:
                System.out.println("CUANTAS VECES SE REPITE UN NUMERO EN LA MATRIZ");
                System.out.println();
                System.out.println("INTRODUCE EL NUMERO A COMPROBAR");
                int numeroAComprobar=in.nextInt();
                int numeroDeVeces=repeticionDeNumerosMatriz(matriz1,numeroAComprobar);
                System.out.println("EL NUMERO "+numeroAComprobar+" SE REPITE "+numeroDeVeces+" VECES");

                break;
            case 7:
                System.out.println("SUMA DE MATRICES");
                int [][]matrizSumada=sumaDeMatrices(matriz1,matriz2);
                imprimirMatriz(matrizSumada);

                break;
            case 8:
                System.out.println("RESTA DE MATRICES");
                int [][]matrizRestada=restaDeMatrices(matriz1,matriz2);
                imprimirMatriz(matrizRestada);


                break;
            case 9:
                System.out.println("COMPROBACION DE MATRIZ UNITARIA");

                break;

        }

    }
}