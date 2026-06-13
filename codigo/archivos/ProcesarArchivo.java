import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesarArchivo {

    public static void main(String[] args) {

        int contador = 0;

        try {

            BufferedReader lector = new BufferedReader(
                    new FileReader("datos.txt")
            );

            while (lector.readLine() != null) {

                contador++;

            }

            lector.close();

            System.out.println("Cantidad de lineas: " + contador);

        } catch (IOException e) {

            System.out.println("Error al procesar el archivo.");

        }

    }

}
