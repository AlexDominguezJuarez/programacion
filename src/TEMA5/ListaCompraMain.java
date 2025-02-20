package TEMA5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompraMain {
    public static void main(String[] args) {
        System.out.println("LISTA DE LA COMPR\nPULSE 0 PARA SALIR\n");
        Scanner in=new Scanner(System.in);
        ListaCompra cosasQueComprar;
        System.out.println("¿Que falta por comprar?");
        String objetoCompra=in.nextLine();
        boolean comprobacion=true;
        List<ListaCompra>listaDeLaCompra=new ArrayList<>();
        cosasQueComprar=new ListaCompra(objetoCompra);
        while (!objetoCompra.equals("0")){
            for (ListaCompra recorrerLista:listaDeLaCompra){
                if (objetoCompra.equals(recorrerLista.getAlimento())){
                    comprobacion=false;
                }
            }

            if (comprobacion==true){
                ListaCompra cosaQueComprar=new ListaCompra(objetoCompra);
                listaDeLaCompra.add(cosaQueComprar);
            }
            else{
                System.out.println("Objeto ya añadido a la lista\n");
            }
            System.out.println("¿Que falta por comprar?");
            objetoCompra=in.nextLine();

            comprobacion=true;
        }
        System.out.println(listaDeLaCompra);

    }
}
