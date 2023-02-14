package Open.Bootcamp;

public class Ciclos {
    public static void main(String[] args) {
        int contador = 10;
        while (contador > 0) {
        System.out.println("contador vale:"+ contador);
            contador = contador-1;
            // La forma corta es "contador--;" si quieres restar un numero mas grande "contador -=5"
        }
        int numerodowhile = 0;

        do {
            System.out.println(numerodowhile);
            numerodowhile = numerodowhile + 1;
        }
        while (numerodowhile > 3);


    }
}