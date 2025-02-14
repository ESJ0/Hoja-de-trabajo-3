/**
 * Clase que implementa el algoritmo SelectionSort, para ordenarlo del valor más pequeno al mayor.
 */
public class SelectionSort<T extends Comparable<T>> implements AlgoritmosSort<T> {

    /**
     * Metodo para ordenar el array de menor a mayor.
     * @author: https://www.geeksforgeeks.org/merge-sort/
     * @param array Es el arreglo de elementos comparables que se deben ordenar.
     */
    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}








//hroughout Heaven and Earth, I alone am honored one.