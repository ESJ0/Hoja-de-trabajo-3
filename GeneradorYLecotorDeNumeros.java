import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase creada para el metodo de generacion de numeros random que se guaradaran en un archivo. Ademas, de la
 * creacion del metodo de lectura del archivo, donde se guardaron los datos creados.
 */

public class GeneradorYLecotorDeNumeros {

    /**
     * Este metodo se va a encargar de crear numeros random de 0 a 3000.
     * @param nombreDelArchivo Este es el nombre del archivo donde se guadaran los datos.
     * @param contador Es la cantidada de numeros random a generar.
     * @throws IOException Marca una execpcion si ocurre un error al escribir los datos en el archivo.
     */
    public static void generadorDeNumeros(String nombreDelArchivo, int contador) throws IOException {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreDelArchivo))) {
            for (int i = 0; i < contador; i++) {
                writer.write(random.nextInt(3001) + "\n");
            }
        }
    }

    /**
     * Este metedo se encarga de leer los numeros almacendados y retonarlos en un array.
     * @param nombreDelArchivo Este es el nombre del archivo donde se estaran leyendo los datos.
     * @return Un array de enteros.
     * @throws IOException Marca una exepcion si al leer el archivo hay datos que no sean enteros.
     */
    public static Integer[] LectorDeNumeros(String nombreDelArchivo) throws IOException {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreDelArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }
        }
        return numeros.toArray(new Integer[0]);
    }
    
}







//You have no enemies. No one in the world is your enemy. There is no one you need to hurt.