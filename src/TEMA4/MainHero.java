package TEMA4;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce el nombre del heroe 1");
        String nombre1=in.nextLine();

        System.out.println("Introduce el ataque del heroe");
        int ataque1= in.nextInt();
        System.out.println("Introduce la defensa del heroe 1");
        int defens1a=in.nextInt();
        System.out.println("Introduce la vida del heroe 1");
        int vida1=in.nextInt();
        int experiencia1=0;
        int maxVida=vida1;
        int nivel1=0;
        Hero hero1=new Hero(nombre1,nivel1,vida1,maxVida,experiencia1,ataque1,defens1a);

        System.out.println("Introduce el nombre del heroe 2");
        String basura=in.nextLine();
        String nombre2=in.nextLine();
        System.out.println("Introduce el ataque del heroe 2");
        int ataque2= in.nextInt();
        System.out.println("Introduce la defensa del heroe 2");
        int defensa2=in.nextInt();
        System.out.println("Introduce la vida del heroe 2");
        int vida2=in.nextInt();
        int experiencia2=0;
        int maxVida2=vida2;
        int nivel2=0;
        Hero hero2=new Hero(nombre2,nivel2,vida2,maxVida2,experiencia2,ataque2,defensa2);

        while ((vida1>0)&&(vida2>0)){
            System.out.println("Que quiere hacer el jugador 1?\n1. Ataque\n2. Tomar pocion");
            int eleccion=in.nextInt();
            switch (eleccion){
                case 1:
                    Hero.attack(ataque1,defensa2,vida2,experiencia1,maxVida,vida1,defens1a,nivel1);
                    break;
                case 2:
                    Hero.drinkPotion(vida1);
                    break;
            }
            String estadisticas=Hero.toString(nombre1,vida1,ataque1,defens1a,nivel1);

            System.out.println("Que quiere hacer el jugador 2?\n1. Ataque\n2. Tomar pocion");
            eleccion=in.nextInt();
            switch (eleccion){
                case 1:
                    Hero.attack(ataque2,defens1a,vida1,experiencia2,maxVida2,vida2,defensa2,nivel2);
                    break;
                case 2:
                    Hero.drinkPotion(vida1);
                    break;
        }
            estadisticas=Hero.toString(nombre2,vida2,ataque2,defensa2,nivel2);



        }
    }
}

