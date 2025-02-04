package TEMA4;

import java.util.Random;
import java.util.Scanner;

public class HeroRol {

    public static void main(String[] args) {
        //HEROE
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
        int cantidadPociones=1;
        Hero hero1=new Hero(nombre1,nivel1,vida1,maxVida,experiencia1,ataque1,defens1a);

        //ENEMIGOS
        Random random=new Random();

        int cantidadEnemigos=0;


        //COMBATE
        int numeroCombate=1;
        boolean vivo=true;
        while (vivo==true){
            boolean creacionEnemigos=true;
            int ataqueAleatorio=0;
            int defensaEnemigo=0;
            int vidaAleatorioa=0;
            int defensaAleatorioa=0;
            String nombreEnemigo="";
            int ataqueEnemigo=0;
            int vidaEnemigo=0;
            int nivelEnemigo=0;
            int expericenciaEnemigo=0;
            int maxVidaEmemigo=vidaEnemigo;
            int numeroCreacion=in.nextInt(3);
            int numeroCreacion2=in.nextInt(3);
            while (creacionEnemigos==true){
                cantidadEnemigos++;

                ataqueAleatorio=random.nextInt(hero1.getAttack()/10);
                defensaAleatorioa=random.nextInt(hero1.getDefense()/10);
                vidaAleatorioa=random.nextInt(hero1.getHealth()/10);
                nombreEnemigo="Enemigo 1";
                ataqueEnemigo= hero1.getAttack()-ataqueAleatorio;
                defensaEnemigo=hero1.getDefense()-defensaAleatorioa;
                vidaEnemigo=hero1.getDefense()-vidaAleatorioa;
                creacionEnemigos=false;



                Hero enemigo1=new Hero(nombreEnemigo,nivelEnemigo,vidaEnemigo,maxVidaEmemigo,expericenciaEnemigo,ataqueEnemigo,defensaEnemigo);
                if (numeroCreacion==numeroCreacion2) {
                    cantidadEnemigos++;
                    numeroCreacion = random.nextInt(3);
                    numeroCreacion2 = random.nextInt(3);

                    ataqueAleatorio = random.nextInt(hero1.getAttack() / 10);
                    defensaAleatorioa = random.nextInt(hero1.getDefense() / 10);
                    vidaAleatorioa = random.nextInt(hero1.getHealth() / 10);
                    nombreEnemigo = "Enemigo 2";
                    ataqueEnemigo = hero1.getAttack() - ataqueAleatorio;
                    defensaEnemigo = hero1.getDefense() - defensaAleatorioa;
                    vidaEnemigo = hero1.getDefense() - vidaAleatorioa;

                    Hero enemigo2 = new Hero(nombreEnemigo, nivelEnemigo, vidaEnemigo, maxVidaEmemigo, expericenciaEnemigo, ataqueEnemigo, defensaEnemigo);
                    if (numeroCreacion == numeroCreacion2) {
                        cantidadEnemigos++;

                        ataqueAleatorio = random.nextInt(hero1.getAttack() / 10);
                        defensaAleatorioa = random.nextInt(hero1.getDefense() / 10);
                        vidaAleatorioa = random.nextInt(hero1.getHealth() / 10);
                        nombreEnemigo = "Enemigo 3";
                        ataqueEnemigo = hero1.getAttack() - ataqueAleatorio;
                        defensaEnemigo = hero1.getDefense() - defensaAleatorioa;
                        vidaEnemigo = hero1.getDefense() - vidaAleatorioa;
                        creacionEnemigos = false;

                        Hero enemigo3 = new Hero(nombreEnemigo, nivelEnemigo, vidaEnemigo, maxVidaEmemigo, expericenciaEnemigo, ataqueEnemigo, defensaEnemigo);
                    }
                }
            }
            System.out.println("HORDA 1"+numeroCombate);
            numeroCombate++;
            System.out.println("\nNumero de enemigos: "+cantidadEnemigos+"\n");
            System.out.println("A que enemigo quieres atacar?\nEnemigo 1\nEnemigo 2\n Enemigo 3");
            int eleccionDeAtaque=in.nextInt();
            switch (eleccionDeAtaque){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
            }



        }
    }
}
