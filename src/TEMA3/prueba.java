package TEMA3;

public class prueba {
    public static void main(String[] args) {
        int numero=222222222;
        int contador=0;
        while (numero>10){

            if(numero%2==0){
                contador++;
            }
            numero=numero/10;


        } System.out.println(contador);
    }
}
