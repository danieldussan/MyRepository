import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);

        /////Variables,Vectores y Matrices
        System.out.println("Ingrese numero de estudiantes");
        int nEstudiantes;
        nEstudiantes = lectura.nextInt();
        double totalAhorro = 0;
        double acuTotal = 0;
        double acuPromGeneral = 0;
        double promGeneral = 0;
        double ahorroAltoMes = 0;
        double ahorroBajoMes = 0;
        double ahorroAltoEstudiante = 0;
        double ahorroBajoEstudiante = 0;
        double acuMes = 0;
        double acuEstudiante = 0;
        String[] meses = {"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String[] nombreEstudiantes = new String[nEstudiantes];
        double[] promMes = new double[6];
        double[] promEstudiante = new double[nEstudiantes];
        double[][] ahorros = new double[6][nEstudiantes];


////////Codigo
        PrintWriter file = new PrintWriter(new FileWriter("registro.txt", true));

        System.out.println("Ingrese nombre de los estudiantes");
        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("Nombre del estudiante #" + (i + 1));
            nombreEstudiantes[i] = lectura.next();
        }

        System.out.println("Ingrese el ahorro por meses");
        for (int i = 0; i < 6; i++) {
//            System.out.println(meses[i]+":");
            for (int j = 0; j < nEstudiantes; j++) {
                System.out.println(meses[i] + " de " + nombreEstudiantes[j]);
                ahorros[i][j] = lectura.nextDouble();
            }
        }
///////promedio meses
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < nEstudiantes; j++) {
                acuMes = acuMes + ahorros[i][j];
            }
            promMes[i] = acuMes / nEstudiantes;
            acuMes = 0;
        }
////////promedio estudiantes
        for (int j = 0; j < nEstudiantes; j++) {
            for (int i = 0; i < 6; i++) {
                acuEstudiante = acuEstudiante + ahorros[i][j];
            }
            promEstudiante[j] = acuEstudiante / 6;
            acuEstudiante = 0;
        }
///////promedio general
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < nEstudiantes; j++) {
                acuPromGeneral = promGeneral + ahorros[i][j];
            }
        }
        promGeneral = acuPromGeneral / (nEstudiantes * 6);
//////////ahorro mas alto mes
        for (int i = 0; i < promMes.length; i++) {
            if (promMes[i] > ahorroAltoMes) {
                ahorroAltoMes = promMes[i];
            }
        }
//////ahorro mas alto estudiante
        for (int i = 0; i < promEstudiante.length; i++) {
            if (promEstudiante[i] > ahorroAltoEstudiante) {
                ahorroAltoEstudiante = promEstudiante[i];
            }
        }
/////////ahorro mas bajo mes
        for (int i = 0; i < promMes.length; i++) {
            if (promMes[i] < ahorroBajoMes) {
                ahorroBajoMes = promMes[i];
            }
        }
///////ahorro mas bajo estudiante
        for (int i = 0; i < promEstudiante.length; i++) {
            if (promEstudiante[i] < ahorroBajoEstudiante) {
                ahorroBajoEstudiante = promEstudiante[i];
            }
        }
//////acumulado total
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < nEstudiantes; j++) {
                acuTotal = acuTotal + ahorros[i][j];
            }
        }
        totalAhorro = acuTotal;

        ///////mostrar promedio por meses
        System.out.println("--------------------------");
        System.out.println("Promedio de ahorro por mes");
        for (int i = 0; i < 6; i++) {
            System.out.println("En el mes de " + meses[i] + " el promedio de ahorro fue: " + promMes[i]);
        }
        ///////mostrar promedio por estudiante
        System.out.println("--------------------------");
        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("El promedio del estudiante " + nombreEstudiantes[i] + " fue: " + promEstudiante[i]);
        }

    }
}