package Base;

import BubbleSort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractBaseTest {

    private AbstractSorting sorting;

    protected abstract AbstractSorting getSorting();

    protected abstract String expectedSortName();

    @BeforeEach
    void setUp() {
        sorting = getSorting();
    }

    @Test
    void getSortName_ReturnsSortName() {
        String sortingName = sorting.getSortName();
        Assertions.assertEquals(expectedSortName(), sortingName);
    }

    @Test
    void sort_UnsortedArray_Returns_SortedArray() {
        int[] unsortedArray = new int[] { 9, 5 , 4, 3, 7, 1, 8, 2, 6 };
        int[] expectedSortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] result = sorting.execute(unsortedArray);
        Assertions.assertArrayEquals(expectedSortedArray, result);
    }

    @Test
    void sort_EmptyArray_Returns_EmptyArray() {
        int[] emptyArray = new int[] {  };
        int[] emptyResultArray = new int[] { };

        int[] result = sorting.execute(emptyArray);
        Assertions.assertArrayEquals(emptyResultArray, result);
    }

    @Test
    void sort_SortedArray_Returns_SortedArray(){
        int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] expectedSortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] result = sorting.execute(sortedArray);
        Assertions.assertArrayEquals(expectedSortedArray, result);
    }

    @Test
    void sort_RepeatedValues_Returns_SortedRepeatedValues() {
        int[] repeatedValuesArray = new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3 };
        int[] expectedSortedArray = new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 };

        int[] result = sorting.execute(repeatedValuesArray);
        Assertions.assertArrayEquals(expectedSortedArray, result);
    }
}
