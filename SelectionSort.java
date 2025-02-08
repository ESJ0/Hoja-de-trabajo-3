/**
 * Clase que implementa el algoritmo SelectionSort, para ordenarlo del valor mas pequeno al mayor.
 */

public class SelectionSort implements AlgoritmosSort<Integer>{

    /**
     * Metodo para ordenar el array de menor a mayor.
     */
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Integer temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}







//hroughout Heaven and Earth, I alone am honored one.