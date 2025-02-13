/**
 * Se creo esta interfaz generica <T> para los algoritmos sort.
 * Ademas se implementa "Comparable" para poder comparar elemntos para los metodos sort.
 */

interface AlgoritmosSort<T extends Comparable<T>> {
    void sort(T[] array);
}


//hroughout Heaven and Earth, I alone am honored one.