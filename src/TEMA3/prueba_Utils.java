package TEMA3;

import java.util.Scanner;

import static TEMA3.Utils.*;


public class prueba_Utils {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("1. PULSA UNO PARA CONVERTIR MILLAS A KILOMETROS");
        System.out.println("2. PULSA DOS PARA CONVERTIR KILOMETROS A MILLAS");
        System.out.println("3. PULSA TRES PARA CALCULAR LA CANTIDAD DE IVA A PAGAR");
        System.out.println("4. PULSA CUATRO PARA CALCULAR EL DINERO A PAGAR SUMADO YA EL IVA");
        System.out.println("5. PULSA CINCO PARA CALCULAR LAS MONEDAS QUE NECESITAS PARA LLEGAR A UN PRECIO");
        System.out.println("6. PULSA SEIS PARA CALCULAR LA LETRA DE TU DNI");
        System.out.println("7. PULSA SIETE PARA COMPROBAR SI TU DNI Y TU LETRA COINCIDEN");
        System.out.println("8. PULSA 8 PARA CALCULAR TU IRPF A PAGAR SABIENDO TU SALARIO");
        int eleccion=in.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("INTRODUCE LA DISTANCIA A CALCULAR");
                double millas= in.nextDouble();
                double kilometros=miles2kilometers(millas);
                System.out.println("LA DISTANCIA SON "+kilometros+" KILOMETROS");

                break;
            case 2:
                System.out.println("INTRODUCE LA CANTIDAD A CALCULAR");
                kilometros=in.nextDouble();
                millas=kilometers2miles(kilometros);
                System.out.println("LA DISTANCIA INTRODUCIDA SON "+millas+" MILLAS");
                break;
            case 3:
                System.out.println("INTRODUCE EL DINERO A PAGAR");
                double dinero=in.nextDouble();
                System.out.println("INTRODUCE EL PORCENTAJE A PAGAR");
                int porcentaje= in.nextInt();
                double impuesto=getTaxes(dinero,porcentaje);
                System.out.println("EL DINERO ADICIONAL A PAGAR ES "+impuesto+"€");

                break;
            case 4:
                    System.out.println("INTRODUCE EL DINERO A PAGAR");
                    dinero=in.nextDouble();
                    System.out.println("INTRODUCE EL PORCENTAJE DE IMPUESTO");
                    porcentaje= in.nextInt();
                    double dinero_total=getNetPrice(dinero, porcentaje);
                    System.out.println("EL DINERO TOTAL A PAGAR ES "+dinero_total+"€");
                break;
            case 5:
                System.out.println("INTRODUCE LA CANTIDAD DE DINERO");
                dinero=in.nextDouble();
                double monedas=getCoins(dinero);
                System.out.println("LAS MONEDAS SON: "+monedas );
                break;
            case 6:
                System.out.println("INTRODUCE TU DNI");
                int dni=in.nextInt();
                String letra=getNif(dni);
                System.out.println("LA LETRA ES: "+letra);
                break;
            case 7:
                System.out.println("INTRODUCE TU NUMERO DE DNI");
                dni=in.nextInt();
                System.out.println("INTRODUCE LA LETRA DE TU DNI");
                String basura= in.nextLine();
                letra= in.nextLine();
                boolean correcto=isValidNif(dni,letra);
                if (correcto==true){
                    System.out.println("EL DNI INTRODUCIDO ES VALIDO");
                }else{
                    System.out.println("EL DNI INTRODUCIDO NO ES VALIDO");
                }

                break;
            case 8:
                System.out.println("INTRODUCE TU SALARIO ANUAL");
                double salario=in.nextDouble();
                double dinero_a_pagar=calculateIRPF(salario);
                System.out.println("EL DINERO A PAGAR ES: "+dinero_a_pagar+"€");
                break;

        }



    }
}