package com.company;

public class Main {
    public static void main(String[] args) {

        suma(1 , 2 , 3);

        Coche micoche = new Coche();
        micoche.Ponerpuertas();
        System.out.println("El numero de puertas es:" + micoche.puertas);
    }
    private static void suma(int a, int b, int c) {
    int resultado;
    resultado = a + b + c;
    System.out.println(resultado);
    }
}
class Coche {
    public int puertas = 4;

    public void Ponerpuertas(){
        this.puertas++;
    }
}

