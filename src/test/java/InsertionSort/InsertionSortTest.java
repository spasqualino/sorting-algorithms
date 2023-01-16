package InsertionSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private static final int[] UNSORTED_ARRAY = new int[] { 9, 5 , 4, 3, 7, 1, 8, 2, 6 };
    private static final int[] EXPECTED_RESULT_ARRAY = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private static final String EXPECTED_SORTING_NAME = "Insertion Sort";

    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort(false);
    }

    @Test
    void getSortName() {
        String sortingName = insertionSort.getSortName();
        Assertions.assertEquals(EXPECTED_SORTING_NAME, sortingName);
    }

    @Test
    void execute() {
        int[] result = insertionSort.execute(UNSORTED_ARRAY);
        Assertions.assertArrayEquals(EXPECTED_RESULT_ARRAY, result);
    }
}