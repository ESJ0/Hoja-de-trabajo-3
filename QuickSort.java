public class QuickSort <T extends Comparable<T>> implements AlgoritmosSort<T> {

    /**
     * Este metodo se encarga de ordenar un array de datos genericos de menor a mayor.
     * Se hicieron modificaciones para uso de datos genericos.
     * @author https://www.geeksforgeeks.org/quick-sort-algorithm/
     * @param array Es el array de datos que se va a ordenar.
     */

    @Override
    //Sort function
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private int partition(T[] array, int low, int high) {
        // Choose the pivot
        T pivot = array[high];
        // Index of the smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        // Traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        // Move pivot after smaller elements and
        // return its position
        swap(array, i + 1, high);
        return i + 1;
    }

    // Swap function
    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //QuickSort function
    private void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    

    






    



    
    
}
