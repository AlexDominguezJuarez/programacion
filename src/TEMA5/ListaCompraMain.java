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


        System.out.println("¿Que falta por comprar?");
        String objetoCompra=in.nextLine();
        boolean comprobacion=true;
        List<ListaCompra>listaDeLaCompra=new ArrayList<>();
        List<ListaCompra>carritoDeLaCompra=new ArrayList<>();
        cosasQueComprar=new ListaCompra(objetoCompra);
        while (!objetoCompra.equals("0")){
            for (ListaCompra recorrerLista:listaDeLaCompra){
                if (objetoCompra.equals(recorrerLista.getAlimento())){
                    comprobacion=false;
                }
            }if (comprobacion==true){
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

    menu();
    int eleccion=in.nextInt();
    switch (eleccion){
        case 1:
            System.out.println("¿Qué producto quieres añadir al carro?");
            String nombreProducto = in.nextLine();
            ListaCompra productoCarro=new ListaCompra(nombreProducto);
            if (listaDeLaCompra.contains(productoCarro)) {
                carritoDeLaCompra.add(productoCarro);
                System.out.println("Producto añadido al carro.");
            } else {
                System.out.println("Este producto no está en la lista de compra.");
            }

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
            productosPendientes.removeAll(carritoDeLaCompra);
            if (productosPendientes.isEmpty()) {
                System.out.println("No hay productos pendientes.");
            } else {
                for (ListaCompra recorrerLista : productosPendientes) {
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
