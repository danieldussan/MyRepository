package Ejecicio2;

public class Main {
    public static void main(String[] args) {
        int numeroif = 0;

        if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }
        else if (numeroif > 0) {
            System.out.println("El numero es positivo");
        }
        else
            System.out.println("El numero es 0");


        int numerowhile = 0;

        while (numerowhile < 3) {
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);
        }


        int numerodowhile = 0;

        do {
            System.out.println(numerodowhile);
            numerodowhile = numerodowhile + 1;
        }
            while (numerodowhile > 3);


        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor + 1){
            System.out.println(numerofor);
        }


        var estacion = "primavera";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Esto es no es una estacion");
        }

    }

}