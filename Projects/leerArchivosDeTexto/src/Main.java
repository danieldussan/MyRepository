import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader archivo;
        BufferedReader lector;

        archivo = new FileReader("D:\\.DANIEL\\NetBeans-Projects\\EjercicioPanaderia\\panaderia.txt");

        if (archivo.ready()){
            lector = new BufferedReader(archivo);
            String cadena;
            while ((cadena = lector.readLine())!= null){
                System.out.println(cadena);
            }
        }else {
            System.out.println("El archivo no esta listo para ser leido");
        }

    }
}