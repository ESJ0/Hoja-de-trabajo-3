public class MergeSort <T extends Comparable<T>> implements AlgoritmosSort <T> {

    /**
     * Este metodo se encarga de ordenar un array de datos de menor a mayor.
     * Se hicieron modificacione para el uso de datos genericos.
     * Se hicieron modificaciones para que sea solo un método recursivo y no dos como en la pagina de referencia.
     * @author: https://www.geeksforgeeks.org/merge-sort/
     * @param array Es el array de datos que se va a ordenar.
    */

    @Override
    public void sort(T[] array) {

        int n = array.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;

        // Create temp arrays
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[n - mid];

        // Copy data to temp arrays
        for (int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for (int j = 0; j < n - mid; j++) {
            right[j] = array[mid + j];
        }

        // Recursion hasta que el array tenga un solo elemento

        sort(left);
        sort(right);


        // Initial indices of first and second subarrays
        int i = 0, j = 0, k = 0;

        // Initial index of merged subarray array
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        /// Copy remaining elements of L[] if any.
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    
}
