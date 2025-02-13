import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            GeneradorYLecotorDeNumeros.generadorDeNumeros("1000.txt", 1000);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            long startTime = System.nanoTime();


            Integer[] numeros = GeneradorYLecotorDeNumeros.LectorDeNumeros("1000.txt"); 
            InsertionSort<Integer> insertionSort = new InsertionSort<>();
            insertionSort.sort(numeros);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Tiempo de ejecución (nanosegundos): " + duration);
            System.out.println("Tiempo de ejecución (milisegundos): " + duration / 1000000);
            System.out.println("Tiempo de ejecución (segundos): " + duration / 1000000000);




        } catch (IOException e) {
            e.printStackTrace();
        }

        





    


    

    }
}