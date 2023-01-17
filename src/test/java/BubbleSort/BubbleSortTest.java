package BubbleSort;

import Base.AbstractBaseTest;
import Base.AbstractSorting;

class BubbleSortTest extends AbstractBaseTest {
    @Override
    protected AbstractSorting getSorting() {
        return new BubbleSort(false);
    }
    @Override
    protected String expectedSortName() {
        return "Bubble Sort";
    }
}