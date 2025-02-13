public class InsertionSort < T extends Comparable<T>> implements AlgoritmosSort<T> {

    /**
     * Este metodo se encarga de ordenar un array de datos genericos de menor a mayor.
     * @author: https://www.geeksforgeeks.org/insertion-sort/
     * @param numeros Es el array de enteros que se va a ordenar.
     */

    @Override
    public void sort(T[] array) {

        int n = array.length;
        for (int i = 1; i < n; i++) {
            T key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key, to one 
            position ahead of their current position */

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
}
