package TEMA3;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.Scanner;

public class MyArray {

    public static void imprimirFuncion (int [] array) {
        int numeroDeNumerosArray=array.length;
        int recorrerFuncion=0;
        for (int i=numeroDeNumerosArray;i>recorrerFuncion;recorrerFuncion++){
            System.out.println(array[recorrerFuncion]);
        }

    }

    public static boolean comprobacionCapicua(int []array) {
        int numeroEmpezandoPorArriba = array.length-1;
        int numeroEmpezandoPorAbajo = 0;
        int numero1;
        int numero2;
        int recorrerFuncion = 0;
        int numeroDeElementos = array.length;
        for (int i = numeroDeElementos; i > recorrerFuncion; recorrerFuncion++) {

            numero1=array[numeroEmpezandoPorAbajo];
            numero2=array[numeroEmpezandoPorArriba];
            if (numero1!=numero2){
                return false;
            }
            numeroEmpezandoPorAbajo++;
            numeroEmpezandoPorArriba--;
        }
        return true;
    }
    public static int maxArray (int [] array){
        int numeroDeElementos=array.length;
        int recorrerFuncion=0;
        int valorADevolver=array[0];
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            if (array[recorrerFuncion]>valorADevolver){
                valorADevolver=array[recorrerFuncion];
            }
        }
        return valorADevolver;
    }

    public static int minArray(int [] array){
        int numeroDeElementos=array.length;
        int recorrerFuncion=0;
        int valorADevolver=array[0];
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            if (array[recorrerFuncion]<valorADevolver){
                valorADevolver=array[recorrerFuncion];
            }
        }
        return valorADevolver;
    }

    public static double mediaArray (int [] array){
        int numeroDeElementos=array.length;
        int recorrerFuncion=0;
        double mediaNumeros=0;
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            mediaNumeros=mediaNumeros+array[recorrerFuncion];
        }
        mediaNumeros=mediaNumeros/numeroDeElementos;
        return mediaNumeros;

    }

    public static boolean comprobacionArray(int [] array){
        int numeroDeElementos=array.length;
        int recorrerFuncion=0;
        Scanner in=new Scanner(System.in);
        System.out.println("INTRODUZCA EL NUMERO A COMPROBAR");
        int numeroAComprobar=in.nextInt();
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            if (array[recorrerFuncion]==numeroAComprobar){
                return true;
            }
        }
        return false;

    }

    public static int [] sumaDeArrays(int [] array1, int [] array2){
        int numeroDeElementos1=array1.length;
        int recorrerFuncion=0;
        int [] arraysSumada=new int [numeroDeElementos1];

        for (int i=numeroDeElementos1;i>recorrerFuncion;recorrerFuncion++){
            arraysSumada[recorrerFuncion]=array1[recorrerFuncion]+array2[recorrerFuncion];
        }

        return arraysSumada;
    }

    public static int[] restaDeArrays(int [] array1, int[] array2){
        int numeroDeElementos1=array1.length;
        int recorrerFuncion=0;
        int [] arraysSumada=new int [numeroDeElementos1];

        for (int i=numeroDeElementos1;i>recorrerFuncion;recorrerFuncion++){
            arraysSumada[recorrerFuncion]=array1[recorrerFuncion]-array2[recorrerFuncion];
        }

        return arraysSumada;

    }



    public static double productoEscalarVectores (int [] array1, int [] array2){
        Scanner in=new Scanner(System.in);
        System.out.println("INTRODUZCA EL ANGULO ENTRE LOS DOS VECTORES");
        double anguloVectores=in.nextDouble();

        int numeroDeElementos1=array1.length;
        int numeroDeElementos2=array2.length;
        int recorrerFuncion1=0;
        int recorrerFuncion2=0;

        double productoEscalar;
        double contadorArray1=0;
        double contadorArray2=0;
        double operacion=0;
        for (int i=numeroDeElementos1;i>recorrerFuncion1;recorrerFuncion1++){
            operacion=array1[recorrerFuncion1];
            operacion=operacion*operacion;
            contadorArray1=contadorArray1+operacion;

        }
        contadorArray1=Math.sqrt(contadorArray1);

        for (int i=numeroDeElementos2;i>recorrerFuncion2;recorrerFuncion2++){
            operacion=array2[recorrerFuncion2];
            operacion=operacion*operacion;
            contadorArray2=contadorArray2+operacion;

        }
        contadorArray2=Math.sqrt(contadorArray2);

        productoEscalar=contadorArray2*contadorArray1*Math.cos(anguloVectores);
        return productoEscalar;



    }
    /// ///////////
    public static int [] invertirArrayFuncion (int []array1 ){
        int numeroDeElementos=array1.length;
        int informacionDeDentro=numeroDeElementos;
        int recorrerFuncion=0;
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            informacionDeDentro--;
            array1[recorrerFuncion]=array1[informacionDeDentro];

        }
        return array1;
    }

    public static void invertirArrayProcedimiento (int[] array1){
        int numeroDeElementos=array1.length;
        int informacionDeDentro=numeroDeElementos;
        int recorrerFuncion=0;
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            informacionDeDentro--;
            array1[recorrerFuncion]=array1[informacionDeDentro];

        }
        recorrerFuncion=0;
        for (int i=numeroDeElementos;i>recorrerFuncion;recorrerFuncion++){
            System.out.println(array1[recorrerFuncion]);
        }
    }

    public static int []   definirArray (){
        Scanner in=new Scanner(System.in);

        int recorrerFuncion=0;
        System.out.println("DEFINIR ARRAY");
        System.out.println("---------------------------------------------");

        System.out.println("INTRODUCE CUANTOS NUMEROS VAS A INTRODUCIR");

        int numeroDeNumeros=in.nextInt();
        int []array=new int[numeroDeNumeros];
        while (recorrerFuncion<numeroDeNumeros) {
            System.out.println("INTRODUCE EL NUMERO");
            array[recorrerFuncion] = in.nextInt();
            System.out.println("---------------------------------------------");

            recorrerFuncion++;

            imprimirFuncion(array);

        }
        return array;

    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arrayClass1=definirArray();
        int recorrerFuncion=0;
        int numeroDeNumeros=arrayClass1.length;



        System.out.println("ELIGA LA OPERACION A REALIZAR");
        System.out.println("1. MOSTRAR LA ARRAY");
        System.out.println("2. MOSTRAR EL NUMERO MAS ALTO DE LA ARRAY");
        System.out.println("3. MOSTRAR EL NUMERO MAS BAJO DE LA ARRAY");
        System.out.println("4. MOSTRAR LA MEDIA DE LOS NUMEROS DE LA ARRAY");
        System.out.println("5. COMPROBAR SI UN MUMERO EXISTE DENTRO DE LA ARRAY");
        System.out.println("6. SUMAR 2 ARRAYS");
        System.out.println("7. RESTAR 2 ARRAYS");
        System.out.println("8. CALCULAR EL PRODUCTO ESCALAR DE DOS ARRAYS");
        System.out.println("9. INVERTIR UNA ARRAY");
        System.out.println("10. COMPROBAR SI UN ARRAY ES CAPICUA O NO");



        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("1. MOSTRAR LA ARRAY");
                System.out.println("---------------------------------------------");
                imprimirFuncion(arrayClass1);
                break;
            case 2:
                System.out.println("2. MOSTRAR EL NUMERO MAS ALTO DE LA ARRAY");
                System.out.println("---------------------------------------------");

                int numeroMaximo=maxArray(arrayClass1);
                System.out.println(numeroMaximo);
                break;

            case 3:
                System.out.println("3. MOSTRAR EL NUMERO MAS BAJO DE LA ARRAY");
                System.out.println("---------------------------------------------");

                int numeroMinimo=minArray(arrayClass1);
                System.out.println(numeroMinimo);
                break;

            case 4:
                System.out.println("4. MOSTRAR LA MEDIA DE LOS NUMEROS DE LA ARRAY");
                System.out.println("---------------------------------------------");

                double numeroMedias=mediaArray(arrayClass1);
                System.out.println(numeroMedias);
                break;

            case 5:
                System.out.println("5. COMPROBAR SI UN MUMERO EXISTE DENTRO DE LA ARRAY");
                System.out.println("---------------------------------------------");
                boolean comprobacion=comprobacionArray(arrayClass1);
                if (comprobacion==true){
                    System.out.println("EL NUMERO INTRODUCIDO EXISTE EN EL ARRAY");
                }else {
                    System.out.println("EL NUMERO INTRODUCIDO NO EXISTE EN EL ARRAY");
                }

                break;

            case 6:
                System.out.println("6. SUMAR 2 ARRAYS");
                System.out.println("---------------------------------------------");
                int [] arrayClass2=definirArray();
                int numeroDeNumeros2=arrayClass2.length;
                while (numeroDeNumeros2!=numeroDeNumeros){
                    System.out.println("");

                }
                int []arraySumada=sumaDeArrays(arrayClass2,arrayClass1);
                for (int i=numeroDeNumeros;i>recorrerFuncion;recorrerFuncion++) {
                    System.out.println(arraySumada[recorrerFuncion]);
                }
                break;

            case 7:
                System.out.println("7. RESTAR 2 ARRAYS");
                System.out.println("---------------------------------------------");
                arrayClass2=definirArray();

                int []arrayRestada=restaDeArrays(arrayClass1,arrayClass2);
                recorrerFuncion=0;
                for (int i=numeroDeNumeros;numeroDeNumeros>recorrerFuncion;recorrerFuncion++){
                    System.out.println(arrayRestada[recorrerFuncion]);
                }
                break;

            case 8:
                System.out.println("8. CALCULAR EL PRODUCTO ESCALAR DE DOS ARRAYS");
                System.out.println("---------------------------------------------");
                arrayClass2=definirArray();
                double productoEscalar=productoEscalarVectores(arrayClass1,arrayClass2);
                System.out.println(productoEscalar);

                break;

            case 9:
                System.out.println("9. INVERTIR UNA ARRAY");
                System.out.println("---------------------------------------------");
                int [] arrayInvertida=invertirArrayFuncion(arrayClass1);
                for (int i=numeroDeNumeros;i>recorrerFuncion;recorrerFuncion++){
                    System.out.println(arrayInvertida[recorrerFuncion]);
                }
                break;

            case 10://preguntar
                System.out.println("10. COMPROBAR SI UN ARRAY ES CAPICUA O NO");
                System.out.println("---------------------------------------------");
                boolean comprobacionCapicua = comprobacionCapicua(arrayClass1);
                if (comprobacionCapicua==true){
                    System.out.println("LA ARRAY ES CAPICUIA");
                }else if (comprobacionCapicua==false){
                    System.out.println("LA ARRAY NO ES CAPICUA");
                }



                break;

        }




    }
}