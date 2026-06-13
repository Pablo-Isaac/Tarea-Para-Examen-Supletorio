import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

    public static void main(String[] args) {

        try {

            FileWriter escritor = new FileWriter("datos.txt");

            escritor.write("Hola mundo desde Java");

            escritor.close();

            System.out.println("Archivo creado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al escribir el archivo.");

        }

    }

}
