import java.util.ArrayList;

public class RecorrerLista {

    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("Quito");
        ciudades.add("Guayaquil");
        ciudades.add("Cuenca");

        for (String ciudad : ciudades) {

            System.out.println(ciudad);

        }

    }

}
