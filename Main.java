import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String archivo = "3000.txt";
        int[] tamanos = {10, 100, 500, 1000, 1200, 1600, 1800, 2000, 2500, 3000}; 


        for(int tamano : tamanos){

            System.out.println("\nTamaño: " + tamano);

            try {
                GeneradorYLecotorDeNumeros.generadorDeNumeros(archivo, tamano);

            } catch (IOException e) {
                e.printStackTrace();
            }
    

            try {

                System.out.println("\n-----------------------InsertionSort----------------------");

                Integer[] numeros = GeneradorYLecotorDeNumeros.LectorDeNumeros(archivo); 
                InsertionSort<Integer> insertionSort = new InsertionSort<>();

                long startTime = System.nanoTime();

            
                insertionSort.sort(numeros);

                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration / 1000000);
                
                System.out.println("\n-----------------------MergeSort--------------------------");
                long startTime2 = System.nanoTime();

                MergeSort<Integer> mergeSort = new MergeSort<>();
                mergeSort.sort(numeros);


                long endTime2 = System.nanoTime();
                long duration2 = endTime2 - startTime2;
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration2);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration2 / 1000000);

                System.out.println("\n-----------------------QuickSort--------------------------");
                long startTime3 = System.nanoTime();
                
                QuickSort<Integer> quickSort = new QuickSort<>();
                quickSort.sort(numeros);

                long endTime3 = System.nanoTime();
                long duration3 = endTime3 - startTime3;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration3);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration3 / 1000000);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}