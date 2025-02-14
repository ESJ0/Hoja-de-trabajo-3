import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String archivo = "3000.txt";
        int[] tamanos = {10, 100, 500, 1000, 1200, 1600, 1800, 2000, 2500, 3000}; 


        for(int tamano : tamanos){
            System.out.println("\n-----------------------Datos sin ordenados----------------------");
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

                System.out.println("\n-----------------------RadixSort--------------------------");
                long startTime4 = System.nanoTime();
                
                RadixSort<Integer> radixSort = new RadixSort<>();
                radixSort.sort(numeros);

                long endTime4 = System.nanoTime();
                long duration4 = endTime4 - startTime4;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration4);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration4 / 1000000);

                System.out.println("\n-----------------------SelectionSort--------------------------");
                SelectionSort<Integer> selectionSort = new SelectionSort<>();
                selectionSort.sort(numeros);

                long endTime5 = System.nanoTime();
                long duration5 = endTime5 - startTime;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration5);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration5 / 1000000);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        for(int tamano : tamanos){

            System.out.println("\n-----------------------Datos ya ordenados----------------------");
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
                insertionSort.sort(numeros);
                long duration = endTime - startTime;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration / 1000000);
                
                System.out.println("\n-----------------------MergeSort--------------------------");
                long startTime2 = System.nanoTime();

                MergeSort<Integer> mergeSort = new MergeSort<>();
                mergeSort.sort(numeros);


                long endTime2 = System.nanoTime();
                mergeSort.sort(numeros);
                long duration2 = endTime2 - startTime2;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration2);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration2 / 1000000);

                System.out.println("\n-----------------------QuickSort--------------------------");
                long startTime3 = System.nanoTime();
                
                QuickSort<Integer> quickSort = new QuickSort<>();
                quickSort.sort(numeros);

                long endTime3 = System.nanoTime();
                quickSort.sort(numeros);
                long duration3 = endTime3 - startTime3;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration3);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration3 / 1000000);

                System.out.println("\n-----------------------RadixSort--------------------------");
                long startTime4 = System.nanoTime();
                
                RadixSort<Integer> radixSort = new RadixSort<>();
                radixSort.sort(numeros);

                long endTime4 = System.nanoTime();
                radixSort.sort(numeros);
                long duration4 = endTime4 - startTime4;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration4);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration4 / 1000000);

                System.out.println("\n-----------------------SelectionSort--------------------------");
                SelectionSort<Integer> selectionSort = new SelectionSort<>();
                selectionSort.sort(numeros);

                long endTime5 = System.nanoTime();
                selectionSort.sort(numeros);
                long duration5 = endTime5 - startTime;

                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (nanosegundos): " + duration5);
                System.out.println("Cantidad de datos: " +tamano+ " .En un tiempo de ejecución (milisegundos): " + duration5 / 1000000);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}