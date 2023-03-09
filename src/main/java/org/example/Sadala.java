package org.example;

public class Sadala {
    public static void main(String[] args) {

        System.out.println("Bienvenidos al planeta Sadala malditos insectos!");

        //creando obj clase alta

        ClaseAlta guerrero1 = new ClaseAlta("Vegeta", 90,30,"negro");
        guerrero1.pelar();

        //creando obj clase baja

        ClaseBaja guerrero2 = new ClaseBaja("Kakarotto",80,25,"negro");
        guerrero2.pelar();

    }
}