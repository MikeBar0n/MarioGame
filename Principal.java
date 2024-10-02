package com.mycompany.principal;

import java.util.*;

public class Principal {

    static Heroe mario;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        mario = new Heroe("Mario", 3, 0, false);
        char tecla = ' ';
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("    Controles de juego");
        System.out.println("  d para avanzar");
        System.out.println("  w para saltar");
        System.out.println("  p para terminar el juego");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        do {
            tecla = scan.next().charAt(0);

            switch (tecla) {
                case 'd':
                    mario.avanzar();
                    break;

                case 'w':
                    mario.saltar();
                    break;

                case 'p':
                    System.out.println("Juego terminado");
            }
        } while (tecla != 'p');
    }
}
