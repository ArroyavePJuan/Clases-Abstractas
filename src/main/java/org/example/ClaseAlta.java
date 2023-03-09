package org.example;

public class ClaseAlta extends Sayayin{

    public ClaseAlta() {
    }

    public ClaseAlta(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelar() {
        System.out.println(this.getNombre() + " pelea con elegancia");
    }
}
