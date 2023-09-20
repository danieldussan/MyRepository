package ejerciciopanaderia;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class EjercicioPanaderia {

    public static void main(String[] args) throws IOException {

        Scanner lectura = new Scanner(System.in);

        ///////file
        File baseDeDatos = new File("panaderia.txt");
        baseDeDatos.createNewFile();
        FileWriter escribir = new FileWriter(baseDeDatos, true);

        System.out.println("Existe : " + baseDeDatos.exists());

        /////variables
        int clientes;
        System.out.println("Cuantos clientes llegaron a la panaderia");
        clientes = lectura.nextInt();
        String nombrePanaderia = "";
        int panArabe;
        int panEspinaca;
        int tortaZanahoria;
        int tortaChocolate;
        int tresLeches;
        int napoleon;
        int formaDePago;
        double subtotal;
        /////vectores
        String[] nombreCliente = new String[clientes];
        int[] cantidadArticulos = new int[clientes];
        int[] panes = new int[clientes];
        int[] tortas = new int[clientes];
        int[] postres = new int[clientes];
        double[] totalPagar = new double[clientes];
        String[] resultado = new String[clientes];


        System.out.println("Ingrese el nombre de la panaderia");
        nombrePanaderia = lectura.next();

        for (int i = 0; i < clientes; i++) {

            System.out.println("Ingrese su nombre");
            nombreCliente[i] = lectura.next();

            System.out.println("Cuantos Pan Arabe desea?");
            panArabe = lectura.nextInt();
            System.out.println("Cuantos Pan de Espinaca desea?");
            panEspinaca = lectura.nextInt();
            System.out.println("Cuantas Tortas de Zanahoria desea?");
            tortaZanahoria = lectura.nextInt();
            System.out.println("Cuantas Tortas de Chocolate desea?");
            tortaChocolate = lectura.nextInt();
            System.out.println("Cuantos postres de Tres Leches desea?");
            tresLeches = lectura.nextInt();
            System.out.println("Cuantos Postres Napoleon desea?");
            napoleon = lectura.nextInt();

            System.out.println("Cual es su forma de pago\n" +
                    "1- Visa\n" +
                    "2- Otra tarjeta \n" +
                    "3- Efectivo");
            formaDePago = lectura.nextInt();


            //cantidad de articulos por cliente
            cantidadArticulos[i] = panArabe + panEspinaca + tortaChocolate + tortaZanahoria + napoleon + tresLeches;
            //subtotal por categoria
            panes[i] = (panArabe * 5000) + (panEspinaca * 4000);
            tortas[i] = (tortaChocolate * 30000) + (tortaZanahoria * 25000);
            postres[i] = (tresLeches * 15000) + (napoleon * 10000);
            //total a pagar
            subtotal = panes[i] + tortas[i] + postres[i];
            if (formaDePago == 1) {
                totalPagar[i] = subtotal * 0.9;
            } else {
                totalPagar[i] = subtotal;
            }
            resultado[i]= (Arrays.toString(nombreCliente)) + (Arrays.toString(cantidadArticulos))+ (Arrays.toString(panes)) + (Arrays.toString(tortas))+(Arrays.toString(postres)) +(Arrays.toString(totalPagar));

        }

        for (int i = 0; i < clientes; i++) {
            System.out.println("------------------Cliente " + (i + 1) + "-----------------");
            System.out.println("Panaderia: " + nombrePanaderia);
            System.out.println("cliente: " + nombreCliente[i]);
            System.out.println("Cantidad de articulos: " + cantidadArticulos[i] + "\n" +
                    "panes: " + panes[i] + "\n" +
                    "tortas: " + tortas[i] + "\n" +
                    "postres: " + postres[i] + "\n" +
                    "total a pagar: " + totalPagar[i]);

        }

//        escribir.write(Arrays.toString(nombreCliente));
//        escribir.write(Arrays.toString(panes));
//        escribir.write(Arrays.toString(tortas));
//        escribir.write(Arrays.toString(postres));
//        escribir.write(Arrays.toString(totalPagar));
        escribir.write("\n");
        escribir.write(Arrays.toString(resultado));
        escribir.write("\n");
        escribir.close();




        System.out.println(Arrays.toString(resultado));
    }

}
