import java.util.*;

/**
 * Clase que implementa el algoritmo RadixSort, ordenando por su digito menos significativo al mayor.
 */
class RadixSort<T extends Number & Comparable<T>> implements AlgoritmosSort<T> {

    /**
     * Metodo para ordenar un array usando Radix Sort.
     * @author: https://www.geeksforgeeks.org/merge-sort/
     * @param array Es el arreglo de nnmeros que se deben ordenar.
     */
    @Override
    public void sort(T[] array) {
        if (array == null || array.length == 0) return;

        int[] intArray = Arrays.stream(array)
                               .mapToInt(Number::intValue)
                               .toArray();

        int max = Arrays.stream(intArray).max().orElse(0); 
        for (int exp = 1; max / exp > 0; exp *= 10) {
            radixSort(intArray, exp);
        }

        // Convertimos de nuevo el array ordenado a T
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) Integer.valueOf(intArray[i]); 
        }
    }

    /**
     * Metodo que ordena el array segun el dígito en una posición especifica usando Counting Sort.
     * @author: https://www.geeksforgeeks.org/merge-sort/
     * @param array Es el arreglo de enteros que se deben ordenar.
     * @param exp Es el exponente correspondiente a la posicion del dígito actual.
     */
    private void radixSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, array, 0, n);
    }
}








//hroughout Heaven and Earth, I alone am honored one.