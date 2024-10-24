package condicionales;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        System.out.println("introduce la cantidad de dinero");
        Scanner in= new Scanner(System.in);
        int dinero= in.nextInt();
        System.out.println("pulse 'e' para pasar a euros y 'd' para pasar a dolares");
        String decision = in.next();
        switch (decision){
            case "d":
                double dolares=(dinero*1.08);
                System.out.println("la cantidad introduciuda son "+dolares+" dolares");
                return;
            case "e":
                double euros=(dinero*0.93);
                System.out.println("la cantidad introducida son "+euros+" euros");

        }
    }
}
