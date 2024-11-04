package BUCLES;

public class ejercicio27 {
    public static void main(String[] args) {
        int numero_ascendente = 2;
        boolean primo=true;
        int variable_numero_primo = 0;
        int numero_ascendente2=2;
        while (variable_numero_primo <= 20){
            if (primo==true) {
                System.out.println(numero_ascendente2);
                variable_numero_primo = variable_numero_primo + 1;
            }
            primo=true;
            numero_ascendente=numero_ascendente+1;
            numero_ascendente2 = numero_ascendente;
            int numero_a_dividir=numero_ascendente2-1;
            for (int i = numero_a_dividir; i >= 2; i--) {
                if (numero_ascendente2 % i == 0) {
                  primo=false;
                  i = 2;

                }

            }

            }




            }
    }



