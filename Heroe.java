package com.mycompany.principal;

public class Heroe {

    private String nombre;
    private int vidas;
    private int x;
    private boolean saltando;

    public Heroe(String nombre, int vidas, int x, boolean saltando) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.x = x;
        this.saltando = saltando;
    }

    public void avanzar() {
        this.saltando = false;
        this.x = x + 1;
        if (this.x % 10 != 0){
            System.out.println(this.nombre + " ha avanzado, ahora está en la posicion " + this.x);
        }else{
            if (this.saltando == true){
                this.x = x + 1;
                System.out.println(this.nombre + " ha saltado un obstaculo en la posicion " + this.x);
            }else{
                this.vidas = vidas-1;
                System.out.println(this.nombre + " no ha saltado el obstaculo en la posicion " + this.x + " ahora tiene " + this.vidas + " vidas.");
            }
        }
    }

    public void saltar() {
        saltando = true;
    }
}
