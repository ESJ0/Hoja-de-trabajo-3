import java.util.*;

/**
 * Clase que implementara el algoritmo RadixSort, para ordenarlo por su signo menos significativo al mayor.
 */

class RadixSort implements AlgoritmosSort<Integer> {

    /**
     * Metodo de utilidad para obtener el valor maximo en el array.
     * @param array Es el arreglo de enteros que se deben ordenar.
     */
    @Override
    public void sort(Integer[] array) {
        int max = Arrays.stream(array).max(Integer::compare).orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    /**
     * Metodo que se encarga de ordennar por cuentas el array en funcion del digito en una posicion especifica.
     * @param array Es el arreglo de enteros que se deben ordenar.
     * @param exp Es el exponente correspondiente a la posicion del digito actual.
     */
    private void countingSort(Integer[] array, int exp) {
        int n = array.length;
        Integer[] output = new Integer[n];
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