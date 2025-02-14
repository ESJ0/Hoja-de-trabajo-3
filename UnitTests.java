import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;



public class UnitTests {

    private MergeSort<Integer> mergeSort;
    private InsertionSort<Integer> insertionSort;
    private QuickSort<Integer> quickSort;
    private Integer[] array;
    private Integer[] expected;

    @Before
    public void setUp() {
        mergeSort = new MergeSort<>();
        insertionSort = new InsertionSort<>();
        quickSort = new QuickSort<>(); 
        array = new Integer[]{ 6,5,8,7,2,1,3,10,9,4};
        expected = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        
    }

    @Test
    public void shouldBeAbletoMergeSort() {
        mergeSort.sort(array); 
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], expected[i]);
        }
    }

    @Test
    public void shouldBeAbletoInsertSort() {
        insertionSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], expected[i]);
        }
    }

    @Test
    public void shouldBeAbletoQuickSort() {
        quickSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], expected[i]);
        }
    }





    
}
