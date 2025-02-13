import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            GeneradorYLecotorDeNumeros.generadorDeNumeros("1000.txt", 1000);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            System.out.println("\n-----------------------InsertionSort----------------------");

            Integer[] numeros = GeneradorYLecotorDeNumeros.LectorDeNumeros("1000.txt"); 
            InsertionSort<Integer> insertionSort = new InsertionSort<>();

            long startTime = System.nanoTime();

        
            insertionSort.sort(numeros);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Tiempo de ejecución (nanosegundos): " + duration);
            System.out.println("Tiempo de ejecución (milisegundos): " + duration / 1000000);
            
            System.out.println("\n-----------------------MergeSort--------------------------");
            long startTime2 = System.nanoTime();

            MergeSort<Integer> mergeSort = new MergeSort<>();
            mergeSort.sort(numeros);


            long endTime2 = System.nanoTime();
            long duration2 = endTime2 - startTime2;
            System.out.println("Tiempo de ejecución (nanosegundos): " + duration2);
            System.out.println("Tiempo de ejecución (milisegundos): " + duration2 / 1000000);



        } catch (IOException e) {
            e.printStackTrace();
        }

        





    


    

    }
}