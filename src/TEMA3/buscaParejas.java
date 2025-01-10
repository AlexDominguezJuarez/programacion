package TEMA3;
import java.util.Random;
import java.util.Scanner;

public class buscaParejas {

    public static void printearArrayInt(int []array){
        int recorrerFuncion=0;
        int numeroDenumeros=array.length;
        for (int i=0;i<numeroDenumeros;i++) {
            System.out.println(array[i]);

        }

    }
    public static void printearArrayString(String[]array){
        int recorrerFuncion=0;
        int numeroDenumeros=array.length;
        for (int i=0;i<numeroDenumeros;i++) {
            System.out.print(array[i]+" - ");

        }

    }


    public static String devolverAnimal(int animal) {
        switch (animal) {
            case 1:
                return "LEON";
            case 2:
                return "ELEFANTE";
            case 3:
                return "BALLENA";
            case 4:
                return "ARDILLA";
            case 5:
                return "PATO";
            case 6:
                return "MAMUT";
            case 7:
                return "ORCA";
            case 8:
                return "ZORRO";
            case 9:
                return "TORTUGA";
            case 10:
                return "HORMIGA";
        }
        return "";
    }

    public static void main(String[] args) {
        int [] arrayOculta=new int[20];
        String []arrayAnimales=new String[20];
        Random random=new Random();
        Scanner in=new Scanner(System.in);
        int posicion;
        int animal=0;
        int eleccion1=0;
        int aciertos=0;
        int eleccion2=0;
        int parjeas=0;
        String mostrarAnimlal="";
        int recorrerFuncion=0;
        for (int i=20;i>recorrerFuncion;recorrerFuncion++){
            arrayAnimales[recorrerFuncion]="*";
        }




        System.out.println("BUSCAR PAREJAS");
        System.out.println();
        System.out.println("HAY 10 PAREJAS DE ANIMALES, INTENTA ENCONTRAR LAS PAREJAS");


        for (int i=animal ;i<10;i++) {
            animal++;
          for (int j=parjeas;j<2;j++) {
                posicion = random.nextInt(20);
                while (arrayOculta[posicion] != 0) {
                    posicion = random.nextInt(20);
                }
                arrayOculta[posicion] = animal;

            }
        }

        while (aciertos<10) {
            System.out.println();
            System.out.println("ELIJA UN NUMERO DEL 1 AL 20");
            eleccion1 = in.nextInt()-1;
            switch (eleccion1){
                case 0:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 1:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 2:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 3:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 4: mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 5:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 6:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 7:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 8:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 9:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 10:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 11:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 12:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 13:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 14:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 15:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 16:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 17:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 18:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 19:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 20: mostrarAnimlal=devolverAnimal(arrayOculta[eleccion1]);
                    arrayAnimales[eleccion1]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
            }
            System.out.println(arrayOculta[eleccion1]);
            System.out.println();
            System.out.println("ELIJA OTRO NUMERO DEL 1 AL 20");
            eleccion2=in.nextInt()-1;
            switch (eleccion2){
                case 0:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 1:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 2:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 3:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 4:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 5:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 6:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 7:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 8:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 9:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 10:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 11:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 12:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 13:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 14:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 15:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 16:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 17:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 18:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
                case 19:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;

                case 20:
                    mostrarAnimlal=devolverAnimal(arrayOculta[eleccion2]);
                    arrayAnimales[eleccion2]=mostrarAnimlal;
                    printearArrayString(arrayAnimales);
                    break;
            }

            if ((arrayAnimales[eleccion1].equals(arrayAnimales[eleccion2])) && (eleccion1 != eleccion2)){
                System.out.println("PAREJA CORRECTA");
                aciertos++;
                arrayAnimales[eleccion1]=devolverAnimal(eleccion1);
                arrayAnimales[eleccion2]=devolverAnimal(eleccion2);
            } else if ((arrayAnimales[eleccion2]!=arrayAnimales[eleccion1])||(eleccion2==eleccion1)) {
                System.out.println("PAREJA INCORRECTA");
                arrayAnimales[eleccion1]="*";
                arrayAnimales[eleccion2]="*";
            }


            }
            printearArrayString(arrayAnimales);
        }
    }