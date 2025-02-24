package TEMA5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompraMain {
    public static void menu(){
        System.out.println("\nOpciones:");
        System.out.println("1. Añadir al carro de la compra");
        System.out.println("2. Ver productos en el carro");
        System.out.println("3. Ver productos pendientes por añadir");
        System.out.println("0. Salir");
    }
    public static void main(String[] args) {
        System.out.println("LISTA DE LA COMPR\nPULSE 0 PARA SALIR\n");
        Scanner in=new Scanner(System.in);
        ListaCompra cosasQueComprar;
        String nombreProducto;
        int numeritoPosicion=0;

        System.out.println("¿Que falta por comprar?");
        String objetoListaCompra=in.nextLine();

        boolean comprobacion=true;
        boolean comprobacionMenu=false;

        List<ListaCompra>listaDeLaCompra=new ArrayList<>();
        List<ListaCompra>carritoDeLaCompra=new ArrayList<>();
        cosasQueComprar=new ListaCompra(objetoListaCompra);
        while (!objetoListaCompra.equals("0")){
            for (ListaCompra recorrerLista:listaDeLaCompra){
                if (objetoListaCompra.equals(recorrerLista.getAlimento())){
                    comprobacion=false;
                }
            }if (comprobacion==true){
                ListaCompra cosaQueComprar=new ListaCompra(objetoListaCompra);
                listaDeLaCompra.add(cosaQueComprar);
            }
            else{
                System.out.println("Objeto ya añadido a la lista\n");
            }
            System.out.println("¿Que falta por comprar?");
            objetoListaCompra=in.nextLine();
            comprobacion=true;
        }
        System.out.println(listaDeLaCompra);
        int eleccion=1;
        while (eleccion!=0){
            menu();
            eleccion=in.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("¿Qué producto quieres añadir al carro?");
                    in.nextLine();
                    nombreProducto = in.nextLine();
                    ListaCompra productoCarro=new ListaCompra(nombreProducto);
                   for (ListaCompra recorrerFuncion:listaDeLaCompra) {
                       if (nombreProducto.equals(recorrerFuncion.getAlimento())) {
                           comprobacionMenu = true;
                           numeritoPosicion=listaDeLaCompra.indexOf(recorrerFuncion);

                       }
                   }
                   if (comprobacionMenu==true){
                       carritoDeLaCompra.add(productoCarro);
                       System.out.println("Producto añadido al carro.");
                       listaDeLaCompra.remove(numeritoPosicion);
                   }else{
                       System.out.println("Este producto no está en la lista de compra.");
                   }
                   comprobacionMenu=false;


                    break;
                case 2:
                    System.out.println("Productos en el carro de la compra:");
                    if (carritoDeLaCompra.isEmpty()) {
                        System.out.println("El carro está vacío.");
                    } else {
                        for (ListaCompra productoEnCarro : carritoDeLaCompra) {
                            System.out.println(productoEnCarro);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Productos pendientes por añadir:");
                    List<ListaCompra> productosPendientes = new ArrayList<>();

                    listaDeLaCompra.removeAll(carritoDeLaCompra);
                    if (listaDeLaCompra.isEmpty()) {
                        System.out.println("No hay productos pendientes.");
                    } else {
                        for (ListaCompra recorrerLista : listaDeLaCompra) {
                            System.out.println(recorrerLista);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
            }
        }
    }
}
